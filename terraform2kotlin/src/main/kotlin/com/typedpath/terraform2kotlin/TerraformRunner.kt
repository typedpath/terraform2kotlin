package com.typedpath.terraform2kotlin

import jdk.nashorn.api.scripting.ScriptObjectMirror
import java.io.File
import java.lang.Exception
import kotlin.reflect.KMutableProperty
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.memberProperties

class TerraformAWSRunner( val accessKey: String,
                          val secretKey: String,
                          val region: String,
                          val runDir: File,
                          vararg templatesIn: TerraformTemplate) {

    val templates  = templatesIn

    private fun toFileName(template: TerraformTemplate) =
        (if (template.scope!=null) (template.scope+"-") else "") + template.javaClass.simpleName + ".tf"

    fun initApply() : Map<String, String> {

        println("running in directory ${runDir?.absolutePath}")
        File(runDir, "provider.tf").writeText(
"""provider "aws" {
  access_key="$accessKey"
  secret_key = "$secretKey"
  region = "$region"
}
""")
        templates.forEach {
            File(runDir, toFileName(it)).writeText(toTerraform(it))
        }
        val initResult = "terraform init".runCommand(runDir!!)
        println("terraform init result: $initResult")
        val planResult = "terraform plan".runCommand(runDir!!)
        println("terraform plan result: $planResult")
        val applyResult = "terraform apply -auto-approve".runCommand(runDir!!)
        println("terraform apply result: $applyResult")
        return readOutputsFromTfState(runDir!!)
    }

    fun destroy() {
        val destroyResult  = "terraform destroy -auto-approve".runCommand(runDir!!)
        println(destroyResult)
    }

}

fun readOutputsFromTfState(tempDir: File) : Map<String, String> {
    val strTfState = File(tempDir, "terraform.tfstate").readText()
    val json = stringToJson(strTfState)
    val outputs = json.get("outputs") as ScriptObjectMirror
    return outputs.keys.map { Pair(it!!, ""+(outputs.get(it) as ScriptObjectMirror).get("value")) }.toMap()
}

fun autoTag(resource: Resource, name: String) {
    val tagProperty = resource.javaClass.kotlin.memberProperties.filter { it.name.equals("tags") }.firstOrNull()
    if (tagProperty!=null) {
        try {
            val existingTags = tagProperty.get(resource)
            val newTags =  if (existingTags!=null)  (existingTags as Map<String, String>).toMutableMap()  else mutableMapOf()
            if (!newTags.containsKey("Name")) {
                newTags.put("Name", resource.javaClass.simpleName + "::" + name)
                (tagProperty as KMutableProperty1<Resource, Map<String, String>>)!!.set(resource, newTags)
            }
        } catch (ex: Exception) {
            error("cant tag ${resource} because ${ex}")
        }
    }
}

fun autoTag(template: TerraformTemplate) {
    fun isResource(n: String, a: Any) = a is Resource
    getTemplateProperties(template, ::isResource).forEach{
        autoTag(it.value as Resource, it.key)
    }


}

