package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_s3_access_point(val name : String, val bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var public_access_block_configuration: List<Public_access_block_configuration>? = null
  var vpc_configuration: List<Vpc_configuration>? = null
  var account_id: String? = null
  var policy: String? = null
 


class Public_access_block_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ignore_public_acls: Boolean? = null
  var restrict_public_buckets: Boolean? = null
  var block_public_acls: Boolean? = null
  var block_public_policy: Boolean? = null
 

}

class Vpc_configuration(val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
