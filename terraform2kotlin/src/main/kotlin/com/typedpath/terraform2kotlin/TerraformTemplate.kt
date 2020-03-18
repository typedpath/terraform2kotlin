package com.typedpath.terraform2kotlin

import com.typedpath.terraform2kotlin.aws.schema.aws_instance
import kotlin.reflect.KProperty1

open class TerraformTemplate {
    fun <T> ref(prop: KProperty1<Any, T>) : T {
         val placeholder : T = prop.returnType.javaClass.newInstance() as T
         return placeholder
    }

    fun escapeMultiLine(str: String) : String =
        str.replace("\"", "\\\"")
            .replace("\n","\\n")
            .replace("\r","")

    fun format(iamPolicy: IamPolicy) = "<<POLICY${System.lineSeparator()}${toJson(iamPolicy)}${ System.lineSeparator()}POLICY"


}