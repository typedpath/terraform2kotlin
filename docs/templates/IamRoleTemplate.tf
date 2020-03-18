data "aws_iam_policy_document" "eksClusterExamplePolicyDocument"   {
    
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


resource "aws_iam_role" "example"   {
    assume_role_policy =  "${data.aws_iam_policy_document.eksClusterExamplePolicyDocument.json}"
    name =  "eks-cluster-example"
  }


resource "aws_iam_role_policy_attachment" "exampleAmazonEKSClusterPolicy"   {
    policy_arn =  "arn:aws:iam::aws:policy/AmazonEKSClusterPolicy"
    role =  "${aws_iam_role.example.name}"
  }


resource "aws_iam_role_policy_attachment" "exampleAmazonEKSServicePolicy"   {
    policy_arn =  "arn:aws:iam::aws:policy/AmazonEKSServicePolicy"
    role =  "${aws_iam_role.example.name}"
  }


output "roleArn"   {
    value =  "${aws_iam_role.example.arn}"
  }
