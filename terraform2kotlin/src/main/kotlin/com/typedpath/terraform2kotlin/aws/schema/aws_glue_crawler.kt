package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_glue_crawler(val name : String, val database_name : String, val role : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var schedule: String? = null
  var schema_change_policy: List<Schema_change_policy>? = null
  var s3_target: List<S3_target>? = null
  var description: String? = null
  var table_prefix: String? = null
  var catalog_target: List<Catalog_target>? = null
  var tags: Map<String, String>? = null
  var classifiers: List<String>? = null
  var configuration: String? = null
  var jdbc_target: List<Jdbc_target>? = null
  var dynamodb_target: List<Dynamodb_target>? = null
  var security_configuration: String? = null
 


class Schema_change_policy() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var update_behavior: Update_behavior? = null
  var delete_behavior: Delete_behavior? = null
 

enum class Update_behavior(val theValue: String ) {
	 LOG ("LOG"), UPDATE_IN_DATABASE ("UPDATE_IN_DATABASE") ;
	override fun toString() = theValue
	}
enum class Delete_behavior(val theValue: String ) {
	 DELETE_FROM_DATABASE ("DELETE_FROM_DATABASE"), DEPRECATE_IN_DATABASE ("DEPRECATE_IN_DATABASE"), LOG ("LOG") ;
	override fun toString() = theValue
	}
}

class S3_target(val path : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var exclusions: List<String>? = null
 

}

class Catalog_target(val database_name : String, val tables : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Jdbc_target(val path : String, val connection_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var exclusions: List<String>? = null
 

}

class Dynamodb_target(val path : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
