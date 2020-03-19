package com.typedpath.terraform2kotlin.aws.schema

class aws_rds_global_cluster(val global_cluster_identifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var database_name: String? = null
  var deletion_protection: Boolean? = null
  var engine: Engine? = null
  var engine_version: String? = null
  var storage_encrypted: Boolean? = null
 

enum class Engine(val theValue: String ) {
	 aurora ("aurora"), aurora_mysql ("aurora-mysql") ;
	override fun toString() = theValue
	}
}
