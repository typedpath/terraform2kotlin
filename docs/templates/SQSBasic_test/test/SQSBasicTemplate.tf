

resource "aws_sqs_queue" "queue"   {
    delay_seconds =  90
    max_message_size =  2048
    message_retention_seconds =  86400
    name =  "terraform-example-queue1586715121703"
    receive_wait_time_seconds =  10
    tags = {
        "Environment" =  "production"
      }
  }


output "queueArn"   {
    value =  aws_sqs_queue.queue.arn
  }


output "queueUrl"   {
    value =  aws_sqs_queue.queue.id
  }
    
    
  
