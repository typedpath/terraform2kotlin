package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudhsm_v2_cluster(val hsm_type : Hsm_type, val subnet_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var source_backup_identifier: String? = null
  var tags: Map<String, String>? = null
 

enum class Hsm_type(val theValue: String ) {
	 hsm1_medium ("hsm1.medium") ;
	override fun toString() = theValue
	}
fun security_group_idRef(subPath: String = "") = ref(this, "security_group_id", subPath)
fun cluster_certificatesRef(subPath: String = "") = ref(this, "cluster_certificates", subPath)
fun subnet_idsRef(subPath: String = "") = ref(this, "subnet_ids", subPath)
fun cluster_idRef(subPath: String = "") = ref(this, "cluster_id", subPath)
fun cluster_stateRef(subPath: String = "") = ref(this, "cluster_state", subPath)
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
