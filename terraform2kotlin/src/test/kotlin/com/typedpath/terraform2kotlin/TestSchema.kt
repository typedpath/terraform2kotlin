package com.typedpath.terraform2kotlin

import com.sun.org.apache.bcel.internal.util.SecuritySupport.getResourceAsStream
import jdk.nashorn.api.scripting.ScriptObjectMirror
import org.junit.Test

class TestSchema {
    @Test
    fun test() {
       val isJson = getResourceAsStream("aws_terraform.json")
        println("isJson" + isJson)
        val str = isJson.bufferedReader().readText()
        println(str.substring(0, 1000))
        var json = stringToJson(str)
        json = (json.get("provider_schemas") as ScriptObjectMirror).get("aws") as ScriptObjectMirror
        var resourceSchemas = (json as ScriptObjectMirror).get("resource_schemas") as ScriptObjectMirror
        var aws_s3_bucket = (resourceSchemas).get("aws_s3_bucket")
        var aws_eks_cluster = (resourceSchemas).get("aws_eks_cluster")
        var aws_autoscaling_policy = (resourceSchemas).get("aws_autoscaling_policy")


        //println(aws_s3_bucket)


    }

}