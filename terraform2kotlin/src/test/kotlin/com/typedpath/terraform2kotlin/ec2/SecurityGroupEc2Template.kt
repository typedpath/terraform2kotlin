package com.typedpath.terraform2kotlin.ec2

import com.typedpath.terraform2kotlin.Output
import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.aws.schema.*
import com.typedpath.terraform2kotlin.aws.schema.aws_security_group.Ingress
import com.typedpath.terraform2kotlin.aws.schema.aws_security_group.Egress

fun port2Ingress(port: Int) =  Ingress(to_port = port, from_port = port, protocol = "TCP").apply {
    cidr_blocks = listOf("0.0.0.0/0")
}


fun port2Egress(port: Int) = Egress(from_port = port, to_port = port, protocol = "TCP").apply {
    cidr_blocks = listOf("0.0.0.0/0")
}


class SecurityGroupEc2Template(webgreeting: String) : TerraformTemplate() {
    val securityGroupName = "Allow HTTPS"

    val startupScript = (
            """#!/bin/bash
sudo yum update
sudo yum install -y httpd
sudo systemctl start httpd
sudo systemctl enable httpd
echo '<h1>$webgreeting</h1>' | sudo tee /var/www/html/index.html""")

    val myec2 = aws_instance(ami = "ami-0389b2a3c4948b1a0", instance_type = "t2.micro").apply {
        security_groups = listOf(securityGroupName)
        tags = mapOf("Name" to "SG EC2 xyz")
        user_data = escapeMultiLine(startupScript)
    }

    val web_traffic = aws_security_group().apply {
        name = securityGroupName
        ingress = listOf( port2Ingress(443), port2Ingress(80))
        egress = listOf( port2Egress(443), port2Egress(80))
    }

    val public_ip = Output(myec2.public_ipRef())
    val webaddress = Output("http://\${aws_instance.myec2.public_ip}:80")

}