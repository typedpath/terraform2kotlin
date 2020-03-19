package com.typedpath.terraform2kotlin.aws.schema

class aws_cloudhsm_v2_cluster(val subnet_ids : List<String>, val hsm_type : Hsm_type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var source_backup_identifier: String? = null
  var tags: Map<String, String>? = null
 

enum class Hsm_type(val theValue: String ) {
	 hsm1_medium ("hsm1.medium") ;
	override fun toString() = theValue
	}
}
