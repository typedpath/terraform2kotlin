package com.typedpath.terraform2kotlin.iam

import com.typedpath.terraform2kotlin.autoTag
import com.typedpath.terraform2kotlin.terraformAwsRunnerFromEnvironment
import com.typedpath.terraform2kotlin.toTerraform
import org.junit.Assert
import org.junit.Test

class IamRole_test {
@Test
fun test() {
    val template = IamRoleTemplate()
    autoTag(template)
    println(toTerraform(template))
    val runner = terraformAwsRunnerFromEnvironment(this, template)
    try {
        val outputs = runner.initApply()
        Assert.assertTrue(outputs.containsKey("roleArn"))
        println("created role: " + outputs.get("roleArn"))
    } finally {
        println(runner.destroy())
    }

}

}