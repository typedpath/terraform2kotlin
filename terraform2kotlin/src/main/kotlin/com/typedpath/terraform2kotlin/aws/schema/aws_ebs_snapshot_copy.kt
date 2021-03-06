package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ebs_snapshot_copy(val source_region : String, val source_snapshot_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var description: String? = null
  var encrypted: Boolean? = null
  var kms_key_id: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
