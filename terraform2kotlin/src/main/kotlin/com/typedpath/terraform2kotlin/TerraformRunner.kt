package com.typedpath.terraform2kotlin

import jdk.nashorn.api.scripting.ScriptObjectMirror
import java.io.File

class TerraformAWSRunner(val template: TerraformTemplate, val accessKey: String, val secretKey: String, val region: String) {
    var tempDir: File? = null

    fun initApply() : Map<String, String> {
        // make tmp dir
        tempDir = createTempDir("terraformTest/${javaClass.name}")
        println("running in directory ${tempDir?.absolutePath}")
        File(tempDir, "provider.tf").writeText(
"""provider "aws" {
  access_key="$accessKey"
  secret_key = "$secretKey"
  region = "$region"
}
""")
        File(tempDir, "main.tf").writeText(toTerraform(template))
        val initResult = "terraform init".runCommand(tempDir!!)
        println("terraform init result: $initResult")
        val planResult = "terraform plan".runCommand(tempDir!!)
        println("terraform plan result: $planResult")
        val applyResult = "terraform apply -auto-approve".runCommand(tempDir!!)
        println("terraform apply result: $applyResult")
        return readOutputsFromTfState(tempDir!!)
    }

    fun destroy() {
        val destroyResult  = "terraform destroy -auto-approve".runCommand(tempDir!!)
        println(destroyResult)
    }

}

fun readOutputsFromTfState(tempDir: File) : Map<String, String> {
    val strTfState = File(tempDir, "terraform.tfstate").readText()
    val json = stringToJson(strTfState)
    val outputs = json.get("outputs") as ScriptObjectMirror
    return outputs.keys.map { Pair(it!!, ""+(outputs.get(it) as ScriptObjectMirror).get("value")) }.toMap()
}

//TODO deprecate this - use tfstate instead
fun readOutputsFromApplyOutput(applyOutput: String): Map<String, String> {
    val outputsIndex = applyOutput.indexOf("Outputs:")
    val outputs = mutableMapOf<String, String>()
    if (outputsIndex > 0) {
        val errorsIndex = applyOutput.indexOf("errors", outputsIndex)
        if (errorsIndex > 0) {
            val strOutputs = applyOutput.subSequence(outputsIndex + "Outputs:".length, errorsIndex).trim()
            //println(strOutputs)
            val lines = strOutputs.split("\r", "\n")
            var index = 0
            while (index < lines.size) {
                val line = lines.get(index).trim()
                val eqIndex = line.indexOf("=")
                if (eqIndex > 0) {
                    val name = line.substring(0, eqIndex).trim()
                    var lineValue = line.substring(eqIndex + 1).trim()
                    index++
                    while (index < lines.size && lines[index].indexOf("=") < 0 && lines[index++].trim().length > 0) {
                        lineValue = lineValue + lines[index].trim()
                    }
                    outputs.put(name, lineValue)
                } else index++
            }
        }
    }
    return outputs
}
