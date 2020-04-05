package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_licensemanager_license_configuration(val license_counting_type : License_counting_type, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var license_count: Int? = null
  var license_count_hard_limit: Boolean? = null
  var license_rules: List<String>? = null
  var tags: Map<String, String>? = null
 

enum class License_counting_type(val theValue: String ) {
	 vCPU ("vCPU"), Instance ("Instance"), Core ("Core"), Socket ("Socket") ;
	override fun toString() = theValue
	}
}
