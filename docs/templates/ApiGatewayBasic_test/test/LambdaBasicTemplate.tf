
data "aws_iam_policy_document" "assumeRolePolicyDocument"   {
    
      statement { 
        actions =  [  "sts:AssumeRole"]
        effect =  "Allow"
        
          principals { 
            identifiers =  [  "lambda.amazonaws.com"]
            type =  "Service"
          }
      }
    version =  "2012-10-17"
  }


resource "aws_iam_role_policy_attachment" "executeRoleAttachment"   {
    policy_arn =  "arn:aws:iam::aws:policy/AWSLambdaExecute"
    role =  aws_iam_role.iam_for_lambda_role.name
  }


resource "aws_iam_role" "iam_for_lambda_role"   {
    assume_role_policy =  data.aws_iam_policy_document.assumeRolePolicyDocument.json
    name =  "iam_for_lambda"
  }


resource "aws_lambda_function" "test_lambda"   {
    
      environment { 
        variables = {
            "greeeeeting" =  "Hewooooooo"
          }
      }
    filename =  "C:/data5hp/training/projects/terraform2kotlin/testlambdas/hellolambda/build/libs/hellolambda-fat-testonly.jar"
    function_name =  "hello1586384721223"
    handler =  "com.typedpath.serverless.Handler"
    role =  aws_iam_role.iam_for_lambda_role.arn
    runtime =  "java8"
    source_code_hash =  "${filebase64sha256("C:/data5hp/training/projects/terraform2kotlin/testlambdas/hellolambda/build/libs/hellolambda-fat-testonly.jar")}"
    depends_on =  [  aws_iam_role.iam_for_lambda_role,   aws_iam_role_policy_attachment.executeRoleAttachment]
  }


output "lambdaArn"   {
    value =  aws_lambda_function.test_lambda.arn
  }
    
    
  
