package com.typedpath.terraform2kotlin.`eks-getting-started`

import com.typedpath.terraform2kotlin.Output
import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.aws.schema.*
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_policy_document.Statement.Effect.Allow
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_policy_document.Version._2012_10_17
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_policy_document.Statement
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_policy_document.Statement.Principals
import com.typedpath.terraform2kotlin.getMyExternalIp

// based on https://www.terraform.io/docs/providers/aws/r/eks_cluster.html
//TODO finish this
class EksClusterTemplate (val clusterName: String, val vpcName: String, val subnets: List<aws_subnet>) : TerraformTemplate() {

    val demoClusterRolePolicyDocument = aws_iam_policy_document().apply {
        version = _2012_10_17
        statement = listOf(
            Statement().apply {
                effect = Allow
                // review this
                principals =
                    listOf(
                        Principals(
                            type = "Service",
                            identifiers = listOf("eks.amazonaws.com")
                        )
                    )
                actions = listOf("sts:AssumeRole")
            }
        )
    }

    val demoClusterRole =
        aws_iam_role("\${data.aws_iam_policy_document.demoClusterRolePolicyDocument.json}" /*TODO utility for this*/)
            .apply {
                name = "eks-cluster-example"
            }

    val demoClusterAmazonEKSClusterPolicyAttachment = aws_iam_role_policy_attachment(
        role = "\${aws_iam_role.demoClusterRole.name}" /*TODO utility for this*/,
        policy_arn = "arn:aws:iam::aws:policy/AmazonEKSClusterPolicy" /*TODO utility for this*/
    )

    val demoClusterAmazonEKSServicePolicyAttachment = aws_iam_role_policy_attachment(
        role = "\${aws_iam_role.demoClusterRole.name}",
        policy_arn = "arn:aws:iam::aws:policy/AmazonEKSServicePolicy"
    )

    val demoClusterSecurityGroup = aws_security_group().apply {
        name = "terraform-eks-demo-cluster"
        description = "Cluster communication with worker nodes"
        vpc_id = "\${aws_vpc.$vpcName.id}"

        egress = listOf(aws_security_group.Egress(
            from_port = 0, protocol = "-1", to_port = 0
        ).apply {
            cidr_blocks = listOf("0.0.0.0/0")
        })

        tags = mapOf(
            "Name" to "terraform-eks-demo"
        )
    }

    val demoClusterIngressWorkstationHttpsSecurityGroupRule = aws_security_group_rule(
        from_port = 443,
        security_group_id = "\${aws_security_group.demoClusterSecurityGroup.id}",
        type = aws_security_group_rule.Type.ingress,
        to_port = 4443,
        protocol = "tcp"
    ).apply {
        cidr_blocks = listOf("${getMyExternalIp()}/32")
        description = "Allow workstation to communicate with the cluster API Server"
    }

    val demoEksCluster = aws_eks_cluster(
        name = clusterName,
        role_arn = demoClusterRole.arnRef(),
        vpc_config = listOf(
            aws_eks_cluster.Vpc_config( listOf(
                  subnets[0].idRef(),
                  subnets[1].idRef()
            )).apply {
                security_group_ids = listOf(
                    demoClusterSecurityGroup.idRef()
                )
            }
        )
    ).apply {
        depends_on = listOf(
            demoClusterAmazonEKSClusterPolicyAttachment,
            demoClusterAmazonEKSServicePolicyAttachment
        )

    }

}