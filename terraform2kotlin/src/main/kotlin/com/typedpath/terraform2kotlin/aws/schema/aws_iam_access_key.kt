package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_access_key(val user : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var pgp_key: String? = null
  var status: Status? = null
 

enum class Status(val theValue: String ) {
	 Active ("Active"), Inactive ("Inactive") ;
	override fun toString() = theValue
	}
}
