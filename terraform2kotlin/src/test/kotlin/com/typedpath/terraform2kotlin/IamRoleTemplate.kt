package com.typedpath.terraform2kotlin

import com.typedpath.terraform2kotlin.aws.schema.*
import com.typedpath.terraform2kotlin.aws.schema.effect.Allow
import com.typedpath.terraform2kotlin.aws.schema.version._2012_10_17

//based on this: https://www.terraform.io/docs/providers/aws/r/eks_cluster.html
// and this https://www.terraform.io/docs/providers/aws/r/iam_role.html
class IamRoleTemplate() : TerraformTemplate() {

    val  eksClusterExamplePolicyDocument = aws_iam_policy_document().apply {
        version = _2012_10_17
        statement = listOf(
            statement().apply {
                effect = Allow
                principals = listOf(
                    principals(type = "Service",
                         identifiers = listOf("eks.amazonaws.com")
                    )
                )
                actions = listOf("sts:AssumeRole")
            }
        )
    }

   val example = aws_iam_role("\${data.aws_iam_policy_document.eksClusterExamplePolicyDocument.json}" /*TODO utility for this*/)
        .apply {
            name = "eks-cluster-example"
   }

   val exampleAmazonEKSClusterPolicy  = aws_iam_role_policy_attachment(
       role = "\${aws_iam_role.example.name}" /*TODO utility for this*/,
       policy_arn = "arn:aws:iam::aws:policy/AmazonEKSClusterPolicy" /*TODO utility for this*/)

    val exampleAmazonEKSServicePolicy  = aws_iam_role_policy_attachment(
        role = "\${aws_iam_role.example.name}" ,
        policy_arn = "arn:aws:iam::aws:policy/AmazonEKSServicePolicy" )

    val roleArn = Output("\${aws_iam_role.example.arn}")


}