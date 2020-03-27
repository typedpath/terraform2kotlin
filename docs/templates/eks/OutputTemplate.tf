


output "certificateAuthorityData"   {
    value =  aws_eks_cluster.demoEksCluster.certificate_authority.0.data
  }


output "clusterEndPoint"   {
    value =  aws_eks_cluster.demoEksCluster.endpoint
  }


output "roleArn"   {
    value =  aws_iam_role.demoClusterRole.arn
  }
    
    
  
