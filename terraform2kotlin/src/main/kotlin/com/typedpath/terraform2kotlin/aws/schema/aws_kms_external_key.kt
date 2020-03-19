package com.typedpath.terraform2kotlin.aws.schema

class aws_kms_external_key() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var deletion_window_in_days: Int? = null
  var enabled: Boolean? = null
  var policy: String? = null
  var tags: Map<String, String>? = null
  var valid_to: String? = null
  var description: String? = null
  var key_material_base64: String? = null
 

}
