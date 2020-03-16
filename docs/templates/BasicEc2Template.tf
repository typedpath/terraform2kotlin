resource "aws_instance" "myec2"   {
    ami =  "ami-0389b2a3c4948b1a0"
    instance_type =  "t2.micro"
  }
