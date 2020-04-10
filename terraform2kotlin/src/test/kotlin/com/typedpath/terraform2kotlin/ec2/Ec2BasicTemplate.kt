package com.typedpath.terraform2kotlin.ec2

import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.aws.schema.aws_instance

class Ec2BasicTemplate() : TerraformTemplate() {
    // can be shortened to  aws_instance("ami-0389b2a3c4948b1a0", "t2.micro" )
    val myec2 = aws_instance(ami = "ami-0389b2a3c4948b1a0", instance_type = "t2.micro" )
}