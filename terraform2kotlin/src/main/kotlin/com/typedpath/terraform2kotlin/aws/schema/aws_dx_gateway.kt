package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dx_gateway(val name : String, val amazon_side_asn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

fun amazon_side_asnRef(subPath: String = "") = ref(this, "amazon_side_asn", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun owner_account_idRef(subPath: String = "") = ref(this, "owner_account_id", subPath)
}
