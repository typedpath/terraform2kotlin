package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_elastic_beanstalk_application_version(val application : String, val bucket : String, val key : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var force_delete: Boolean? = null
  var tags: Map<String, String>? = null
  var description: String? = null
 

}
