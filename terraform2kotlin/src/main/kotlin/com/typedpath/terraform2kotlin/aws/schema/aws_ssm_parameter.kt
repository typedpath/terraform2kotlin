package com.typedpath.terraform2kotlin.aws.schema

class aws_ssm_parameter(val name : String, val type : Type, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var key_id: String? = null
  var overwrite: Boolean? = null
  var tags: Map<String, String>? = null
  var tier: Tier? = null
  var arn: String? = null
  var allowed_pattern: String? = null
  var description: String? = null
 

enum class Type(val theValue: String ) {
	 _String ("String"), StringList ("StringList"), SecureString ("SecureString") ;
	override fun toString() = theValue
	}
enum class Tier(val theValue: String ) {
	 Standard ("Standard"), Advanced ("Advanced") ;
	override fun toString() = theValue
	}
}
