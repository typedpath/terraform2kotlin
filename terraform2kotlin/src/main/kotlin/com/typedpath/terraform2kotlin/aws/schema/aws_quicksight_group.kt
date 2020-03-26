package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_quicksight_group(val group_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var aws_account_id: String? = null
  var description: String? = null
  var namespace: Namespace? = null
 

enum class Namespace(val theValue: String ) {
	 default ("default") ;
	override fun toString() = theValue
	}
}
