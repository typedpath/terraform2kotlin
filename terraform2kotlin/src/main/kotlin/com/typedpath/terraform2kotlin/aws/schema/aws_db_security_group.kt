package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_db_security_group(val name : String, val ingress : List<Ingress>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var description: String? = null
 


class Ingress() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cidr: String? = null
  var security_group_name: String? = null
  var security_group_id: String? = null
  var security_group_owner_id: String? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
