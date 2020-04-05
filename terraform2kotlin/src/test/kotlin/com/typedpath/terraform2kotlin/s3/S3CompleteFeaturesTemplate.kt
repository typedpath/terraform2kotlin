package com.typedpath.terraform2kotlin.s3

import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_policy_document
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_role
import com.typedpath.terraform2kotlin.aws.schema.aws_kms_key

// based on https://github.com/terraform-aws-modules/terraform-aws-s3-bucket/tree/master/examples/complete
// Differences in this version
// Terraform Locals are not used - Kotlin scoping is preferred
//
class S3CompleteFeaturesTemplate(bucketName: String) : TerraformTemplate() {
    val objectsKey = aws_kms_key().apply {
        description = "KMS key is used to encrypt bucket objects"
        deletion_window_in_days = 7
    }

    val assumeRolePolicyDocument = aws_iam_policy_document().apply {
        version = aws_iam_policy_document.Version._2012_10_17
        statement = listOf(
            aws_iam_policy_document.Statement().apply {
                effect = aws_iam_policy_document.Statement.Effect.Allow
                sid = ""
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

    val role = aws_iam_role(assumeRolePolicyDocument.jsonRef())

    val bucket_policy = aws_iam_policy_document().apply {
        version = aws_iam_policy_document.Version._2012_10_17
        statement = listOf(
            aws_iam_policy_document.Statement().apply {
                effect = aws_iam_policy_document.Statement.Effect.Allow
                principals =
                    listOf(
                        aws_iam_policy_document.Statement.Principals(
                            type = "AWS",
                            identifiers = listOf(role.arnRef())
                        )
                    )
                actions = listOf("s3:ListBucket")
                resources = listOf("arn:aws:s3:::$bucketName")
            }
        )
    }


}