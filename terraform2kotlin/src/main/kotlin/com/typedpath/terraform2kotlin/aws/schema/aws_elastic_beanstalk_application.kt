package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_elastic_beanstalk_application(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var description: String? = null
  var appversion_lifecycle: List<Appversion_lifecycle>? = null
 


class Appversion_lifecycle(val service_role : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var max_age_in_days: Int? = null
  var max_count: Int? = null
  var delete_source_from_s3: Boolean? = null
 

}
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun appversion_lifecycleRef(subPath: String = "") = ref(this, "appversion_lifecycle", subPath)
}
