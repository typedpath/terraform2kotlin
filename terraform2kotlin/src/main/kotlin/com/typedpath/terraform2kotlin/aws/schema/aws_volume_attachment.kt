package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_volume_attachment(val volume_id : String, val device_name : String, val instance_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var skip_destroy: Boolean? = null
  var force_detach: Boolean? = null
 

}
