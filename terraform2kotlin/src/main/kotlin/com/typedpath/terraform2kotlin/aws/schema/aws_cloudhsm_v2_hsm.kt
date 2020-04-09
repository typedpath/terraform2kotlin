package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudhsm_v2_hsm(val cluster_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ip_address: String? = null
  var subnet_id: String? = null
  var availability_zone: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
