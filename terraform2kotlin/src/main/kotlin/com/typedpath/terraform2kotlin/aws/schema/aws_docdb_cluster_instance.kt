package com.typedpath.terraform2kotlin.aws.schema

class aws_docdb_cluster_instance(val cluster_identifier : String, val instance_class : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var auto_minor_version_upgrade: Boolean? = null
  var promotion_tier: Int? = null
  var identifier: String? = null
  var engine: Engine? = null
  var identifier_prefix: String? = null
  var tags: Map<String, String>? = null
  var apply_immediately: Boolean? = null
  var availability_zone: String? = null
  var preferred_maintenance_window: String? = null
  var ca_cert_identifier: String? = null
 

enum class Engine(val theValue: String ) {
	 docdb ("docdb") ;
	override fun toString() = theValue
	}
}
