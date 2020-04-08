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


## Tests
### (More coming soon !!)


| Test | Kotlin Template, Generated .tf | Test Description |
| --- | --- | ----- |
| [BasicEc2_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/BasicEc2_test.kt) | [BasicEc2Template.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/BasicEc2Template.kt) [BasicEc2Template.tf](docs/templates/BasicEc2Template.tf) | create terraform template for EC2 instance  |
| [SecurityGroupEc2_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/SecurityGroupEc2_test.kt) | [SecurityGroupEc2Template.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/SecurityGroupEc2Template.kt) [SecurityGroupEc2Template.tf](docs/templates/SecurityGroupEc2Template.tf) | create an EC2 instance + security group, install webserver, check a web page is viewable |
| [IamRole_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/IamRole_test.kt) | [IamRoleTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/IamRoleTemplate.kt) [IamRoleTemplate.tf](docs/templates/IamRoleTemplate.tf) | create an IamRole then check its got an arn |
| [SQSBasic_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/sqs/SQSBasic_test.kt) | [SQSBasicTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/sqs/SQSBasicTemplate.kt) | create an SQS queue, write and read to it |
| [LambdaBasic_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/lambda/LambdaBasic_test.kt) | [LambdaBasicTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/lambda/LambdaBasicTemplate.kt) | create an Lambda function, call it and check the parameters and environment received |
| [EksGettingStarted_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/eks-getting-started/EksGettingStarted_test.kt) | [EksVpcTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/eks-getting-started/EksVpcTemplate.kt) [EksVpcTemplate.tf](docs/templates/eks/EksVpcTemplate.tf) [EksClusterTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/eks-getting-started/EksClusterTemplate.kt) [EksClusterTemplate.tf](docs/templates/eks/EksClusterTemplate.tf) [EksWorkerNodesTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/eks-getting-started/EksWorkerNodesTemplate.kt) [EksWorkerNodesTemplate.tf](docs/templates/eks/EksWorkerNodesTemplate.tf) [OutputTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/eks-getting-started/OutputTemplate.kt) [OutputTemplate.tf](docs/templates/eks/OutputTemplate.tf)| create an EKS cluster return KubeConfig file - based on https://github.com/terraform-providers/terraform-provider-aws/tree/master/examples/eks-getting-started |
| [S3SimpleModule_test.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/s3/S3SimpleModule_test.kt) [S3CompleteModule_test.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/s3/S3CompleteModule_test.kt) [S3CompleteFeatures.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/s3/S3CompleteFeatures.kt)| [S3UtilMainTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/s3/S3UtilMainTemplate.kt) [S3UtilOutputsTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/s3/S3UtilOutputsTemplate.kt) (The generated .tf depends on the main template parameters) | based on https://github.com/terraform-aws-modules/terraform-aws-s3-bucket : this kotlin version is much more concise ! |

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
