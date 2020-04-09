package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dx_gateway_association_proposal(val dx_gateway_id : String, val dx_gateway_owner_account_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var vpn_gateway_id: String? = null
  var allowed_prefixes: List<String>? = null
  var associated_gateway_id: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
