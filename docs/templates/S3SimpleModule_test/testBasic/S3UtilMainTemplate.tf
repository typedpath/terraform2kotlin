
data "aws_elb_service_account" "this_elb_service_account"   {

  }


resource "aws_s3_bucket" "s3_bucket"   {
    acl =  "private"
    bucket =  "s3simplemodule-test"
    
      versioning { 
        enabled =  true
      }
  }


resource "aws_s3_bucket_public_access_block" "this_aws_s3_bucket_public_access_block"   {
    bucket =  aws_s3_bucket.s3_bucket.id
  }

    
    
  
