package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_eks_fargate_profile(val cluster_name : String, val fargate_profile_name : String, val pod_execution_role_arn : String, val selector : List<Selector>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var subnet_ids: List<String>? = null
  var tags: Map<String, String>? = null
 


class Selector(val namespace : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var labels: Map<String, String>? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
