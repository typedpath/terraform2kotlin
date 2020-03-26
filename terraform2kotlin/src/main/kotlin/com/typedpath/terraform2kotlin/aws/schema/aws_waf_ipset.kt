package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_waf_ipset(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ip_set_descriptors: List<Ip_set_descriptors>? = null
 


class Ip_set_descriptors(val type : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
}
