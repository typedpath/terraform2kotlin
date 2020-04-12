package com.typedpath.terraform2kotlin

import com.typedpath.terraform2kotlin.aws.schema.aws_instance
import org.junit.Assert
import org.junit.Ignore
import org.junit.Test
import kotlin.reflect.full.memberProperties

class SerializationTest {
    @Test
    fun testToJson() {
        val assumeRolePolicyDocument = IamPolicy().apply {
            statement {
                //TODO make this a constant
                action("sts:AssumeRole")
                effect = IamPolicy.EffectType.Allow
                //TODO make this a constant
                principal = mapOf( Pair( IamPolicy.PrincipalType.Service, listOf("lambda.amazonaws.com"))
                )
            }
        }
        println(toJson(assumeRolePolicyDocument))
    }

    @Ignore
    @Test
    //TODO determine how to filter out properties declaed in the constructor
    fun testTopLevelConstructorParamsExcluded() {
        class TestTemplate(val otherInstance: aws_instance, otherInstance2: aws_instance) : TerraformTemplate() {
            val myInstance: aws_instance = aws_instance("a", "b")
            val otherInstance2: aws_instance = otherInstance2

        }
        val template = TestTemplate(aws_instance("xy", "z"), aws_instance("xy", "z"))
        val asTerraformTemplate = toTerraform(template)
        println(asTerraformTemplate)
        val paramName = TestTemplate::otherInstance.name
        //Assert.assertFalse("param $paramName should not be in template:\r\n $asTerraformTemplate",
        //        asTerraformTemplate.contains(paramName))

        TestTemplate::class.java.kotlin.constructors.first().parameters.forEach {
            println("${it.name} ${it.kind} ${it}")
        }

        template.javaClass.kotlin.memberProperties.forEach { println("${it.getter}  $it") }



    }

}