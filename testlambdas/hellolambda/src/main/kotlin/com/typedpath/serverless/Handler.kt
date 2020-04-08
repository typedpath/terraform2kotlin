package com.typedpath.serverless

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

//import org.apache.logging.log4j.LogManager

class Handler : RequestHandler<Any, ApiGatewayResponse> {
    override fun handleRequest(input: Any, context: Context): ApiGatewayResponse {
        println("context: ${context}")
        println("input: ${input}")
        val typedInput = input as Map<String, Any?>
        println("typedInput: ${typedInput}")
        val pathParameters = typedInput["pathParameters"]
        println("***received pathParameters $pathParameters")
        val env = System.getenv() as Map<String, String>
        println("***env $env")
        val strEnv = env.map { "${it.key}=>${it.value}" }.joinToString (",")
        println("***strParams $strEnv")
        return ApiGatewayResponse.build {
            statusCode = 200
            objectBody = HelloResponse("xxxGo Go Serverless v1.x! Your Kotlin function executed successfully! envs: $strEnv", input)
            headers = mapOf("X-Powered-By" to "AWS Lambda & serverless")
        }
    }

    companion object {
        //private val LOG = LogManager.getLogger(Handler::class.java)
    }
}
