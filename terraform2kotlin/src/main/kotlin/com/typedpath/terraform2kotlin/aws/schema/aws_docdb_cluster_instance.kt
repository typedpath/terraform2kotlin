package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_docdb_cluster_instance(val instance_class : String, val cluster_identifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var apply_immediately: Boolean? = null
  var identifier_prefix: String? = null
  var preferred_maintenance_window: String? = null
  var ca_cert_identifier: String? = null
  var tags: Map<String, String>? = null
  var availability_zone: String? = null
  var identifier: String? = null
  var auto_minor_version_upgrade: Boolean? = null
  var engine: Engine? = null
  var promotion_tier: Int? = null
 

enum class Engine(val theValue: String ) {
	 docdb ("docdb") ;
	override fun toString() = theValue
	}
}
