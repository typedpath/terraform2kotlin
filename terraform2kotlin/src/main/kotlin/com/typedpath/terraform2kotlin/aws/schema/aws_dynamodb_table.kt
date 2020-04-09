package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dynamodb_table(val hash_key : String, val attribute : List<Attribute>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var billing_mode: Billing_mode? = null
  var server_side_encryption: List<Server_side_encryption>? = null
  var read_capacity: Int? = null
  var ttl: List<Ttl>? = null
  var local_secondary_index: List<Local_secondary_index>? = null
  var global_secondary_index: List<Global_secondary_index>? = null
  var stream_view_type: Stream_view_type? = null
  var tags: Map<String, String>? = null
  var stream_enabled: Boolean? = null
  var point_in_time_recovery: List<Point_in_time_recovery>? = null
  var range_key: String? = null
  var write_capacity: Int? = null
 

enum class Billing_mode(val theValue: String ) {
	 PAY_PER_REQUEST ("PAY_PER_REQUEST"), PROVISIONED ("PROVISIONED") ;
	override fun toString() = theValue
	}
enum class Stream_view_type(val theValue: String ) {
	 NEW_IMAGE ("NEW_IMAGE"), OLD_IMAGE ("OLD_IMAGE"), NEW_AND_OLD_IMAGES ("NEW_AND_OLD_IMAGES"), KEYS_ONLY ("KEYS_ONLY") ;
	override fun toString() = theValue
	}

class Attribute(val name : String, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
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

class Ttl(val attribute_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
 

}

class Local_secondary_index(val name : String, val range_key : String, val projection_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var non_key_attributes: List<String>? = null
 

}

class Global_secondary_index(val projection_type : String, val name : String, val hash_key : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var range_key: String? = null
  var non_key_attributes: List<String>? = null
  var write_capacity: Int? = null
  var read_capacity: Int? = null
 

}

class Point_in_time_recovery(val enabled : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
fun stream_view_typeRef(subPath: String = "") = ref(this, "stream_view_type", subPath)
fun ttlRef(subPath: String = "") = ref(this, "ttl", subPath)
fun attributeRef(subPath: String = "") = ref(this, "attribute", subPath)
fun read_capacityRef(subPath: String = "") = ref(this, "read_capacity", subPath)
fun stream_enabledRef(subPath: String = "") = ref(this, "stream_enabled", subPath)
fun write_capacityRef(subPath: String = "") = ref(this, "write_capacity", subPath)
fun local_secondary_indexRef(subPath: String = "") = ref(this, "local_secondary_index", subPath)
fun hash_keyRef(subPath: String = "") = ref(this, "hash_key", subPath)
fun stream_arnRef(subPath: String = "") = ref(this, "stream_arn", subPath)
fun server_side_encryptionRef(subPath: String = "") = ref(this, "server_side_encryption", subPath)
fun point_in_time_recoveryRef(subPath: String = "") = ref(this, "point_in_time_recovery", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun global_secondary_indexRef(subPath: String = "") = ref(this, "global_secondary_index", subPath)
fun range_keyRef(subPath: String = "") = ref(this, "range_key", subPath)
fun stream_labelRef(subPath: String = "") = ref(this, "stream_label", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun billing_modeRef(subPath: String = "") = ref(this, "billing_mode", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
