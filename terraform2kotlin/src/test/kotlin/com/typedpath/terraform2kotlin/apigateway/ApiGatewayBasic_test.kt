package com.typedpath.terraform2kotlin.apigateway

import com.typedpath.terraform2kotlin.*
import com.typedpath.terraform2kotlin.lambda.LambdaBasicTemplate
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClients

import org.junit.Assert
import org.junit.Test
import java.io.File

class ApiGatewayBasic_test {

    val helloLambdaBinary = "..//testlambdas/hellolambda/build/libs/hellolambda-fat-testonly.jar"

    @Test
    fun test() {
        val functionName = "hello" + "1586384721223"//System.currentTimeMillis()
        val f = File(helloLambdaBinary)
        Assert.assertTrue("file should exist ${f.absolutePath}", f.exists())

        val greetingEnvValue = "Hewooooooo"
        val greetingEnvName = "greeeeeting"
        val envs = mapOf(greetingEnvName to greetingEnvValue)

        val lambdaTemplate = LambdaBasicTemplate(functionName, f.canonicalPath.replace("\\", "/"), envs);
        println("lambdaTemplate:\r\n ${toTerraform(lambdaTemplate)}")

        val apiGatwayTemplate = ApiGatewayBasicTemplate(lambdaTemplate.test_lambda, getTestRegion(), getTestAccountId())

        val runner = terraformAwsRunnerFromEnvironment(::test, lambdaTemplate, apiGatwayTemplate)

        // logs go to CloudWatchLog GroupsAPI-Gateway-Execution-Logs_$apiId/xxxxxxxxx

        try {
            val outputs = runner.initApply()
            println("outputs:")
            outputs.forEach { println("'${it.key}'=>'${it.value}'") }
            val apiUrl = "${apiGatwayTemplate.apiUrl("" + outputs.get("apiId"))}"
            println("apiUrl == $apiUrl")

            val httpclient = HttpClients.createDefault()
            val getResponse = httpclient.execute(HttpGet(apiUrl))
            val strResponse = String(getResponse.entity.content.readBytes())
            println("get response.statusLine ${getResponse.statusLine} ${strResponse}")

            System.out.println(strResponse)
            Assert.assertTrue(strResponse.contains(greetingEnvValue))
            Assert.assertTrue(strResponse.contains(greetingEnvName))

        } finally {
            println("destroying")
            println(runner.destroy())
        }
    }
}

