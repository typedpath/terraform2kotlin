package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_pinpoint_apns_voip_sandbox_channel(val application_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var token_key_id: String? = null
  var bundle_id: String? = null
  var default_authentication_method: String? = null
  var enabled: Boolean? = null
  var private_key: String? = null
  var team_id: String? = null
  var token_key: String? = null
  var certificate: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
