
data "aws_iam_policy_document" "elb_log_delivery"   {
    
      statement { 
        actions =  [  "s3:PutObject"]
        effect =  "Allow"
        
          principals { 
            identifiers =  [  data.aws_elb_service_account.this_elb_service_account.arn]
            type =  "AWS"
          }
        resources =  [  "arn:aws:s3:::${aws_s3_bucket.s3_bucket.id}/*"]
        sid =  ""
      }
  }


data "aws_iam_policy_document" "elb_log_delivery_policy_document"   {
    
      statement { 
        actions =  [  "s3:PutObject"]
        effect =  "Allow"
        
          principals { 
            identifiers =  [  data.aws_elb_service_account.this_elb_service_account.arn]
            type =  "AWS"
          }
        resources =  [  "arn:aws:s3:::${aws_s3_bucket.s3_bucket.id}/*"]
        sid =  ""
      }
  }


data "aws_elb_service_account" "this_elb_service_account"   {

  }


resource "aws_s3_bucket" "s3_bucket"   {
    acl =  "log-delivery-write"
    bucket =  "my-s3-bucket-for-logs1586707901950"
    force_destroy =  true
  }


resource "aws_s3_bucket_policy" "s3_bucket_policy"   {
    bucket =  aws_s3_bucket.s3_bucket.id
    policy =  data.aws_iam_policy_document.elb_log_delivery_policy_document.json
  }


resource "aws_s3_bucket_public_access_block" "this_aws_s3_bucket_public_access_block"   {
    bucket =  aws_s3_bucket_policy.s3_bucket_policy.id
  }

    
    
  
