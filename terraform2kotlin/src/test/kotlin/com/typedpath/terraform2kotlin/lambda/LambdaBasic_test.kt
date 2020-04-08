package com.typedpath.terraform2kotlin.lambda

import com.amazonaws.services.lambda.AWSLambdaClientBuilder
import com.amazonaws.services.lambda.model.InvocationType
import com.amazonaws.services.lambda.model.InvokeRequest
import com.typedpath.terraform2kotlin.getTestRegion

import com.typedpath.terraform2kotlin.terraformAwsRunnerFromEnvironment
import com.typedpath.terraform2kotlin.toTerraform
import org.junit.Assert
import org.junit.Test
import java.io.File
import java.nio.ByteBuffer


class LambdaBasic_test {

    val helloLambdaBinary = "..//testlambdas/hellolambda/build/libs/hellolambda-fat-testonly.jar"

    @Test
    fun test() {
        val functionName = "hello1586272216487"// ""hello" + System.currentTimeMillis()
        val f = File(helloLambdaBinary)
//        println("now i am here $here exists = ${f.exists()}")
        Assert.assertTrue("file should exist ${f.absolutePath}", f.exists())

        val greetingEnvValue = "Hewooooooo"
        val greetingEnvName = "greeeeeting"
        val greetingParamValue = "HewoooooooP"
        val greetingParamName = "greeeeetingP"
        val envs = mapOf(greetingEnvName to greetingEnvValue)

        val template = LambdaBasicTemplate(functionName, f.canonicalPath.replace("\\", "/"), envs);
        println("template:\r\n ${toTerraform(template)}")
        val runner = terraformAwsRunnerFromEnvironment(::test, template)

        try {
            val outputs = runner.initApply()
            println("outputs:")
            outputs.forEach { println("'${it.key}'=>'${it.value}'") }
            val arn = outputs.get(LambdaBasicTemplate::lambdaArn.name)
            Assert.assertNotNull(arn)

            val client = AWSLambdaClientBuilder.standard().withRegion(getTestRegion()).build()
            val request = InvokeRequest()
            request.functionName = functionName
            request.invocationType = InvocationType.RequestResponse.toString()
            request.payload = ByteBuffer.wrap("""{"$greetingParamName": "$greetingParamValue"}""".toByteArray())

            val result = client.invoke(request)
            val strResponse = String(result.payload.array())
            System.out.println(strResponse)
            Assert.assertTrue(strResponse.contains(greetingEnvValue))
            Assert.assertTrue(strResponse.contains(greetingEnvName))
            Assert.assertTrue(strResponse.contains(greetingParamValue))
            Assert.assertTrue(strResponse.contains(greetingParamName))

        } finally {
            println("destroying")
            //println(runner.destroy())
        }
    }
}

