package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_access_key(val user : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var status: Status? = null
  var pgp_key: String? = null
 

enum class Status(val theValue: String ) {
	 Active ("Active"), Inactive ("Inactive") ;
	override fun toString() = theValue
	}
}
