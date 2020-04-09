package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_backup_selection(val name : String, val plan_id : String, val iam_role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var selection_tag: List<Selection_tag>? = null
  var resources: List<String>? = null
 


class Selection_tag(val type : Type, val key : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Type(val theValue: String ) {
	 STRINGEQUALS ("STRINGEQUALS") ;
	override fun toString() = theValue
	}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
