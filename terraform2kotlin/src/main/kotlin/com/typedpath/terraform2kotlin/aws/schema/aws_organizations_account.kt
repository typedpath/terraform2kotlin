package com.typedpath.terraform2kotlin.aws.schema

class aws_organizations_account(val email : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var iam_user_access_to_billing: Iam_user_access_to_billing? = null
  var tags: Map<String, String>? = null
  var parent_id: String? = null
  var role_name: String? = null
 

enum class Iam_user_access_to_billing(val theValue: String ) {
	 ALLOW ("ALLOW"), DENY ("DENY") ;
	override fun toString() = theValue
	}
}
