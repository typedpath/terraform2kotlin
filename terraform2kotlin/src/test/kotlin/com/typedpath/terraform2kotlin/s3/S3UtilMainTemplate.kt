package com.typedpath.terraform2kotlin.s3

import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.aws.schema.*

//see https://github.com/terraform-aws-modules/terraform-aws-s3-bucket
// https://github.com/terraform-aws-modules/terraform-aws-s3-bucket/*.tf
//TODO support for naming prefix
class S3UtilMainTemplate(
    awsS3Bucket: aws_s3_bucket,
    policy: aws_iam_policy_document? = null,
    attach_elb_log_delivery_policy: Boolean = false,
    attach_policy: Boolean = false,
    block_public_acls: Boolean? = null,
    block_public_policy: Boolean? = null,
    ignore_public_acls: Boolean? = null,
    restrict_public_buckets: Boolean? = null
) : TerraformTemplate() {
    val s3_bucket = awsS3Bucket

    val this_elb_service_account = aws_elb_service_account()

    val elb_log_delivery_policy_document =
        if (!attach_elb_log_delivery_policy) null else aws_iam_policy_document().apply {

            statement = listOf(aws_iam_policy_document.Statement().apply {
                sid = ""
                principals = listOf(
                    aws_iam_policy_document.Statement.Principals(
                        type = "AWS",
                        identifiers = listOf(this_elb_service_account.arnRef())
                    )
                )
                effect = aws_iam_policy_document.Statement.Effect.Allow
                actions = listOf("s3:PutObject")
                //        resources =  [  "arn:aws:s3:::${aws_s3_bucket.s3_bucket.id}/*"]
                //TODO remove need for double escaping
                resources = listOf("arn:aws:s3:::\${${s3_bucket.idRef()}}/*")

            })
        }

    val elb_log_delivery = if (!attach_elb_log_delivery_policy) null else elb_log_delivery_policy_document

    val s3_bucket_policy = if (!attach_elb_log_delivery_policy && policy == null) null else
        aws_s3_bucket_policy(
            bucket = s3_bucket.idRef(),
            policy = (if (attach_elb_log_delivery_policy) elb_log_delivery!! else policy!!).jsonRef()
        )

    val this_aws_s3_bucket_public_access_block = aws_s3_bucket_public_access_block(
        bucket = if (attach_elb_log_delivery_policy || attach_policy) s3_bucket_policy!!.idRef() else s3_bucket.idRef()
    ).apply {

        // Chain resources (s3_bucket -> s3_bucket_policy -> s3_bucket_public_access_block)
        // to prevent "A conflicting conditional operation is currently in progress against this resource."

        this.block_public_acls = block_public_acls
        this.block_public_policy = block_public_policy
        this.ignore_public_acls = ignore_public_acls
        this.restrict_public_buckets = restrict_public_buckets
    }

}

