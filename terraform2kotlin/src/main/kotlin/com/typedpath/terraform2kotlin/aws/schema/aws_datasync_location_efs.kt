package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_datasync_location_efs(val ec2_config : List<Ec2_config>, val efs_file_system_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var subdirectory: String? = null
  var tags: Map<String, String>? = null
 


class Ec2_config(val security_group_arns : List<String>, val subnet_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
