package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_s3_bucket_public_access_block(val bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var restrict_public_buckets: Boolean? = null
  var block_public_acls: Boolean? = null
  var block_public_policy: Boolean? = null
  var ignore_public_acls: Boolean? = null
 

}
