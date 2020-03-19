package com.typedpath.terraform2kotlin.aws.schema

class aws_dynamodb_table(val name : String, val hash_key : String, val attribute : List<Attribute>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var global_secondary_index: List<Global_secondary_index>? = null
  var stream_enabled: Boolean? = null
  var write_capacity: Int? = null
  var range_key: String? = null
  var billing_mode: Billing_mode? = null
  var tags: Map<String, String>? = null
  var server_side_encryption: List<Server_side_encryption>? = null
  var point_in_time_recovery: List<Point_in_time_recovery>? = null
  var read_capacity: Int? = null
  var ttl: List<Ttl>? = null
  var local_secondary_index: List<Local_secondary_index>? = null
  var stream_view_type: Stream_view_type? = null
 

enum class Billing_mode(val theValue: String ) {
	 PAY_PER_REQUEST ("PAY_PER_REQUEST"), PROVISIONED ("PROVISIONED") ;
	override fun toString() = theValue
	}
enum class Stream_view_type(val theValue: String ) {
	 NEW_IMAGE ("NEW_IMAGE"), OLD_IMAGE ("OLD_IMAGE"), NEW_AND_OLD_IMAGES ("NEW_AND_OLD_IMAGES"), KEYS_ONLY ("KEYS_ONLY") ;
	override fun toString() = theValue
	}

class Attribute(val type : Type, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Type(val theValue: String ) {
	 B ("B"), N ("N"), S ("S") ;
	override fun toString() = theValue
	}
}

class Server_side_encryption(val enabled : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var kms_key_arn: String? = null
 

}

class Point_in_time_recovery(val enabled : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Ttl(val attribute_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
 

}

class Local_secondary_index(val name : String, val range_key : String, val projection_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var non_key_attributes: List<String>? = null
 

}

class Global_secondary_index(val name : String, val hash_key : String, val projection_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var write_capacity: Int? = null
  var read_capacity: Int? = null
  var range_key: String? = null
  var non_key_attributes: List<String>? = null
 

}
}
