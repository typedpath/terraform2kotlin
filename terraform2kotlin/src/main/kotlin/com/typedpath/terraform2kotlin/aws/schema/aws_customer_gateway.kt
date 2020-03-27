package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_customer_gateway(val bgp_asn : Int, val ip_address : String, val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 

fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
fun bgp_asnRef(subPath: String = "") = ref(this, "bgp_asn", subPath)
fun ip_addressRef(subPath: String = "") = ref(this, "ip_address", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun typeRef(subPath: String = "") = ref(this, "type", subPath)
}
