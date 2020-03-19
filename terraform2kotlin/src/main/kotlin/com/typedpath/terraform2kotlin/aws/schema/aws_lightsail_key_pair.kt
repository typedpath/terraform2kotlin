package com.typedpath.terraform2kotlin.aws.schema

class aws_lightsail_key_pair() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var pgp_key: String? = null
  var public_key: String? = null
  var name: String? = null
  var name_prefix: String? = null
 

}
