package com.typedpath.terraform2kotlin

import com.typedpath.terraform2kotlin.aws.schema.*

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
        tags = mapOf("Name" to "SG EC2")
        user_data = escapeMultiLine(startupScript)
    }

    val web_traffic = aws_security_group().apply {
        name = securityGroupName
        ingress = listOf(
            ingress(to_port = 443, from_port = 443, protocol = "TCP").apply {
                cidr_blocks = listOf("0.0.0.0/0")
            },
            ingress(to_port = 80, from_port = 80, protocol = "TCP").apply {
                cidr_blocks = listOf("0.0.0.0/0")
            })
        egress = listOf(
            egress(from_port = 443, to_port = 443, protocol = "TCP").apply {
                cidr_blocks = listOf("0.0.0.0/0")
            },
            egress(from_port = 80, to_port = 80, protocol = "TCP").apply {
                cidr_blocks = listOf("0.0.0.0/0")
            })
    }

    val public_ip = Output("\${aws_instance.myec2.public_ip}")
    val webaddress = Output("http://\${aws_instance.myec2.public_ip}:80")

}