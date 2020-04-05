package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_api_key(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var value: String? = null
  var tags: Map<String, String>? = null
  var enabled: Boolean? = null
  var stage_key: List<Stage_key>? = null
 


class Stage_key(val stage_name : String, val rest_api_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
fun last_updated_dateRef(subPath: String = "") = ref(this, "last_updated_date", subPath)
fun enabledRef(subPath: String = "") = ref(this, "enabled", subPath)
fun valueRef(subPath: String = "") = ref(this, "value", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun created_dateRef(subPath: String = "") = ref(this, "created_date", subPath)
}
