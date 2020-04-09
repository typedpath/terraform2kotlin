package com.typedpath.terraform2kotlin.sns

import com.amazonaws.auth.AWSCredentials
import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.sns.AmazonSNS
import com.amazonaws.services.sns.AmazonSNSClientBuilder
import com.amazonaws.services.sns.model.PublishRequest
import com.amazonaws.services.sqs.AmazonSQSClientBuilder
import com.amazonaws.services.sqs.model.Message
import com.typedpath.terraform2kotlin.*
import org.junit.Assert
import org.junit.Test


class SNSBasic_test {

    @Test
    fun test() {
        val timeStamp = System.currentTimeMillis()
        val topicName = "testTopic$timeStamp"
        val subscriptionName = "testSubscription$timeStamp"
        val template = SNSBasicTemplate(topicName, subscriptionName)
        println("template:\r\n ${toTerraform(template)}")
        val runner = terraformAwsRunnerFromEnvironment(::test, template)
        try {
            val outputs = runner.initApply()
            println("outputs:")
            outputs.forEach { println("'${it.key}'=>'${it.value}'") }
            val queueArn = outputs.get(SNSBasicTemplate::queueArn.name)
            val topicArn = outputs.get(SNSBasicTemplate::topicArn.name) as String
            val subscriptionId = outputs.get(SNSBasicTemplate::subscriptionId.name) as String
            val queueUrl = outputs.get(SNSBasicTemplate::queueUrl.name) as String
            Assert.assertNotNull(queueArn)
            Assert.assertNotNull(topicArn)
            Assert.assertNotNull(subscriptionId)
            Assert.assertNotNull(queueUrl)

            val awsCredentials: AWSCredentials = BasicAWSCredentials(getTestAccessKey(), getTestSecretKey())
            val snsClient: AmazonSNS = AmazonSNSClientBuilder.standard()
                    .withRegion(getTestRegion())
                    .withCredentials(AWSStaticCredentialsProvider(awsCredentials)).build()
            val testMessage = "testing testing 123"
            val publishRequest = PublishRequest(topicArn, testMessage)
            val publishResult = snsClient.publish(publishRequest)
            println("publishResult: $publishResult")
            Assert.assertNotNull("messageId", publishResult.messageId)

            val sqs = AmazonSQSClientBuilder.standard()
                    .withRegion(getTestRegion())
                    .withCredentials(AWSStaticCredentialsProvider(awsCredentials)).build()

            val messages: List<Message> = sqs.receiveMessage(queueUrl).messages
            println("received $messages")
            Assert.assertEquals("message count ", 1, messages.size)
            val message = messages.get(0)
            Assert.assertTrue("message content contents input message $testMessage", message.body.contains(testMessage))

        } finally {
            println("destroying")
            println(runner.destroy())
        }
    }
}