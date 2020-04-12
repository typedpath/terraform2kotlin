
data "aws_iam_policy_document" "examplePolicyDocument"   {
    
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


resource "aws_iam_role_policy_attachment" "exampleAmazonEKSClusterPolicy"   {
    policy_arn =  "arn:aws:iam::aws:policy/AmazonEKSClusterPolicy"
    role =  aws_iam_role.exampleRole.name
  }


resource "aws_iam_role_policy_attachment" "exampleAmazonEKSServicePolicy"   {
    policy_arn =  "arn:aws:iam::aws:policy/AmazonEKSServicePolicy"
    role =  aws_iam_role.exampleRole.name
  }


resource "aws_iam_role" "exampleRole"   {
    assume_role_policy =  data.aws_iam_policy_document.examplePolicyDocument.json
    name =  "eks-cluster-example"
    tags = {
        "Name" =  "aws_iam_role::exampleRole"
      }
  }


output "roleArn"   {
    value =  aws_iam_role.exampleRole.arn
  }
    
    
  
