package com.typedpath.terraform2kotlin.aws.schema

class aws_msk_configuration(val kafka_versions : List<String>, val name : String, val server_properties : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
 

}
