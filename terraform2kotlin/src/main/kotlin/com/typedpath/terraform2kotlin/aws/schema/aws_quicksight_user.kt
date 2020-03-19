package com.typedpath.terraform2kotlin.aws.schema

class aws_quicksight_user(val email : String, val identity_type : Identity_type, val user_role : User_role) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var iam_arn: String? = null
  var namespace: Namespace? = null
  var session_name: String? = null
  var user_name: String? = null
  var aws_account_id: String? = null
 

enum class Identity_type(val theValue: String ) {
	 IAM ("IAM"), QUICKSIGHT ("QUICKSIGHT") ;
	override fun toString() = theValue
	}
enum class User_role(val theValue: String ) {
	 READER ("READER"), AUTHOR ("AUTHOR"), ADMIN ("ADMIN") ;
	override fun toString() = theValue
	}
enum class Namespace(val theValue: String ) {
	 default ("default") ;
	override fun toString() = theValue
	}
}
