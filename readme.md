# Terraform2Kotlin
This project offers a Kotlin DSL for Terraform. Kotlin brings the advantages of type safety, IDE autocomplete and the ability to embed code within templates + many other possibilities.  This is a an experiment in its early stages  - only a small subset of AWS resources coverered - please provide feedback!  

## Building
<pre>
cd terraform2kotlin
gradle build
</pre>
___Beware___ the tests create cloud resources that cost money !  
For the tests to work you need to:
 * create admin CLI AWS user, see: https://docs.aws.amazon.com/IAM/latest/UserGuide/getting-started_create-admin-group.html - its worth considering restricted access rights of this user as much as possible
 * define environment variables:
   *  __awsTestAccessKey__ (format: AKIA42VZ2QKNI5LJAYWV)
   * __awsTestSecretKey__ (format: 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)
   * __awsTestRegion__ (formt: eu-west-2)


## Tests
### (More coming soon !!)


| Test | Kotlin Template, Generated .tf | Test Description |
| --- | --- | ----- |
| [BasicEc2_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/BasicEc2_test.kt) | [BasicEc2Template.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/BasicEc2Template.kt) [BasicEc2Template.tf](docs/templates/BasicEc2Template.tf) | create terraform template for EC2 instance  |
| [SecurityGroupEc2_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/SecurityGroupEc2_test.kt) | [SecurityGroupEc2Template.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/SecurityGroupEc2Template.kt) [SecurityGroupEc2Template.tf](docs/templates/SecurityGroupEc2Template.tf) | create an EC2 instance + security group, install webserver, check a web page is viewable |
| [IamRole_test](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/IamRole_test.kt) | [IamRoleTemplate.kt](terraform2kotlin/src/test/kotlin/com/typedpath/terraform2kotlin/IamRoleTemplate.kt) [IamRoleTemplate.tf](docs/templates/IamRoleTemplate.tf) | create an IamRole then check its got an arn |

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
```json
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
