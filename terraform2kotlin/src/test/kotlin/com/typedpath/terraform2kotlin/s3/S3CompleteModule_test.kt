package com.typedpath.terraform2kotlin.eks

import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.`eks-getting-started`.OutputTemplate
import com.typedpath.terraform2kotlin.aws.schema.aws_s3_bucket
import com.typedpath.terraform2kotlin.s3.S3CompleteFeatures
import com.typedpath.terraform2kotlin.s3.S3UtilMainTemplate
import com.typedpath.terraform2kotlin.s3.S3UtilOutputsTemplate
import com.typedpath.terraform2kotlin.terraformAwsRunnerFromEnvironment
import com.typedpath.terraform2kotlin.toTerraform
import org.junit.Assert

import org.junit.Test

class S3CompleteModule_test {

    val defaultBucketName = S3CompleteModule_test::class.simpleName!!.toLowerCase().replace("_", "-")
    val defaultLogBucketName = "my-s3-bucket-for-logs" + System.currentTimeMillis()


    @Test
    fun completeFeaturesTest() {

        val completeFeatures =  S3CompleteFeatures(defaultBucketName, defaultLogBucketName)

        println(toTerraform(completeFeatures.logBucketTemplate))
        println(toTerraform(completeFeatures.logBucketOutputTemplate))
        println(toTerraform(completeFeatures.s3BucketTemplate))
        println(toTerraform(completeFeatures.s3BucketOutputTemplate))

        val runner = terraformAwsRunnerFromEnvironment(::completeFeaturesTest, completeFeatures.logBucketTemplate,
            completeFeatures.logBucketOutputTemplate,completeFeatures.s3BucketTemplate, completeFeatures.s3BucketOutputTemplate)

        try {
            println("executing in " + runner.runDir)
            val outputs = runner.initApply()
            println("executed in " + runner.runDir)
            //check the outputs
            completeFeatures.logBucketOutputTemplate.nonWebsiteNames.forEach {
                    Assert.assertTrue("output $it ", outputs.containsKey(it))
                    println("found $it ${outputs.get(it)}")
                    Assert.assertNotNull("output $it => ${outputs.get(it)}", outputs.containsKey(it))
                }
            completeFeatures.s3BucketOutputTemplate.allNames.forEach {
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