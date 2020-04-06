package com.typedpath.terraform2kotlin.s3

import com.typedpath.terraform2kotlin.aws.schema.aws_iam_policy_document
import com.typedpath.terraform2kotlin.aws.schema.aws_iam_role
import com.typedpath.terraform2kotlin.aws.schema.aws_kms_key
import com.typedpath.terraform2kotlin.aws.schema.aws_s3_bucket
import com.typedpath.terraform2kotlin.aws.schema.aws_s3_bucket.*
import com.typedpath.terraform2kotlin.aws.schema.aws_s3_bucket.Lifecycle_rule.*
import com.typedpath.terraform2kotlin.aws.schema.aws_s3_bucket.Server_side_encryption_configuration.*

// based on https://github.com/terraform-aws-modules/terraform-aws-s3-bucket/tree/master/examples/complete
// Differences in this version:
// Terraform Locals are not used - Kotlin scoping is preferred
// TerraformTemplate.scope property is used instead of terraform modules

class S3CompleteFeatures(bucketName: String, logBucketName: String) {

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

    val logBucket = aws_s3_bucket().apply {
        bucket = logBucketName
        acl = "log-delivery-write"
        force_destroy = true
    }

    val logBucketTemplate = S3UtilMainTemplate(
        awsS3Bucket = logBucket,
        attach_elb_log_delivery_policy = true
    ).apply {
        // modify all names so they dont clash
        scope = "log_bucket"
    }

    val s3BucketIn = aws_s3_bucket().apply {
        bucket = bucketName
        acl = "private"
        force_destroy = true
        tags = mapOf("Owner" to "Anton")
        versioning = listOf(Versioning().apply { enabled = true })
        website = listOf(Website().apply {
            index_document = "index.html"
            error_document = "error.html"
            //TODO add routing object and tojson support to make this type safe !
            routing_rules = """<<EOF
[{
    "Condition": {
        "KeyPrefixEquals": "docs/"
    },
    "Redirect": {
        "ReplaceKeyPrefixWith": "documents/"
    }
}]
EOF"""
        }
        )
        logging = listOf(
            Logging(
                target_bucket = logBucket.idRef()
            ).apply { target_prefix = "log/" })

        cors_rule = listOf(
            Cors_rule(
                allowed_methods = listOf("PUT", "POST"),
                allowed_origins = listOf("https://modules.tf", "https://terraform-aws-modules.modules.tf")
            ).apply {
                allowed_headers = listOf("*")
                expose_headers = listOf("ETag")
                max_age_seconds = 3000
            }
        )

        lifecycle_rule = listOf(
            Lifecycle_rule(enabled = true).apply {
                id = "log"
                prefix = "log/"
                tags = mapOf(
                    "rule" to "log",
                    "autoclean" to "true"
                )

                transition = listOf(
                    Transition(Transition.Storage_class.ONEZONE_IA)
                        .apply {
                            days = 30
                        },
                    Transition(Transition.Storage_class.GLACIER)
                        .apply {
                            days = 60
                        })
                expiration = listOf(Expiration().apply {
                    days = 90
                })

                noncurrent_version_expiration =
                    listOf(Noncurrent_version_expiration().apply {
                        days = 30
                    })
            },
            Lifecycle_rule(enabled = true).apply {
                id = "log1"
                prefix = "log1/"
                abort_incomplete_multipart_upload_days = 7

                noncurrent_version_transition = listOf(
                    Noncurrent_version_transition(Noncurrent_version_transition.Storage_class.STANDARD_IA).apply {
                        days = 30
                    },
                    Noncurrent_version_transition(Noncurrent_version_transition.Storage_class.ONEZONE_IA).apply {
                        days = 60
                    },
                    Noncurrent_version_transition(Noncurrent_version_transition.Storage_class.GLACIER).apply {
                        days = 90
                    }
                )

                noncurrent_version_expiration =
                    listOf(Noncurrent_version_expiration().apply {
                        days = 300
                    })
            }
        )

        server_side_encryption_configuration = listOf(
            Server_side_encryption_configuration(
                listOf(
                    Rule(
                        apply_server_side_encryption_by_default = listOf(
                            Rule.Apply_server_side_encryption_by_default(
                                Rule.Apply_server_side_encryption_by_default.Sse_algorithm.aws_kms
                            )
                        )
                    )
                )
            )
        )

        object_lock_configuration =
            listOf(Object_lock_configuration(Object_lock_configuration.Object_lock_enabled.Enabled).apply {
                rule = listOf(
                    Object_lock_configuration.Rule(
                        listOf(
                            Object_lock_configuration.Rule.Default_retention(Object_lock_configuration.Rule.Default_retention.Mode.COMPLIANCE)
                                .apply { years = 5 })
                    )
                )
            }
            )
    }

    val s3BucketTemplate = S3UtilMainTemplate(
        awsS3Bucket = s3BucketIn,
        policy = bucket_policy,
        attach_elb_log_delivery_policy = true,
        attach_policy = true,
        block_public_acls = true,
        block_public_policy = true,
        ignore_public_acls = true,
        restrict_public_buckets = true
    )

    val logBucketOutputTemplate = S3UtilOutputsTemplate(logBucketTemplate)

    val s3BucketOutputTemplate = S3UtilOutputsTemplate(s3BucketTemplate)


}