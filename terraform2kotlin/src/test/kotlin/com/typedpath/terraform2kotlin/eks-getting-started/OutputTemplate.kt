package com.typedpath.terraform2kotlin.`eks-getting-started`

import com.typedpath.terraform2kotlin.Output
import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.aws.schema.aws_eks_cluster
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_role

class OutputTemplate(cluster: aws_eks_cluster, role: aws_iam_role, val clusterName: String) : TerraformTemplate() {

    val certificateAuthorityData = Output(
        cluster.certificate_authorityRef(".0.data")
    )

    val roleArn = Output(
        role.arnRef()
    )

    val clusterEndPoint = Output(
        cluster.endpointRef()
    )

    fun configMapAwsAuth(outputs: Map<String, String>) : String {
        val roleArn = outputs.get(::roleArn.name)
        return """
apiVersion: v1
kind: ConfigMap
metadata:
  name: aws-auth
  namespace: kube-system
data:
  mapRoles: |
    - rolearn: $roleArn
      username: system:node:{{EC2PrivateDNSName}}
      groups:
        - system:bootstrappers
        - system:nodes    
""".trimIndent()
}

    fun kubeconfig(outputs: Map<String, String>) : String {
        val certificateAuthorityData = outputs.get(::certificateAuthorityData.name)
        val clusterEndPoint = outputs.get(::clusterEndPoint.name)
        return """
apiVersion: v1
clusters:
- cluster:
    server: $clusterEndPoint
    certificate-authority-data: $certificateAuthorityData
  name: kubernetes
contexts:
- context:
    cluster: kubernetes
    user: aws
  name: aws
current-context: aws
kind: Config
preferences: {}
users:
- name: aws
  user:
    exec:
      apiVersion: client.authentication.k8s.io/v1alpha1
      command: aws-iam-authenticator
      args:
        - "token"
        - "-i"
        - "$clusterName"   
""".trimIndent()
    }

}