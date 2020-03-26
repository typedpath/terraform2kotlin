package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_codestarnotifications_notification_rule(val detail_type : Detail_type, val event_type_ids : List<String>, val name : String, val resource : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var status: Status? = null
  var tags: Map<String, String>? = null
  var target: List<Target>? = null
 

enum class Detail_type(val theValue: String ) {
	 BASIC ("BASIC"), FULL ("FULL") ;
	override fun toString() = theValue
	}
enum class Status(val theValue: String ) {
	 ENABLED ("ENABLED"), DISABLED ("DISABLED") ;
	override fun toString() = theValue
	}

class Target(val address : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var type: String? = null
 

}
}
