package com.typedpath.terraform2kotlin.aws.schema

class aws_efs_file_system() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var reference_name: String? = null
  var encrypted: Boolean? = null
  var kms_key_id: String? = null
  var tags: Map<String, String>? = null
  var throughput_mode: Throughput_mode? = null
  var lifecycle_policy: List<Lifecycle_policy>? = null
  var creation_token: String? = null
  var performance_mode: Performance_mode? = null
  var provisioned_throughput_in_mibps: Float? = null
 

enum class Throughput_mode(val theValue: String ) {
	 bursting ("bursting"), provisioned ("provisioned") ;
	override fun toString() = theValue
	}
enum class Performance_mode(val theValue: String ) {
	 generalPurpose ("generalPurpose"), maxIO ("maxIO") ;
	override fun toString() = theValue
	}

class Lifecycle_policy() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var transition_to_ia: Transition_to_ia? = null
 

enum class Transition_to_ia(val theValue: String ) {
	 AFTER_7_DAYS ("AFTER_7_DAYS"), AFTER_14_DAYS ("AFTER_14_DAYS"), AFTER_30_DAYS ("AFTER_30_DAYS"), AFTER_60_DAYS ("AFTER_60_DAYS"), AFTER_90_DAYS ("AFTER_90_DAYS") ;
	override fun toString() = theValue
	}
}
}
