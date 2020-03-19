package com.typedpath.terraform2kotlin.aws.schema

class aws_guardduty_detector() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enable: Boolean? = null
  var finding_publishing_frequency: String? = null
 

}
