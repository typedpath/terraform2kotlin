package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_s3_account_public_access_block() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var account_id: String? = null
  var block_public_acls: Boolean? = null
  var block_public_policy: Boolean? = null
  var ignore_public_acls: Boolean? = null
  var restrict_public_buckets: Boolean? = null
 

}
