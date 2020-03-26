package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_codebuild_webhook(val project_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var branch_filter: String? = null
  var filter_group: List<Filter_group>? = null
 


class Filter_group() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var filter: List<Filter>? = null
 


class Filter(val type : Type, val pattern : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var exclude_matched_pattern: Boolean? = null
 

enum class Type(val theValue: String ) {
	 EVENT ("EVENT"), ACTOR_ACCOUNT_ID ("ACTOR_ACCOUNT_ID"), BASE_REF ("BASE_REF"), FILE_PATH ("FILE_PATH"), HEAD_REF ("HEAD_REF") ;
	override fun toString() = theValue
	}
}
}
}
