resource "aws_instance" "myec2"   {
    ami =  "ami-0389b2a3c4948b1a0"
    instance_type =  "t2.micro"
    security_groups =  [  "Allow HTTPS"]
    tags = {
        Name =  "SG EC2"
      }
    user_data =  "#!/bin/bash\nsudo yum update\nsudo yum install -y httpd\nsudo systemctl start httpd\nsudo systemctl enable httpd\necho '<h1>Hello Terraform 2 Kotlin</h1>' | sudo tee /var/www/html/index.html"
  }


resource "aws_security_group" "web_traffic"   {
    
      egress { 
        cidr_blocks =  [  "0.0.0.0/0"]
        from_port =  443
        protocol =  "TCP"
        to_port =  443
      }
      egress { 
        cidr_blocks =  [  "0.0.0.0/0"]
        from_port =  80
        protocol =  "TCP"
        to_port =  80
      }
    
      ingress { 
        cidr_blocks =  [  "0.0.0.0/0"]
        from_port =  443
        protocol =  "TCP"
        to_port =  443
      }
      ingress { 
        cidr_blocks =  [  "0.0.0.0/0"]
        from_port =  80
        protocol =  "TCP"
        to_port =  80
      }
    name =  "Allow HTTPS"
  }


output "public_ip"   {
    value =  "${aws_instance.myec2.public_ip}"
  }


output "webaddress"   {
    value =  "http://${aws_instance.myec2.public_ip}:80"
  }
    