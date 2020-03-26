package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cognito_identity_pool_roles_attachment(val identity_pool_id : String, val roles : Map<String, String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var role_mapping: List<Role_mapping>? = null
 


class Role_mapping(val identity_provider : String, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ambiguous_role_resolution: Ambiguous_role_resolution? = null
  var mapping_rule: List<Mapping_rule>? = null
 

enum class Type(val theValue: String ) {
	 Token ("Token"), Rules ("Rules") ;
	override fun toString() = theValue
	}
enum class Ambiguous_role_resolution(val theValue: String ) {
	 AuthenticatedRole ("AuthenticatedRole"), Deny ("Deny") ;
	override fun toString() = theValue
	}

class Mapping_rule(val value : String, val claim : String, val match_type : Match_type, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Match_type(val theValue: String ) {
	 Equals ("Equals"), Contains ("Contains"), StartsWith ("StartsWith"), NotEqual ("NotEqual") ;
	override fun toString() = theValue
	}
}
}
}
