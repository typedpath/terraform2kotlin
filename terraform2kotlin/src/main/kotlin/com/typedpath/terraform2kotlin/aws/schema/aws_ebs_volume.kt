package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ebs_volume(val availability_zone : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var encrypted: Boolean? = null
  var type: String? = null
  var size: Int? = null
  var snapshot_id: String? = null
  var iops: Int? = null
  var kms_key_id: String? = null
 

fun volume_typeRef(subPath: String = "") = ref(this, "volume_type", subPath)
fun sizeRef(subPath: String = "") = ref(this, "size", subPath)
fun snapshot_idRef(subPath: String = "") = ref(this, "snapshot_id", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun most_recentRef(subPath: String = "") = ref(this, "most_recent", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun availability_zoneRef(subPath: String = "") = ref(this, "availability_zone", subPath)
fun encryptedRef(subPath: String = "") = ref(this, "encrypted", subPath)
fun iopsRef(subPath: String = "") = ref(this, "iops", subPath)
fun kms_key_idRef(subPath: String = "") = ref(this, "kms_key_id", subPath)
fun volume_idRef(subPath: String = "") = ref(this, "volume_id", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
