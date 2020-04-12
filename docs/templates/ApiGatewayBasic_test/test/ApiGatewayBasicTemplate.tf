

resource "aws_api_gateway_rest_api" "api"   {
    description =  "Lambda integration sample"
    name =  "myapi"
  }


resource "aws_lambda_permission" "apigw_lambdaPermission"   {
    action =  "lambda:InvokeFunction"
    function_name =  aws_lambda_function.test_lambda.function_name
    principal =  "apigateway.amazonaws.com"
    source_arn =  "arn:aws:execute-api:eu-west-2:950651224730:${aws_api_gateway_rest_api.api.id}/*/GET${aws_api_gateway_resource.gatewayResource.path}"
    statement_id =  "AllowExecutionFromAPIGateway"
  }


resource "aws_api_gateway_deployment" "deployment"   {
    rest_api_id =  aws_api_gateway_rest_api.api.id
    stage_name =  "test"
    depends_on =  [  aws_api_gateway_method.methodResource,   aws_api_gateway_integration.integration]
  }


resource "aws_api_gateway_resource" "gatewayResource"   {
    parent_id =  aws_api_gateway_rest_api.api.root_resource_id
    path_part =  "resource"
    rest_api_id =  aws_api_gateway_rest_api.api.id
  }


resource "aws_api_gateway_integration" "integration"   {
    http_method =  "GET"
    integration_http_method =  "POST"
    resource_id =  aws_api_gateway_resource.gatewayResource.id
    rest_api_id =  aws_api_gateway_rest_api.api.id
    type =  "AWS_PROXY"
    uri =  aws_lambda_function.test_lambda.invoke_arn
  }


resource "aws_api_gateway_method" "methodResource"   {
    authorization =  "NONE"
    http_method =  "GET"
    resource_id =  aws_api_gateway_resource.gatewayResource.id
    rest_api_id =  aws_api_gateway_rest_api.api.id
  }


output "apiId"   {
    value =  aws_api_gateway_rest_api.api.id
  }


output "deploymentId"   {
    value =  aws_api_gateway_deployment.deployment.id
  }


output "gatewayResourceId"   {
    value =  aws_api_gateway_resource.gatewayResource.id
  }


output "integrationId"   {
    value =  aws_api_gateway_integration.integration.id
  }


output "methodResourceId"   {
    value =  aws_api_gateway_method.methodResource.id
  }


output "restApiId"   {
    value =  aws_api_gateway_resource.gatewayResource.id
  }
    
    
  
