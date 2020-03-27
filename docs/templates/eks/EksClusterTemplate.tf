
data "aws_iam_policy_document" "demoClusterRolePolicyDocument"   {
    
      statement { 
        actions =  [  "sts:AssumeRole"]
        effect =  "Allow"
        
          principals { 
            identifiers =  [  "eks.amazonaws.com"]
            type =  "Service"
          }
      }
    version =  "2012-10-17"
  }


resource "aws_iam_role_policy_attachment" "demoClusterAmazonEKSClusterPolicyAttachment"   {
    policy_arn =  "arn:aws:iam::aws:policy/AmazonEKSClusterPolicy"
    role =  aws_iam_role.demoClusterRole.name
  }


resource "aws_iam_role_policy_attachment" "demoClusterAmazonEKSServicePolicyAttachment"   {
    policy_arn =  "arn:aws:iam::aws:policy/AmazonEKSServicePolicy"
    role =  aws_iam_role.demoClusterRole.name
  }


resource "aws_security_group_rule" "demoClusterIngressWorkstationHttpsSecurityGroupRule"   {
    cidr_blocks =  [  "82.24.71.143/32"]
    description =  "Allow workstation to communicate with the cluster API Server"
    from_port =  443
    protocol =  "tcp"
    security_group_id =  aws_security_group.demoClusterSecurityGroup.id
    to_port =  4443
    type =  "ingress"
  }


resource "aws_iam_role" "demoClusterRole"   {
    assume_role_policy =  data.aws_iam_policy_document.demoClusterRolePolicyDocument.json
    name =  "eks-cluster-example"
    tags = {
        "Name" =  "aws_iam_role::demoClusterRole"
      }
  }


resource "aws_security_group" "demoClusterSecurityGroup"   {
    description =  "Cluster communication with worker nodes"
    
      egress { 
        cidr_blocks =  [  "0.0.0.0/0"]
        from_port =  0
        protocol =  "-1"
        to_port =  0
      }
    name =  "terraform-eks-demo-cluster"
    tags = {
        "Name" =  "terraform-eks-demo"
      }
    vpc_id =  aws_vpc.demoVpc.id
  }


resource "aws_eks_cluster" "demoEksCluster"   {
    name =  "testEksCluster"
    role_arn =  aws_iam_role.demoClusterRole.arn
    tags = {
        "Name" =  "aws_eks_cluster::demoEksCluster"
      }
    
      vpc_config { 
        security_group_ids =  [  aws_security_group.demoClusterSecurityGroup.id]
        subnet_ids =  [  aws_subnet.awsSubnet0.id,   aws_subnet.awsSubnet1.id]
      }
    depends_on =  [  aws_iam_role_policy_attachment.demoClusterAmazonEKSClusterPolicyAttachment,   aws_iam_role_policy_attachment.demoClusterAmazonEKSServicePolicyAttachment]
  }

    
    
  
