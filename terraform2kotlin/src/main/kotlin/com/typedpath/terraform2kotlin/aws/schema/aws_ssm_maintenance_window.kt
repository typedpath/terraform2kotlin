package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ssm_maintenance_window(val schedule : String, val name : String, val duration : Int, val cutoff : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var enabled: Boolean? = null
  var start_date: String? = null
  var tags: Map<String, String>? = null
  var allow_unassociated_targets: Boolean? = null
  var end_date: String? = null
  var schedule_timezone: String? = null
 

}
