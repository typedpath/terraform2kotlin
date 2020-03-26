package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_elastic_beanstalk_application_version(val name : String, val application : String, val bucket : String, val key : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var force_delete: Boolean? = null
  var tags: Map<String, String>? = null
 

}
