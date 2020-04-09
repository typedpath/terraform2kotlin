package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_rds_cluster_endpoint(val cluster_endpoint_identifier : String, val cluster_identifier : String, val custom_endpoint_type : Custom_endpoint_type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var excluded_members: List<String>? = null
  var static_members: List<String>? = null
 

enum class Custom_endpoint_type(val theValue: String ) {
	 READER ("READER"), ANY ("ANY") ;
	override fun toString() = theValue
	}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
