package com.typedpath.terraform2kotlin.eks

import com.typedpath.terraform2kotlin.aws.schema.aws_s3_bucket
import com.typedpath.terraform2kotlin.s3.S3UtilMainTemplate
import com.typedpath.terraform2kotlin.s3.S3UtilOutputsTemplate
import com.typedpath.terraform2kotlin.terraformAwsRunnerFromEnvironment
import com.typedpath.terraform2kotlin.toTerraform
import org.junit.Assert

import org.junit.Test

class S3SimpleModule_test {

    @Test
    fun testBasic() {
        val s3BucketIn = aws_s3_bucket().apply {
            bucket = S3SimpleModule_test::class.simpleName!!.toLowerCase().replace("_", "-")
            acl = "private"
            versioning = listOf(aws_s3_bucket.Versioning().apply { this.enabled = true })
        }

        val template = S3UtilMainTemplate(
            awsS3Bucket = s3BucketIn
        )
        test(::testBasic, template)
    }

    @Test
    fun testLogBucket() {
        val template = S3UtilMainTemplate(
            awsS3Bucket = aws_s3_bucket().apply {
                bucket = "my-s3-bucket-for-logs" + System.currentTimeMillis()
                acl = "log-delivery-write"
                force_destroy = true
            },
            attach_elb_log_delivery_policy = true
        )
        test(::testLogBucket, template)
    }

    private fun test(context: Any, template: S3UtilMainTemplate) {
        val outputsTemplate = S3UtilOutputsTemplate(template)

        println(toTerraform(template))
        println(toTerraform(outputsTemplate))

        val runner = terraformAwsRunnerFromEnvironment(context, template, outputsTemplate)
        try {
            println("executing in " + runner.runDir)
            val outputs = runner.initApply()
            println("executed in " + runner.runDir)
            //check the outputs
            outputsTemplate.nonWebsiteNames.forEach {
                Assert.assertTrue("output $it ", outputs.containsKey(it))
                println("found $it ${outputs.get(it)}")
                Assert.assertNotNull("output $it => ${outputs.get(it)}", outputs.containsKey(it))
            }
        } finally {
            println("destroying")
            runner.destroy()
            println("destroyed")
        }
    }

}