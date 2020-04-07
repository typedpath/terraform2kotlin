package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_nat_gateway(val allocation_id : String, val subnet_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 

fun stateRef(subPath: String = "") = ref(this, "state", subPath)
fun subnet_idRef(subPath: String = "") = ref(this, "subnet_id", subPath)
fun network_interface_idRef(subPath: String = "") = ref(this, "network_interface_id", subPath)
fun public_ipRef(subPath: String = "") = ref(this, "public_ip", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
fun allocation_idRef(subPath: String = "") = ref(this, "allocation_id", subPath)
fun private_ipRef(subPath: String = "") = ref(this, "private_ip", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
}
