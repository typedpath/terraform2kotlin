package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_kinesis_stream(val name : String, val shard_count : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var retention_period: Int? = null
  var encryption_type: Encryption_type? = null
  var shard_level_metrics: List<String>? = null
  var enforce_consumer_deletion: Boolean? = null
  var kms_key_id: String? = null
  var arn: String? = null
  var tags: Map<String, String>? = null
 

enum class Encryption_type(val theValue: String ) {
	 NONE ("NONE"), KMS ("KMS") ;
	override fun toString() = theValue
	}
fun statusRef(subPath: String = "") = ref(this, "status", subPath)
fun retention_periodRef(subPath: String = "") = ref(this, "retention_period", subPath)
fun closed_shardsRef(subPath: String = "") = ref(this, "closed_shards", subPath)
fun creation_timestampRef(subPath: String = "") = ref(this, "creation_timestamp", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun open_shardsRef(subPath: String = "") = ref(this, "open_shards", subPath)
fun shard_level_metricsRef(subPath: String = "") = ref(this, "shard_level_metrics", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
}
