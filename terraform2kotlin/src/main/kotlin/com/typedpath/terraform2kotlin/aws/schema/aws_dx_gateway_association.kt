package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dx_gateway_association(val dx_gateway_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var associated_gateway_id: String? = null
  var proposal_id: String? = null
  var vpn_gateway_id: String? = null
  var allowed_prefixes: List<String>? = null
  var associated_gateway_owner_account_id: String? = null
 

}
