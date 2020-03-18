package com.typedpath.terraform2kotlin

import org.junit.Assert
import org.junit.Test

class IamRole_test {
@Test
fun test() {
    val template = IamRoleTemplate()
    println(toTerraform(template))
    val runner = terraformAwsRunnerFromEnvironment(template)
    try {
        val outputs = runner.initApply()
        Assert.assertTrue(outputs.containsKey("roleArn"))
        println("created role: " + outputs.get("roleArn"))
    } finally {
        runner.destroy()
    }

}

}