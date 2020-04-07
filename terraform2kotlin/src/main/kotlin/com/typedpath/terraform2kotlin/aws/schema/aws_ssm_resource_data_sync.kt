package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ssm_resource_data_sync(val name : String, val s3_destination : List<S3_destination>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 


class S3_destination(val region : String, val bucket_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var prefix: String? = null
  var sync_format: String? = null
  var kms_key_arn: String? = null
 

}
}
