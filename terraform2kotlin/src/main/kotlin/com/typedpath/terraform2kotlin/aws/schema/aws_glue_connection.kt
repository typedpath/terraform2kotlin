package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_glue_connection(val connection_properties : Map<String, String>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var connection_type: Connection_type? = null
  var description: String? = null
  var match_criteria: List<String>? = null
  var physical_connection_requirements: List<Physical_connection_requirements>? = null
  var catalog_id: String? = null
 

enum class Connection_type(val theValue: String ) {
	 JDBC ("JDBC"), SFTP ("SFTP") ;
	override fun toString() = theValue
	}

class Physical_connection_requirements() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var security_group_id_list: List<String>? = null
  var subnet_id: String? = null
  var availability_zone: String? = null
 

}
}
