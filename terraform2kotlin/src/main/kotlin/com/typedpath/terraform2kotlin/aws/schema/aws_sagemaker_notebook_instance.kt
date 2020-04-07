package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_sagemaker_notebook_instance(val name : String, val role_arn : String, val instance_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var kms_key_id: String? = null
  var tags: Map<String, String>? = null
  var subnet_id: String? = null
  var security_groups: List<String>? = null
  var lifecycle_config_name: String? = null
  var direct_internet_access: Direct_internet_access? = null
 

enum class Direct_internet_access(val theValue: String ) {
	 Disabled ("Disabled"), Enabled ("Enabled") ;
	override fun toString() = theValue
	}
}
