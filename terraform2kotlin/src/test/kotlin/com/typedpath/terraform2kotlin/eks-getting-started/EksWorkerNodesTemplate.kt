package com.typedpath.terraform2kotlin.`eks-getting-started`

import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.aws.schema.aws_eks_node_group
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_policy_document
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_role
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_role_policy_attachment

class EksWorkerNodesTemplate(clusterName: String) : TerraformTemplate() {

    val demoClusterNodeRolePolicyDocument = aws_iam_policy_document().apply {
        version = aws_iam_policy_document.Version._2012_10_17
        statement = listOf(
            aws_iam_policy_document.Statement().apply {
                effect = aws_iam_policy_document.Statement.Effect.Allow
                // review this
                principals =
                    listOf(
                        aws_iam_policy_document.Statement.Principals(
                            type = "Service",
                            identifiers = listOf("ec2.amazonaws.com")
                        )
                    )
                actions = listOf("sts:AssumeRole")
            }
        )
    }

    val roleName = "terraform-eks-demo-node"
    val demoClusterNodeRole =
        aws_iam_role(demoClusterNodeRolePolicyDocument.jsonRef())
            .apply {
                name = roleName
            }

    val demoNodeAmazonEKSWorkerNodePolicy = aws_iam_role_policy_attachment(
        role = roleName,
        policy_arn = "arn:aws:iam::aws:policy/AmazonEKSWorkerNodePolicy"
    )

    val demoNodeAmazonEKSCNIPolicy = aws_iam_role_policy_attachment(
        role = roleName,
        policy_arn = "arn:aws:iam::aws:policy/AmazonEKS_CNI_Policy"
    )

    val demoNodeAmazonEC2ContainerRegistryReadOnly = aws_iam_role_policy_attachment(
        role = roleName,
        policy_arn = "arn:aws:iam::aws:policy/AmazonEC2ContainerRegistryReadOnly"
    )

    val demoNodeGroup = aws_eks_node_group(
        node_role_arn = demoClusterNodeRole.arnRef(),
        scaling_config = listOf(
            aws_eks_node_group.Scaling_config(
                desired_size = 1,
                max_size = 1,
                min_size = 1
            )
        ),
        node_group_name = "demoNodeGroupName",
        subnet_ids = listOf(),
        cluster_name = clusterName
    ).apply {
        depends_on = listOf(
            demoNodeAmazonEKSWorkerNodePolicy,
            demoNodeAmazonEKSCNIPolicy,
            demoNodeAmazonEC2ContainerRegistryReadOnly
        )
    }

}

