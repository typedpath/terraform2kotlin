package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_worklink_website_certificate_authority_association(val fleet_arn : String, val certificate : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var display_name: String? = null
 

}
