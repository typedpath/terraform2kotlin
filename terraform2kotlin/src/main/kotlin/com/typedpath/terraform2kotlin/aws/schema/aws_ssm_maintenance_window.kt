package com.typedpath.terraform2kotlin.aws.schema

class aws_ssm_maintenance_window(val name : String, val schedule : String, val cutoff : Int, val duration : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enabled: Boolean? = null
  var start_date: String? = null
  var schedule_timezone: String? = null
  var tags: Map<String, String>? = null
  var description: String? = null
  var allow_unassociated_targets: Boolean? = null
  var end_date: String? = null
 

}
