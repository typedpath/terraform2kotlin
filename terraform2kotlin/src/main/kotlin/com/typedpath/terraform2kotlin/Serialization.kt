package com.typedpath.terraform2kotlin

import kotlin.reflect.KVisibility
import kotlin.reflect.full.memberProperties

fun toTerraform(template: TerraformTemplate) : String {
return (
"""${printResourceProperties(template, Resource::class.java)}
${printOutputProperties(template, Output::class.java)}    
""")
}

private fun printResourceProperties(template: TerraformTemplate, theClass: Class<*>) : String {
    val properties = getTemplateProperties(template, theClass)
    return (
            """${properties.entries.map{(
                    """
resource "${it.value?.javaClass?.simpleName}" "${it.key}" ${printValue(it.value!!, indentStep)}
""")}.joinToString (
                """
""" )
            }""")
}

private fun printOutputProperties(template: TerraformTemplate, theClass: Class<*>) : String {
    val properties = getTemplateProperties(template, theClass)
    return (
            """${properties.entries.map{(
                    """
output "${it.key}" ${printValue(it.value!!, indentStep)}
""")}.joinToString (
                """
""" )
            }""")
}

private fun isComplex(value: Any?): Boolean = value != null &&
        value.javaClass.name.startsWith("com.typedpath")

private fun printMap(map: Map<*,*>, indent: String) : String {
    return (
            """${map.map{
                """${indent}${printValue(it.value as Any, indent + indentStep, it.key as String)}"""
            }.joinToString ("""
""")
            }""")
}

private fun printList(list: List<*>, indent: String) : String {
    return list.map{ printValue(it as Any, indent)}.joinToString ( ", " )
}

private fun printObject(o: Any,  indent: String) : String {
    return printMap(getProperties(o), indent)
}

private fun printSimpleValue(o: Any) : String {
    return if (o is String) """"$o"""" else  "$o"
}

private val indentStep = "  "

private fun printValue(o: Any,  indent: String, name: String?=null) : String{
    val nameInitialiser = if (name==null) " " else "$name = "
    return if (o is Map<*,*>) {
        "$nameInitialiser{" + System.lineSeparator()  + printMap(o, indent + indentStep) + System.lineSeparator() + indent + "}"
    } else if (o is List<*>) {
          val attributeAsBlocks = name!=null && o.size>0 && isComplex(o.get(0))
         if (attributeAsBlocks) {
             o.map { """
${indent}$name { 
${printObject(it as Any, indent+ indentStep)}
$indent}""" }.joinToString("")
         } else
         "$nameInitialiser [" + printList(o, indent) + "]"
    } else if (isComplex(o)) {
         "$nameInitialiser {" + System.lineSeparator()  + printObject(o, indent + indentStep) + System.lineSeparator() + indent +  "}"
    } else {
        "$nameInitialiser ${printSimpleValue(o)}"
    }
}

private fun getProperties(resource: Any) : Map<String, Any> {
    return resource.javaClass.kotlin.memberProperties
        .filter { p ->
            p.visibility == KVisibility.PUBLIC
        }
        .map { Pair(it.name, it.getter.call(resource)) }
        .filter {it.second != null}
        .map {Pair(it.first,  it.second as Any)}
        .toMap()
}

private fun getTemplateProperties(template: TerraformTemplate, theClass: Class<*>) : Map<String, Any> {
    var resources = mutableMapOf<String, Any>()
    template.javaClass.kotlin.memberProperties.map { Pair(it, it.get(template)) }
        .filter { it.second != null }
        .filter { theClass.isAssignableFrom(it.second?.javaClass)!! }
        .map { Pair(it.first.name, it.second as Any)}
        .toMap(resources)
    return resources
}