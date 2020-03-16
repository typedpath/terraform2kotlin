resource "aws_instance" "myec2" {
  ami = "ami-0389b2a3c4948b1a0"
  instance_type = "t2.micro"
  security_groups = ["${aws_security_group.web_traffic.name}"]
  tags = {
   Name = "SG EC2"
   }
}

resource "aws_security_group" "web_traffic" {
    name = "Allow HTTPS"
    ingress = {
      from_port = 443
      to_port = 443
      protocol = "TCP"
      cidr_blocks = ["0.0.0.0/0"]
    }
    egress {
      from_port = 443
      to_port = 443
      protocol = "TCP"
      cidr_blocks = ["0.0.0.0/0"]
    }
}

