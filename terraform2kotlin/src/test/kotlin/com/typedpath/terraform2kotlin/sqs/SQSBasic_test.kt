import com.amazonaws.services.sqs.AmazonSQSClientBuilder
import com.amazonaws.services.sqs.model.Message
import com.amazonaws.services.sqs.model.SendMessageRequest
import com.sun.org.apache.xml.internal.serializer.utils.Utils
import com.typedpath.terraform2kotlin.sqs.SQSBasicTemplate
import com.typedpath.terraform2kotlin.terraformAwsRunnerFromEnvironment
import com.typedpath.terraform2kotlin.toTerraform
import org.junit.Assert
import org.junit.Test


class SQSBasic_test {

    @Test
    fun test() {
        val template = SQSBasicTemplate()
        println("template:\r\n ${toTerraform(template)}")
        val runner = terraformAwsRunnerFromEnvironment(::test, template)

        try {
            val outputs = runner.initApply()
            println("outputs:")
            outputs.forEach { println("'${it.key}'=>'${it.value}'") }
            val queueArn = outputs.get(SQSBasicTemplate::queueArn.name)
            val queueUrl = outputs.get(SQSBasicTemplate::queueUrl.name)
            Assert.assertNotNull(queueArn)
            val send_msg_request = SendMessageRequest()
                .withQueueUrl(queueUrl)
                .withMessageBody("hello " + SQSBasic_test::class.java.simpleName)
                .withDelaySeconds(5)
            val sqs = AmazonSQSClientBuilder.defaultClient()
            sqs.sendMessage(send_msg_request)
            val messages: List<Message> = sqs.receiveMessage(queueUrl).messages
            println("received $messages")
            messages.forEach { println("received ${it.body}") }
            for (m in messages) {
                sqs.deleteMessage(queueUrl, m.receiptHandle)
            }
            Assert.assertEquals("message count", 1, messages.size )

        } finally {
            println("destroying")
            val destroyresult = runner.destroy()
            println(destroyresult)
        }
    }
}

