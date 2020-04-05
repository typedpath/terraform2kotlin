package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_redshift_security_group(val name : String, val ingress : List<Ingress>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
 


class Ingress() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cidr: String? = null
  var security_group_name: String? = null
  var security_group_owner_id: String? = null
 

}
}
