package com.typedpath.terraform2kotlin

import kotlin.reflect.KProperty1

open class TerraformTemplate(var scope: String?=null) {

    fun <T> ref(prop: KProperty1<Any, T>) : T  = prop.returnType.javaClass.newInstance() as T

    fun scopeName(name: String?) = if (name==null || scope == null) name else "$scope-$name"

    fun escapeMultiLine(str: String) : String =
        str.replace("\"", "\\\"")
            .replace("\n","\\n")
            .replace("\r","")

    fun format(iamPolicy: IamPolicy) = "<<POLICY${System.lineSeparator()}${toJson(iamPolicy)}${ System.lineSeparator()}POLICY"


}