package com.typedpath.terraform2kotlin

import com.typedpath.terraform2kotlin.aws.schema.aws_iam_policy_document
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_policy_document.Statement.Effect.Allow
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_policy_document.Version._2012_10_17
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_policy_document.Statement
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_policy_document.Statement.Principals
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_role
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_role_policy_attachment
import com.typedpath.terraform2kotlin.aws.schema.aws_vpc

// based on https://www.terraform.io/docs/providers/aws/r/eks_cluster.html
//TODO finish this
class KubernetesClusterTemplate () : TerraformTemplate() {

    val eksClusterExamplePolicyDocument = aws_iam_policy_document().apply {
        version = _2012_10_17
        statement = listOf(
            Statement().apply {
                effect = Allow
                // review this
                principals =
                    listOf(Principals(type = "Service",
                        identifiers = listOf("eks.amazonaws.com")
                    ))
                actions = listOf("sts:AssumeRole")
            }
        )
    }

    val exampleRole = aws_iam_role("\${data.aws_iam_policy_document.eksClusterExamplePolicyDocument.json}" /*TODO utility for this*/)
        .apply {
            name = "eks-cluster-example"
        }

    val exampleAmazonEKSClusterPolicy  = aws_iam_role_policy_attachment(
        role = "\${aws_iam_role.exampleRole.name}" /*TODO utility for this*/,
        policy_arn = "arn:aws:iam::aws:policy/AmazonEKSClusterPolicy" /*TODO utility for this*/)

    val exampleAmazonEKSServicePolicy  = aws_iam_role_policy_attachment(
        role = "\${aws_iam_role.exampleRole.name}" ,
        policy_arn = "arn:aws:iam::aws:policy/AmazonEKSServicePolicy" )

    val roleArn = Output("\${aws_iam_role.exampleRole.arn}")
/*
    resource "aws_vpc" "main" {
        cidr_block       = "10.0.0.0/16"
        instance_tenancy = "dedicated"

        tags = {
            Name = "main"
        }
    }
  */
    val kubernetesVpc = aws_vpc(cidr_block = "10.0.0.0/16").apply {
          tags = mapOf("name" to "kubernetesTest")
    }

    /*val vpcConfig = vpc_config().apply {

    }
*/

  /*  val exampleEksCluster = aws_eks_cluster(
        "\${aws_iam_role.exampleRole.arn}",   listOf(kubernetesVpc)/*val vpc_config: List<vpc_config>*/, "exampleEksCluster")
        .apply {

              }

*/


    /**
    resource "aws_eks_cluster" "example" {
    name     = "example"
    role_arn = "${aws_iam_role.example.arn}"

    vpc_config {
    subnet_ids = ["${aws_subnet.example1.id}", "${aws_subnet.example2.id}"]
    }

    # Ensure that IAM Role permissions are created before and deleted after EKS Cluster handling.
    # Otherwise, EKS will not be able to properly delete EKS managed EC2 infrastructure such as Security Groups.
    depends_on = [
    "aws_iam_role_policy_attachment.example-AmazonEKSClusterPolicy",
    "aws_iam_role_policy_attachment.example-AmazonEKSServicePolicy",
    ]
    }

    output "endpoint" {
    value = "${aws_eks_cluster.example.endpoint}"
    }

    output "kubeconfig-certificate-authority-data" {
    value = "${aws_eks_cluster.example.certificate_authority.0.data}"
    }
     */


}