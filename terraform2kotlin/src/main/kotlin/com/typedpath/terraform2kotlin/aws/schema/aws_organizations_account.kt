package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_organizations_account(val name : String, val email : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var role_name: String? = null
  var tags: Map<String, String>? = null
  var parent_id: String? = null
  var iam_user_access_to_billing: Iam_user_access_to_billing? = null
 

enum class Iam_user_access_to_billing(val theValue: String ) {
	 ALLOW ("ALLOW"), DENY ("DENY") ;
	override fun toString() = theValue
	}
}
