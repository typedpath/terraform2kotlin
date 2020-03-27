
data "aws_iam_policy_document" "demoClusterNodeRolePolicyDocument"   {
    
      statement { 
        actions =  [  "sts:AssumeRole"]
        effect =  "Allow"
        
          principals { 
            identifiers =  [  "ec2.amazonaws.com"]
            type =  "Service"
          }
      }
    version =  "2012-10-17"
  }


resource "aws_iam_role_policy_attachment" "demoNodeAmazonEC2ContainerRegistryReadOnly"   {
    policy_arn =  "arn:aws:iam::aws:policy/AmazonEC2ContainerRegistryReadOnly"
    role =  aws_iam_role.terraformEksDemoNodeRole.name
  }


resource "aws_iam_role_policy_attachment" "demoNodeAmazonEKSCNIPolicy"   {
    policy_arn =  "arn:aws:iam::aws:policy/AmazonEKS_CNI_Policy"
    role =  aws_iam_role.terraformEksDemoNodeRole.name
  }


resource "aws_iam_role_policy_attachment" "demoNodeAmazonEKSWorkerNodePolicy"   {
    policy_arn =  "arn:aws:iam::aws:policy/AmazonEKSWorkerNodePolicy"
    role =  aws_iam_role.terraformEksDemoNodeRole.name
  }


resource "aws_eks_node_group" "demoNodeGroup"   {
    cluster_name =  aws_eks_cluster.demoEksCluster.name
    node_group_name =  "demoNodeGroupName"
    node_role_arn =  aws_iam_role.terraformEksDemoNodeRole.arn
    
      scaling_config { 
        desired_size =  1
        max_size =  1
        min_size =  1
      }
    subnet_ids =  [  aws_subnet.awsSubnet0.id,   aws_subnet.awsSubnet1.id]
    tags = {
        "Name" =  "aws_eks_node_group::demoNodeGroup"
      }
    depends_on =  [  aws_iam_role_policy_attachment.demoNodeAmazonEKSWorkerNodePolicy,   aws_iam_role_policy_attachment.demoNodeAmazonEKSCNIPolicy,   aws_iam_role_policy_attachment.demoNodeAmazonEC2ContainerRegistryReadOnly]
  }


resource "aws_iam_role" "terraformEksDemoNodeRole"   {
    assume_role_policy =  data.aws_iam_policy_document.demoClusterNodeRolePolicyDocument.json
    name =  "terraformEksDemoNodeRole"
    tags = {
        "Name" =  "aws_iam_role::terraformEksDemoNodeRole"
      }
  }

    
    
  
