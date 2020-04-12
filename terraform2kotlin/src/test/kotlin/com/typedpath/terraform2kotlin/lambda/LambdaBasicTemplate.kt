package com.typedpath.terraform2kotlin.lambda

import com.typedpath.terraform2kotlin.Output
import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.assumeRolePolicyDocumentForService
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_policy_document
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_role
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_role_policy_attachment
import com.typedpath.terraform2kotlin.aws.schema.aws_lambda_function

// (loosely) based on https://www.terraform.io/docs/providers/aws/r/lambda_function.html
class LambdaBasicTemplate(functionName: String, lambdaCodeFilename: String, environment: Map<String, String>) : TerraformTemplate() {

    val assumeRolePolicyDocument = assumeRolePolicyDocumentForService("lambda.amazonaws.com")

    val iam_for_lambda_role = aws_iam_role(assumeRolePolicyDocument.jsonRef())
            .apply {
                name = "iam_for_lambda"
            }

    val executeRoleAttachment = aws_iam_role_policy_attachment(
            role = iam_for_lambda_role.nameRef(),
            policy_arn = "arn:aws:iam::aws:policy/AWSLambdaExecute")

    val test_lambda = aws_lambda_function(function_name = functionName, handler = "com.typedpath.serverless.Handler",
            role = iam_for_lambda_role.arnRef(),
            runtime = aws_lambda_function.Runtime.java8).apply {
        this.environment = listOf(
                aws_lambda_function.Environment().apply {
                    variables = environment
                }
        )
        filename = lambdaCodeFilename
        //TODO utility for this
        source_code_hash = "\${filebase64sha256(\"$lambdaCodeFilename\")}"
        depends_on = listOf(iam_for_lambda_role, executeRoleAttachment)
    }

    val lambdaArn = Output(test_lambda.arnRef())
}
