package com.typedpath.terraform2kotlin

import kotlin.reflect.KVisibility
import kotlin.reflect.full.memberProperties


private const val refPrefix= "_#_#"
private const val dependsOnPropertyName = "depends_on"


private val stringToRef = mutableMapOf<String, Pair<Any, String>>()
//TODO enforce names are globally unique
private val object2Name = mutableMapOf<Any, String>()

fun ref(o: Any, propertyName: String, subPath: String = "") : String {
    val strRef = refPrefix +  stringToRef.size
    stringToRef.put(strRef, Pair(o, propertyName+subPath))
    return strRef
}

fun toTerraform(template: TerraformTemplate) : String {
return (
"""${printDataProperties(template)}
${printResourceProperties(template)}
${printOutputProperties(template)}    
${printProviderProperties(template)}    
${printLocals(template)}  
""")
}

private fun printDataProperties(template: TerraformTemplate) : String {
    fun isResource ( n: String, o: Any) = o is Resource && "data".equals(o.typestring())
    val properties = getTemplateProperties(template, ::isResource)
    return (
            """${properties.entries.map{(
                    """
data "${it.value?.javaClass?.simpleName}" "${it.key}" ${printValue(it.value!!, indentStep, it.key, true, false)}
""")}.joinToString (
                """
""" )
            }""")
}

private fun printResourceProperties(template: TerraformTemplate) : String {
    fun isResource (n: String, o: Any) = o is Resource && "resource".equals(o.typestring())
    val properties = getTemplateProperties(template, ::isResource)
    return (
            """${properties.entries.map{(
                    """
resource "${it.value?.javaClass?.simpleName}" "${it.key}" ${printValue(it.value!!, indentStep, it.key, true, false)}
""")}.joinToString (
                """
""" )
            }""")
}

private fun printOutputProperties(template: TerraformTemplate) : String {
    fun filter (n: String, o: Any) = o is Output
    return printProperties(template, "output", ::filter)
}

private fun printProviderProperties(template: TerraformTemplate) : String {
    fun filter (n: String, o: Any) = o is Provider
    return printProperties(template, "provider", ::filter)
}

private fun printLocals(template: TerraformTemplate) : String {
    fun filter (n: String, o: Any) = n.equals("locals")
    val topLevelProperties = getTemplateProperties(template, ::filter)
    val properties = mutableMapOf<String, Any>()
    topLevelProperties.forEach {
            t, u ->
        if (isComplex(u)) {
            getProperties(u).forEach { properties.put(it.key, it.value)  }
        } else if (u is Map<*, *>) {
            u.entries.forEach { properties[it.key as String] = it.value as Any }
        } else {
            properties.put(t, u)
        }
    }

    if (properties.size ==0) {
        return ""
    }

    return (

            """locals {${properties.entries.map{(
                    """
${printValue(it.value!!, indentStep, it.key, false)}
""")}.joinToString (
                """
""" )
            }
            }""")
    //return printProperties(template, "provider", ::filter)
}


private fun printProperties(template: TerraformTemplate,  typename: String, filter: (String, Any)->Boolean) : String {
    val properties = getTemplateProperties(template, filter)
    return (
            """${properties.entries.map{(
                    """
$typename "${it.key}" ${printValue(it.value!!, indentStep, it.key, false, false )}
""")}.joinToString (
                """
""" )
            }""")
}

private fun isComplex(value: Any?): Boolean = value != null &&
        value.javaClass.name.startsWith("com.typedpath") && !value.javaClass.isEnum

private fun printMap(map: Map<*,*>, indent: String, nameDelimiter: String = "") : String {
    return (
            """${map.map{
                """${indent}${printValue(it.value as Any, indent + indentStep, (nameDelimiter + it.key + nameDelimiter) )}"""
            }.joinToString ("""
""")
            }""")
}

private fun printList(list: List<*>, indent: String) : String {
    return list.map{ printValue(it as Any, indent, null, false, false)}.joinToString ( ", " )
}

private fun printObject(name: String?, o: Any,  indent: String) : String {
    if (name !=null)  object2Name.put(o, name)
    return printMap(getProperties(o), indent, "")
}

private fun printSimpleValue(o: Any) : String {
    return if (o is String && stringToRef.containsKey(o)) {
        val refPair = stringToRef.get(o)
        if (!object2Name.containsKey(refPair!!.first)) {
            throw Exception("cant resolve ref $refPair" )
        }
        val name = object2Name.get(refPair!!.first)
        return "${refPair.first.javaClass.simpleName}.${name}${if (refPair.second.length==0) "" else ("." + refPair.second)}"
    } else  if (o is String || o.javaClass.isEnum) """"$o"""" else  "$o"
}

private val indentStep = "  "

private fun printValue(oIn: Any,  indent: String, name: String?=null, quoteName: Boolean = false, useNameInitialiser: Boolean=true) : String{
    var o = oIn
    if (name.equals( dependsOnPropertyName)) {
        val oListRes = (o as List<Resource>)
        if (oListRes==null || oListRes.size==0) {
            throw java.lang.Exception("$dependsOnPropertyName must be non empty list of Resource")
        }
        o = oListRes.map{ref(it, "")}
        //return printList(oListRef, indent)
    }
    val nameDelimiter = if (quoteName) "\"" else ""
    val nameInitialiser = if (!useNameInitialiser) " " else "$nameDelimiter$name$nameDelimiter = "
    return if (o is Map<*,*>) {
        "$nameInitialiser{" + System.lineSeparator()  + printMap(o, indent + indentStep, "\"") + System.lineSeparator() + indent + "}"
    } else if (o is List<*>) {
          val attributeAsBlocks = name!=null && o.size>0 && isComplex(o.get(0))
         if (attributeAsBlocks) {
             o.map { """
${indent}$name { 
${printObject(name, it as Any, indent+ indentStep)}
$indent}""" }.joinToString("")
         } else
         "$nameInitialiser [" + printList(o, indent) + "]"
    } else if (isComplex(o)) {
         "$nameInitialiser {" + System.lineSeparator()  + printObject(name, o, indent + indentStep) + System.lineSeparator() + indent +  "}"
    } else {
        "$nameInitialiser ${printSimpleValue(o)}"
    }
}

fun getProperties(resource: Any) : Map<String, Any> {
    return resource.javaClass.kotlin.memberProperties
        .filter { p ->
            p.visibility == KVisibility.PUBLIC
        }
        .map { Pair(it.name, it.getter.call(resource)) }
        .filter {it.second != null}
        .map {Pair(it.first,  it.second as Any)}
        .toMap()
}

 fun getTemplateProperties(template: TerraformTemplate, filter: (String, Any)->Boolean) : Map<String, Any> {
    var resources = mutableMapOf<String, Any>()
    template.javaClass.kotlin.memberProperties.map { Pair(it, it.get(template)) }
        .filter { it.second != null }
        .filter { filter(it.first.name, it.second!!)}
        .map { Pair(it.first.name, it.second as Any)}
        .toMap(resources)
    return resources
}
