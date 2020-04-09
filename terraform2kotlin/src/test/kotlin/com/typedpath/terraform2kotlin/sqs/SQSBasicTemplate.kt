package com.typedpath.terraform2kotlin.sqs

import com.typedpath.terraform2kotlin.Output
import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.aws.schema.aws_sqs_queue

class SQSBasicTemplate : TerraformTemplate() {

    val queue = aws_sqs_queue().apply {
        name                      = "terraform-example-queue" + System.currentTimeMillis()
        delay_seconds             = 90
        max_message_size          = 2048
        message_retention_seconds = 86400
        receive_wait_time_seconds = 10
// e.g.
/*        redrive_policy =
"""{
      "deadLetterTargetArn": "arn:aws:sqs:us-east-2:123456789012:MyDeadLetterQueue"
      "maxReceiveCount"     = 4
}"""*/
        tags = mapOf ("Environment" to "production")
    }

    val queueArn = Output( queue.arnRef() )
    // TODO why doesnt urlRef work ?
    val queueUrl = Output( queue.idRef() )

}