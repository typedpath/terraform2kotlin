
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
    acl =  "private"
    bucket =  "s3completemodule-test"
    
      cors_rule { 
        allowed_headers =  [  "*"]
        allowed_methods =  [  "PUT",   "POST"]
        allowed_origins =  [  "https://modules.tf",   "https://terraform-aws-modules.modules.tf"]
        expose_headers =  [  "ETag"]
        max_age_seconds =  3000
      }
    force_destroy =  true
    
      lifecycle_rule { 
        enabled =  true
        
          expiration { 
            days =  90
          }
        id =  "log"
        
          noncurrent_version_expiration { 
            days =  30
          }
        prefix =  "log/"
        tags = {
            "rule" =  "log"
            "autoclean" =  "true"
          }
        
          transition { 
            days =  30
            storage_class =  "ONEZONE_IA"
          }
          transition { 
            days =  60
            storage_class =  "GLACIER"
          }
      }
      lifecycle_rule { 
        abort_incomplete_multipart_upload_days =  7
        enabled =  true
        id =  "log1"
        
          noncurrent_version_expiration { 
            days =  300
          }
        
          noncurrent_version_transition { 
            days =  30
            storage_class =  "STANDARD_IA"
          }
          noncurrent_version_transition { 
            days =  60
            storage_class =  "ONEZONE_IA"
          }
          noncurrent_version_transition { 
            days =  90
            storage_class =  "GLACIER"
          }
        prefix =  "log1/"
      }
    
      logging { 
        target_bucket =  aws_s3_bucket.log_bucket-s3_bucket.id
        target_prefix =  "log/"
      }
    
      object_lock_configuration { 
        object_lock_enabled =  "Enabled"
        
          rule { 
            
              default_retention { 
                mode =  "COMPLIANCE"
                years =  5
              }
          }
      }
    
      server_side_encryption_configuration { 
        
          rule { 
            
              apply_server_side_encryption_by_default { 
                sse_algorithm =  "aws:kms"
              }
          }
      }
    tags = {
        "Owner" =  "Anton"
      }
    
      versioning { 
        enabled =  true
      }
    
      website { 
        error_document =  "error.html"
        index_document =  "index.html"
        routing_rules =  <<EOF
[{
    "Condition": {
        "KeyPrefixEquals": "docs/"
    },
    "Redirect": {
        "ReplaceKeyPrefixWith": "documents/"
    }
}]
EOF
      }
  }


resource "aws_s3_bucket_policy" "s3_bucket_policy"   {
    bucket =  aws_s3_bucket.s3_bucket.id
    policy =  data.aws_iam_policy_document.elb_log_delivery_policy_document.json
  }


resource "aws_s3_bucket_public_access_block" "this_aws_s3_bucket_public_access_block"   {
    block_public_acls =  true
    block_public_policy =  true
    bucket =  aws_s3_bucket_policy.s3_bucket_policy.id
    ignore_public_acls =  true
    restrict_public_buckets =  true
  }

    
    
  
