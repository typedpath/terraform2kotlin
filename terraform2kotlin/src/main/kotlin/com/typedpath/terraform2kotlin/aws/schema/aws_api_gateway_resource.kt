package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_resource(val path_part : String, val rest_api_id : String, val parent_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

fun rest_api_idRef(subPath: String = "") = ref(this, "rest_api_id", subPath)
fun pathRef(subPath: String = "") = ref(this, "path", subPath)
fun path_partRef(subPath: String = "") = ref(this, "path_part", subPath)
fun parent_idRef(subPath: String = "") = ref(this, "parent_id", subPath)
}
