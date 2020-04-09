package com.typedpath.terraform2kotlin.apigateway

import com.typedpath.terraform2kotlin.Output
import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.aws.schema.*
import com.typedpath.terraform2kotlin.getTestRegion

// loosely based on https://www.terraform.io/docs/providers/aws/r/api_gateway_integration.html
class ApiGatewayBasicTemplate(function: aws_lambda_function, region: String, accountId: String) : TerraformTemplate() {

    val resourcePath = "resource"

    val api = aws_api_gateway_rest_api("myapi").apply {
        description = "Lambda integration sample"
    }

    val gatewayResource = aws_api_gateway_resource(
            path_part = resourcePath,
            parent_id = api.root_resource_idRef(),
            rest_api_id = api.idRef()
    )

    val methodResource = aws_api_gateway_method(
            rest_api_id = api.idRef(),
            resource_id = gatewayResource.idRef(),
            http_method = aws_api_gateway_method.Http_method.GET,
            authorization = "NONE")

    val integration = aws_api_gateway_integration(
            rest_api_id = api.idRef(),
            resource_id = gatewayResource.idRef(),
            http_method = aws_api_gateway_integration.Http_method.valueOf(methodResource.http_method.theValue),
            type = aws_api_gateway_integration.Type.AWS_PROXY
    ).apply {
        integration_http_method = aws_api_gateway_integration.Integration_http_method.POST
        uri = function.invoke_arnRef()
    }

    val apigw_lambdaPermission = aws_lambda_permission(
            action = "lambda:InvokeFunction",
            function_name = function.function_nameRef(),
            principal = "apigateway.amazonaws.com").apply {

        statement_id = "AllowExecutionFromAPIGateway"
        //   # More: http://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-control-access-using-iam-policies-to-invoke-api.html
        source_arn = "arn:aws:execute-api:$region:$accountId:\${${api.idRef()}}/*/${methodResource.http_method.theValue}\${${gatewayResource.pathRef()}}"
    }

    val deployment = aws_api_gateway_deployment(rest_api_id = api.idRef()).apply {
        depends_on = listOf(methodResource, integration)
        stage_name = "test"
    }

    val restApiId = Output(gatewayResource.idRef())
    val apiId = Output(api.idRef())
    val gatewayResourceId = Output(gatewayResource.idRef())
    val methodResourceId = Output(methodResource.idRef())
    val integrationId = Output(integration.idRef())
    val deploymentId = Output(deployment.idRef())

    fun apiUrl(apiId: String) =
            "https://$apiId.execute-api.${getTestRegion()}.amazonaws.com/test/$resourcePath"


}

