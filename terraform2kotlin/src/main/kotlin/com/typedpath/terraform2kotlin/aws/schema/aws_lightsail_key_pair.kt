package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lightsail_key_pair() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name_prefix: String? = null
  var name: String? = null
  var pgp_key: String? = null
  var public_key: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
