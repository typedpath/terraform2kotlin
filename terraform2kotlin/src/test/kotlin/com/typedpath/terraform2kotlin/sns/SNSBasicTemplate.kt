package com.typedpath.terraform2kotlin.sns

import com.typedpath.terraform2kotlin.Output
import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.aws.schema.*
import com.typedpath.terraform2kotlin.getTestAccountId
import com.typedpath.terraform2kotlin.getTestRegion

class SNSBasicTemplate(topicName: String, sqsSubscriptionName: String) : TerraformTemplate() {

    val topic = aws_sns_topic().apply {
        name = topicName
    }

    val topicArn = Output(topic.arnRef())

    //TODO - this doesnt work - why ?
    val queuePolicyDocument = aws_iam_policy_document().apply {
        version = aws_iam_policy_document.Version._2012_10_17
        statement = listOf(
                aws_iam_policy_document.Statement().apply {
                    effect = aws_iam_policy_document.Statement.Effect.Allow
                    sid = "First"
                    principals = listOf(
                            aws_iam_policy_document.Statement.Principals(type = "Service",
                                    identifiers = listOf("*")
                            )
                    )
                    actions = listOf("sts:SendMessage")
                    resources = listOf("arn:aws:sqs:${getTestRegion()}:${getTestAccountId()}:$sqsSubscriptionName")
                    condition = listOf(
                            aws_iam_policy_document.Statement.Condition("ArnEquals", "aws:SourceArn", listOf(topic.arnRef()))
                    )
                }
        )
    }

    val queue = aws_sqs_queue().apply {
        name = sqsSubscriptionName
    }

    val queuePolicy = aws_sqs_queue_policy(
            queue_url = queue.idRef(),
            //policy = queuePolicyDocument.jsonRef()
            //TODO tidy this - the escaping  is nasty
            policy = """<<EOF
{
  "Version": "2012-10-17",
  "Id": "sqspolicy",
  "Statement": [
    {
      "Sid": "First",
      "Effect": "Allow",
      "Principal": "*",
      "Action": "sqs:SendMessage",
      "Resource": "${"$"}{${queue.arnRef()}}",
      "Condition": {
        "ArnEquals": {
          "aws:SourceArn": "${"$"}{${topic.arnRef()}}"
        }
      }
    }
  ]
}
EOF""")


    val queueArn = Output(queue.arnRef())

    // TODO why doesnt urlRef work ?
    val queueUrl = Output(queue.idRef())

    val subscription = aws_sns_topic_subscription(topic_arn = topic.arnRef(),
            protocol = aws_sns_topic_subscription.Protocol.sqs,
            endpoint = queue.arnRef())

    val subscriptionId = Output(subscription.idRef())

}