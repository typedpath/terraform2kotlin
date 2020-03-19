package com.typedpath.terraform2kotlin.aws.schema

class aws_kinesis_stream(val shard_count : Int, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var shard_level_metrics: List<String>? = null
  var encryption_type: Encryption_type? = null
  var kms_key_id: String? = null
  var enforce_consumer_deletion: Boolean? = null
  var arn: String? = null
  var tags: Map<String, String>? = null
  var retention_period: Int? = null
 

enum class Encryption_type(val theValue: String ) {
	 NONE ("NONE"), KMS ("KMS") ;
	override fun toString() = theValue
	}
}
