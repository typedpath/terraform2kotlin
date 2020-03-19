package com.typedpath.terraform2kotlin.aws.schema

class aws_elastic_beanstalk_application(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var appversion_lifecycle: List<Appversion_lifecycle>? = null
  var tags: Map<String, String>? = null
  var description: String? = null
 


class Appversion_lifecycle(val service_role : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var delete_source_from_s3: Boolean? = null
  var max_age_in_days: Int? = null
  var max_count: Int? = null
 

}
}
