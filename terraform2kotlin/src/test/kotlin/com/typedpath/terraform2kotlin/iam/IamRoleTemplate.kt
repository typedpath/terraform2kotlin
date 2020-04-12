package com.typedpath.terraform2kotlin.iam

import com.typedpath.terraform2kotlin.Output
import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.assumeRolePolicyDocumentForService
import com.typedpath.terraform2kotlin.aws.schema.*

// based on this: https://www.terraform.io/docs/providers/aws/r/eks_cluster.html
// and this https://www.terraform.io/docs/providers/aws/r/iam_role.html
class IamRoleTemplate() : TerraformTemplate() {

   val  examplePolicyDocument = assumeRolePolicyDocumentForService("eks.amazonaws.com")

   val exampleRole = aws_iam_role(examplePolicyDocument.jsonRef() )
        .apply {
            name = "eks-cluster-example"
   }

   val exampleAmazonEKSClusterPolicy  = aws_iam_role_policy_attachment(
       role = exampleRole.nameRef(),
       policy_arn = "arn:aws:iam::aws:policy/AmazonEKSClusterPolicy" /*TODO utility for this*/)

    val exampleAmazonEKSServicePolicy  = aws_iam_role_policy_attachment(
        role = exampleRole.nameRef() ,
        policy_arn = "arn:aws:iam::aws:policy/AmazonEKSServicePolicy" )

    val roleArn = Output(exampleRole.arnRef())


}