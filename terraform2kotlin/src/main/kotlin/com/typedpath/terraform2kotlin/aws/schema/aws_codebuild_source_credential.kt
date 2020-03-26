package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_codebuild_source_credential(val server_type : Server_type, val token : String, val auth_type : Auth_type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var user_name: String? = null
 

enum class Server_type(val theValue: String ) {
	 GITHUB ("GITHUB"), BITBUCKET ("BITBUCKET"), GITHUB_ENTERPRISE ("GITHUB_ENTERPRISE") ;
	override fun toString() = theValue
	}
enum class Auth_type(val theValue: String ) {
	 BASIC_AUTH ("BASIC_AUTH"), PERSONAL_ACCESS_TOKEN ("PERSONAL_ACCESS_TOKEN") ;
	override fun toString() = theValue
	}
}
