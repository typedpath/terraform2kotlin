package com.typedpath.terraform2kotlin

import jdk.nashorn.api.scripting.ScriptObjectMirror
import javax.script.ScriptEngineManager

@Throws(Exception::class)
fun stringToJson(strJson: String): ScriptObjectMirror {
    val json = "var result = $strJson; result;"
    val factory = ScriptEngineManager()
    val engine = factory.getEngineByName("JavaScript")
    return engine.eval(json) as ScriptObjectMirror
}

@Throws(Exception::class)
fun printJsonObject(jsonObject: String) {
    val result = stringToJson(jsonObject)
    println(result.javaClass.name + "::" + result)
    print("", result)
}

fun print(indent: String, to: ScriptObjectMirror) {
    for ((key, value) in to) {
        if (value != null && value is ScriptObjectMirror) {
            println(indent + value.className + "::" + key + "==")
            print("$indent  ", value)
        } else {
            println("$indent$key==$value")
        }
    }
}

fun isSimple (o: Any) : Boolean {
   val theClass = o.javaClass
    return !theClass.name.startsWith("com.typedpath")//!theClass.name.startsWith("kotlin") && !theClass.name.startsWith("java")
}

//cheap and cheerful json serialization!?!?!

const val jsonIndentStep: String = "  "

private fun printSimpleAsJson(simple: Any) : String {
    return "\"" + simple + "\""
}

private fun printPropertyAsJson(name: String, value: Any, indent: String) : String{
    val buffer =  StringBuffer()
    if (value is Map<*, *>) {
        if (value.size>0) {
            buffer.append(indent + name + " = ")
            buffer.append("{" )
            buffer.append( value.map {
                (printPropertyAsJson("${it.key}", it.value as Any, indent+ jsonIndentStep) )
                    }.joinToString ( "," + System.lineSeparator() ))
            buffer.append("}" )
        }
    }
    else if (value is List<*>) {
        if (value.size>0) {
            buffer.append(indent + name + " = ")
            buffer.append("[ " )
            buffer.append( value.map { toJson(it!!, indent + jsonIndentStep ) }
                .joinToString("," + System.lineSeparator()))
            buffer.append(" ]" )
        }
    }
    else if (isSimple(value)) {
        buffer.append(indent + name + " = " + printSimpleAsJson(value))
    }
    else buffer.append(indent + name + " = " + toJson(value, indent+jsonIndentStep))
    //println("**** printPropertyAsJson $name:${value.javaClass.name} -> ${buffer.toString()}")
    return buffer.toString()
}

fun toJson(o: Any, indentIn: String ="") : String {
    var indent = indentIn

    if (isSimple(o)) {
        return printSimpleAsJson(o)
    }

    val buffer = StringBuffer()
    buffer.append(indentIn + "{")
    buffer.append(System.lineSeparator())
    indent = indent + jsonIndentStep

    val psAsString = getProperties(o).map {
        printPropertyAsJson(it.key, it.value, indent)
    }.filter{ it.length>0}.joinToString ("," + System.lineSeparator())
  //  println("psAsString:" + psAsString + ":psAsStringEnd")
    buffer.append(psAsString
    )
    buffer.append(System.lineSeparator() + indentIn + "}" )
    return buffer.toString()
}

