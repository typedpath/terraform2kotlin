package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_elastictranscoder_pipeline(val input_bucket : String, val role : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var thumbnail_config: List<Thumbnail_config>? = null
  var aws_kms_key_arn: String? = null
  var content_config_permissions: List<Content_config_permissions>? = null
  var notifications: List<Notifications>? = null
  var content_config: List<Content_config>? = null
  var name: String? = null
  var output_bucket: String? = null
  var thumbnail_config_permissions: List<Thumbnail_config_permissions>? = null
 


class Thumbnail_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var bucket: String? = null
  var storage_class: String? = null
 

}

class Content_config_permissions() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var access: List<String>? = null
  var grantee: String? = null
  var grantee_type: String? = null
 

}

class Notifications() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var completed: String? = null
  var error: String? = null
  var progressing: String? = null
  var warning: String? = null
 

}

class Content_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var bucket: String? = null
  var storage_class: String? = null
 

}

class Thumbnail_config_permissions() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var access: List<String>? = null
  var grantee: String? = null
  var grantee_type: String? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
