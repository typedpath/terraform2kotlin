package com.typedpath.terraform2kotlin.aws.schema

class aws_qldb_ledger() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var deletion_protection: Boolean? = null
  var tags: Map<String, String>? = null
 

}
