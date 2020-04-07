package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dax_cluster(val iam_role_arn : String, val replication_factor : Int, val cluster_name : String, val node_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var server_side_encryption: List<Server_side_encryption>? = null
  var subnet_group_name: String? = null
  var description: String? = null
  var parameter_group_name: String? = null
  var tags: Map<String, String>? = null
  var availability_zones: List<String>? = null
  var notification_topic_arn: String? = null
  var maintenance_window: String? = null
  var security_group_ids: List<String>? = null
 


class Server_side_encryption() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
 

}
}
