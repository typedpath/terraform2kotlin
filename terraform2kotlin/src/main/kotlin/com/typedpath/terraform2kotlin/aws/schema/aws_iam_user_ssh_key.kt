package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_user_ssh_key(val username : String, val public_key : String, val encoding : Encoding) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var status: String? = null
 

enum class Encoding(val theValue: String ) {
	 SSH ("SSH"), PEM ("PEM") ;
	override fun toString() = theValue
	}
}
