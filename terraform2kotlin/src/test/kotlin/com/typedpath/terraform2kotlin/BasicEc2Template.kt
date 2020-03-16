package com.typedpath.terraform2kotlin

import com.typedpath.terraform2kotlin.aws.schema.aws_instance

class BasicEc2Template() : TerraformTemplate() {
    // can be shortened to  aws_instance("ami-0389b2a3c4948b1a0", "t2.micro" )
    val myec2 = aws_instance(ami = "ami-0389b2a3c4948b1a0", instance_type = "t2.micro" )
}