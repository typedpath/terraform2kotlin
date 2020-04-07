package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ssm_maintenance_window(val name : String, val schedule : String, val duration : Int, val cutoff : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enabled: Boolean? = null
  var end_date: String? = null
  var schedule_timezone: String? = null
  var description: String? = null
  var allow_unassociated_targets: Boolean? = null
  var start_date: String? = null
  var tags: Map<String, String>? = null
 

}
