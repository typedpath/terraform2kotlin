
data "aws_availability_zones" "availabilityZones"   {

  }


resource "aws_subnet" "awsSubnet0"   {
    availability_zone =  data.aws_availability_zones.availabilityZones.names[0]
    cidr_block =  "10.0.0.0/24"
    tags = {
        "Name" =  "terraform-eks-demo-node"
        "kubernetes.io/cluster/testEksCluster" =  "shared"
      }
    vpc_id =  aws_vpc.demoVpc.id
  }


resource "aws_subnet" "awsSubnet1"   {
    availability_zone =  data.aws_availability_zones.availabilityZones.names[1]
    cidr_block =  "10.0.1.0/24"
    tags = {
        "Name" =  "terraform-eks-demo-node"
        "kubernetes.io/cluster/testEksCluster" =  "shared"
      }
    vpc_id =  aws_vpc.demoVpc.id
  }


resource "aws_internet_gateway" "demoGateway"   {
    tags = {
        "Name" =  "terraform-eks-demo"
      }
    vpc_id =  aws_vpc.demoVpc.id
  }


resource "aws_route_table_association" "demoRouteAssociation0"   {
    route_table_id =  aws_route_table.demoRouteTable.id
    subnet_id =  aws_subnet.awsSubnet0.id
  }


resource "aws_route_table_association" "demoRouteAssociation1"   {
    route_table_id =  aws_route_table.demoRouteTable.id
    subnet_id =  aws_subnet.awsSubnet1.id
  }


resource "aws_route_table" "demoRouteTable"   {
    
      route { 
        cidr_block =  "0.0.0.0/0"
        gateway_id =  "${aws_internet_gateway.demoGateway.id}"
      }
    tags = {
        "Name" =  "aws_route_table::demoRouteTable"
      }
    vpc_id =  aws_vpc.demoVpc.id
  }


resource "aws_vpc" "demoVpc"   {
    cidr_block =  "10.0.0.0/16"
    tags = {
        "Name" =  "terraform-eks-demo-node"
        "kubernetes.io/cluster/testEksCluster" =  "shared"
      }
  }

    
    
  
