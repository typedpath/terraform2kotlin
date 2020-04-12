# Terraform2Kotlin
This project offers a Kotlin DSL for Terraform. Kotlin brings the advantages of type safety, IDE autocomplete and the ability to embed code within templates + many other possibilities.  This is an experiment in its early stages - there is a mapping of AWS resources only (in com.typedpath.terraform2kotlin.aws)   - please provide feedback!  

## Building
<pre>
gradle build -x test
cd terraform2kotlin
gradle test
</pre>
___Beware___ the tests create cloud resources that cost money !  
For the tests to work you need to:
 * create admin CLI AWS user, see: https://docs.aws.amazon.com/IAM/latest/UserGuide/getting-started_create-admin-group.html - its worth considering restricted access rights of this user as much as possible
 * define environment variables:
   *  __awsTestAccessKey__ (format: AKIA42VZ2QKNI5LJAYWV)
   * __awsTestSecretKey__ (format: 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)
   * __awsTestRegion__ (format: eu-west-2)
   * __awsTestAccountId__ (format: 890123456789)


## Tests

Most of these tests create infrastructure which is destroyed at the end of the test to save money.  In order to look at the infrastructure created comment this line: ___println(runner.destroy())___ 
__EksGettingStarted_test__ takes a long time sometimes (>30 minutes) and is the most expensive so its worth considering "@Ignore ing". 

| Test | Kotlin Template, Generated .tf | Test Description |
| --- | --- | ----- |
| [Ec2Basic_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/ec2/Ec2Basic_test.kt) | [Ec2BasicTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/ec2/Ec2BasicTemplate.kt) [Ec2BasicTemplate.tf](docs/templates/Ec2Basic_test/Ec2BasicTemplate.tf) | create terraform template for EC2 instance  |
| [SecurityGroupEc2_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/ec2/SecurityGroupEc2_test.kt) | [SecurityGroupEc2Template.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/ec2/SecurityGroupEc2Template.kt) [SecurityGroupEc2Template.tf](docs/templates//SecurityGroupEc2_test/SecurityGroupEc2Template.tf) | create an EC2 instance + security group, install webserver, check a web page is viewable |
| [IamRole_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/iam/IamRole_test.kt) | [IamRoleTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/iam/IamRoleTemplate.kt) [IamRoleTemplate.tf](docs/templates/IamRole_test/IamRoleTemplate.tf) | create an IamRole then check its got an arn |
| [SQSBasic_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/sqs/SQSBasic_test.kt) | [SQSBasicTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/sqs/SQSBasicTemplate.kt) [SQSBasicTemplate.tf](docs/templates/SQSBasic_test/test/SQSBasicTemplate.tf) | create an SQS queue, write and read to it |
| [DynamoDbBasic_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/dynamodb/DynamoDbBasic_test.kt) | [DynamoDbBasicTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/dynamodb/DynamoDbBasicTemplate.kt) [DynamoDbBasicTemplate.tf](docs/templates/DynamoDbBasic_test/test/DynamoDbBasicTemplate.tf) | create a dynamo DB table and ___CRUD___ it |
| [SNSBasic_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/sns/SNSBasic_test.kt) | [SNSBasicTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/sns/SNSBasicTemplate.kt) [SNSBasicTemplate.tf](docs/templates/SNSBasic_test/test/SNSBasicTemplate.tf) | create an SNS topic, subscribe an SQS queue, publish to the topic and read message from the queue |
| [LambdaBasic_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/lambda/LambdaBasic_test.kt) | [LambdaBasicTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/lambda/LambdaBasicTemplate.kt) [LambdaBasicTemplate.tf](docs/templates/LambdaBasic_test/test/LambdaBasicTemplate.tf) | create an Lambda function, call it and check the parameters and environment received |
| [ApiGatewayBasic_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/apigateway/ApiGatewayBasic_test.kt) | [ApiGatewayBasicTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/apigateway/ApiGatewayBasicTemplate.kt) [ApiGatewayBasicTemplate.tf](docs/templates/ApiGatewayBasic_test/test/ApiGatewayBasicTemplate.tf) | create an api gateway, create and link Lambda function (using __LambdaBasicTemplate.kt__) and call the gateway, check environment received |
| [EksGettingStarted_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/eks-getting-started/EksGettingStarted_test.kt) | [EksVpcTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/eks-getting-started/EksVpcTemplate.kt) [EksVpcTemplate.tf](docs/templates/EksGettingStarted_test//EksVpcTemplate.tf) [EksClusterTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/eks-getting-started/EksClusterTemplate.kt) [EksClusterTemplate.tf](docs/templates/EksGettingStarted_test/EksClusterTemplate.tf) [EksWorkerNodesTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/eks-getting-started/EksWorkerNodesTemplate.kt) [EksWorkerNodesTemplate.tf](docs/templates/EksGettingStarted_test/EksWorkerNodesTemplate.tf) [OutputTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/eks-getting-started/OutputTemplate.kt) [OutputTemplate.tf](docs/templates/EksGettingStarted_test/OutputTemplate.tf)| create an EKS cluster return KubeConfig file and configMapAwsAuth - based on https://github.com/terraform-providers/terraform-provider-aws/tree/master/examples/eks-getting-started |
| [S3SimpleModule_test.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/s3/S3SimpleModule_test.kt) [S3CompleteModule_test.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/s3/S3CompleteModule_test.kt) [S3CompleteFeatures.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/s3/S3CompleteFeatures.kt)| [S3UtilMainTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/s3/S3UtilMainTemplate.kt) [S3UtilMainTemplate.tf basic s3](docs/templates/S3SimpleModule_test/testBasic/S3UtilMainTemplate.tf) [S3UtilMainTemplate.tf basic logbucket](docs/templates/S3SimpleModule_test/testLogBucket/S3UtilMainTemplate.tf) [S3UtilMainTemplate.tf complete s3](docs/templates/S3CompleteModule_test/completeFeaturesTest/S3UtilMainTemplate.tf) [S3UtilOutputsTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/s3/S3UtilOutputsTemplate.kt) (The generated .tf depends on the main template parameters) | re-implements terraform s3 module, there are three tests calling the module in different ways, the original module is here: https://github.com/terraform-aws-modules/terraform-aws-s3-bucket : this kotlin version is much more concise ! |

## Templates
The examples listed above create templates by extension e.g.:
```kotlin
class SecurityGroupEc2Template(webgreeting: String) : TerraformTemplate() {...
```
templates declared in this way will have a terraform resource for every property that extends __com.typedpath.terraform.Resource__.  
In the case of __SecurityGroupEc2Template.kt__ these 2 property declarations map to an ec2 instance, security group and output:
```kotlin
  val myec2 = aws_instance(ami = "ami-0389b2a3c4948b1a0", instance_type = "t2.micro").    apply {
        security_groups = listOf(securityGroupName) . . . . 
   val web_traffic = aws_security_group( . . . .
   val public_ip = Output( ......

```
Note kotlin forces mandatory fields to be specified in the constructor.  Non mandatory fields can be specified in an __apply__ block  

Templates are mapped to .tf format with the __toTerraform__ function e.g.:
```kotlin
val template = SecurityGroupEc2Template(webGreeting)
println("template:\r\n ${toTerraform(template)}")
```
In this example this will give this .tf:
```terraform
resource "aws_instance" "myec2"   {
    ami =  "ami-0389b2a3c4948b1a0"
. . . .

resource "aws_security_group" "web_traffic"   { 
      egress { 
. . . .

output "public_ip"   {
    value =  "${aws_instance.myec2.public_ip}"
  }
```

Most of these examples parameterize templates via the Kotlin constructor e.g. :
```kotlin
class ApiGatewayBasicTemplate(function: aws_lambda_function, region: String, accountId: String) : TerraformTemplate() {
}
```
Please avoid the anti-pattern of declaring resource properties as constructor parameters:
```kotlin
//Warning declaring a resource property as a constructor parameter will cause unexpected results!
class ApiGatewayBasicTemplate(val function: aws_lambda_function, region: String, accountId: String) : TerraformTemplate() {
}

```
## Feature by Feature Comparison

| Description | Terraform2Kotlin | Terraform |
| --- | --- | ----- |
| Representation of Mandatory / Optional | Kotlin Language Feature | N / A |
| Representation of Enumerated Values such as __aws_autoscaling_policy.policy_type__  | Kotlin Enum | N / A |
| Rich Scoping / Modularisation| Functions and Classes   | N / A |
| Terraform Modules | Not supported - workaround for terraform global namespace via ___TerraformTemplate.scope___ property | Native|
| Terraform Locals | Limited supported - Kotlin scoped variables preferred  | Native|
| (forward) attribute references | via scoped call e.g. __gatewayResource.idRef()__  | via global reference e.g. __aws_api_gateway_resource.gatewayResource.id__|
| resource references | via scoped variable e.g. __depends_on = listOf(methodResource, integration)__  | via global reference e.g. __depends_on =  [  aws_api_gateway_method.methodResource,   aws_api_gateway_integration.integration]__|
| Other languages Required | No - backends can be written in Kotlin. Compatibility with alternative frontend languages is easy to support with kotlin plugins.  The examples here create infrastructure, deploy code and execute client test code : all ___100% kotlin___.  | Yes - terraform only represents infrastructure :-(.|
