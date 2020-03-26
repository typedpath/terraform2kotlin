package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_docdb_cluster_instance(val instance_class : String, val cluster_identifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var identifier: String? = null
  var identifier_prefix: String? = null
  var promotion_tier: Int? = null
  var ca_cert_identifier: String? = null
  var availability_zone: String? = null
  var engine: Engine? = null
  var tags: Map<String, String>? = null
  var preferred_maintenance_window: String? = null
  var apply_immediately: Boolean? = null
  var auto_minor_version_upgrade: Boolean? = null
 

enum class Engine(val theValue: String ) {
	 docdb ("docdb") ;
	override fun toString() = theValue
	}
}
