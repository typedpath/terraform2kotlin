package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_user_ssh_key(val encoding : Encoding, val username : String, val public_key : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var status: String? = null
 

enum class Encoding(val theValue: String ) {
	 SSH ("SSH"), PEM ("PEM") ;
	override fun toString() = theValue
	}
}
