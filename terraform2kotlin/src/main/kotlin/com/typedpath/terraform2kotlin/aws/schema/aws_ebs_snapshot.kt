package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ebs_snapshot(val volume_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var description: String? = null
 

fun ownersRef(subPath: String = "") = ref(this, "owners", subPath)
fun data_encryption_key_idRef(subPath: String = "") = ref(this, "data_encryption_key_id", subPath)
fun owner_idRef(subPath: String = "") = ref(this, "owner_id", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun snapshot_idsRef(subPath: String = "") = ref(this, "snapshot_ids", subPath)
fun restorable_by_user_idsRef(subPath: String = "") = ref(this, "restorable_by_user_ids", subPath)
fun snapshot_idRef(subPath: String = "") = ref(this, "snapshot_id", subPath)
fun volume_idRef(subPath: String = "") = ref(this, "volume_id", subPath)
fun stateRef(subPath: String = "") = ref(this, "state", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun most_recentRef(subPath: String = "") = ref(this, "most_recent", subPath)
fun encryptedRef(subPath: String = "") = ref(this, "encrypted", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun owner_aliasRef(subPath: String = "") = ref(this, "owner_alias", subPath)
fun volume_sizeRef(subPath: String = "") = ref(this, "volume_size", subPath)
fun kms_key_idRef(subPath: String = "") = ref(this, "kms_key_id", subPath)
}
