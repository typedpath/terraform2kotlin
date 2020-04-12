
data "aws_iam_policy_document" "queuePolicyDocument"   {
    
      statement { 
        actions =  [  "sts:SendMessage"]
        
          condition { 
            test =  "ArnEquals"
            values =  [  aws_sns_topic.topic.arn]
            variable =  "aws:SourceArn"
          }
        effect =  "Allow"
        
          principals { 
            identifiers =  [  "*"]
            type =  "Service"
          }
        resources =  [  "arn:aws:sqs:eu-west-2:950651224730:testSubscription1586708232153"]
        sid =  "First"
      }
    version =  "2012-10-17"
  }


resource "aws_sqs_queue" "queue"   {
    name =  "testSubscription1586708232153"
  }


resource "aws_sqs_queue_policy" "queuePolicy"   {
    policy =  <<EOF
{
  "Version": "2012-10-17",
  "Id": "sqspolicy",
  "Statement": [
    {
      "Sid": "First",
      "Effect": "Allow",
      "Principal": "*",
      "Action": "sqs:SendMessage",
      "Resource": "${aws_sqs_queue.queue.arn}",
      "Condition": {
        "ArnEquals": {
          "aws:SourceArn": "${aws_sns_topic.topic.arn}"
        }
      }
    }
  ]
}
EOF
    queue_url =  aws_sqs_queue.queue.id
  }


resource "aws_sns_topic_subscription" "subscription"   {
    endpoint =  aws_sqs_queue.queue.arn
    protocol =  "sqs"
    topic_arn =  aws_sns_topic.topic.arn
  }


resource "aws_sns_topic" "topic"   {
    name =  "testTopic1586708232153"
  }


output "queueArn"   {
    value =  aws_sqs_queue.queue.arn
  }


output "queueUrl"   {
    value =  aws_sqs_queue.queue.id
  }


output "subscriptionId"   {
    value =  aws_sns_topic_subscription.subscription.id
  }


output "topicArn"   {
    value =  aws_sns_topic.topic.arn
  }
    
    
  
