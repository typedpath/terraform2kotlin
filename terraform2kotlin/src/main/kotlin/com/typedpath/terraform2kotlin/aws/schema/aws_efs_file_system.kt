package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_efs_file_system() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var performance_mode: Performance_mode? = null
  var encrypted: Boolean? = null
  var throughput_mode: Throughput_mode? = null
  var lifecycle_policy: List<Lifecycle_policy>? = null
  var provisioned_throughput_in_mibps: Float? = null
  var tags: Map<String, String>? = null
  var creation_token: String? = null
  var reference_name: String? = null
  var kms_key_id: String? = null
 

enum class Throughput_mode(val theValue: String ) {
	 bursting ("bursting"), provisioned ("provisioned") ;
	override fun toString() = theValue
	}
enum class Performance_mode(val theValue: String ) {
	 generalPurpose ("generalPurpose"), maxIO ("maxIO") ;
	override fun toString() = theValue
	}

class Lifecycle_policy() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var transition_to_ia: Transition_to_ia? = null
 

enum class Transition_to_ia(val theValue: String ) {
	 AFTER_7_DAYS ("AFTER_7_DAYS"), AFTER_14_DAYS ("AFTER_14_DAYS"), AFTER_30_DAYS ("AFTER_30_DAYS"), AFTER_60_DAYS ("AFTER_60_DAYS"), AFTER_90_DAYS ("AFTER_90_DAYS") ;
	override fun toString() = theValue
	}
}
fun file_system_idRef(subPath: String = "") = ref(this, "file_system_id", subPath)
fun kms_key_idRef(subPath: String = "") = ref(this, "kms_key_id", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun throughput_modeRef(subPath: String = "") = ref(this, "throughput_mode", subPath)
fun provisioned_throughput_in_mibpsRef(subPath: String = "") = ref(this, "provisioned_throughput_in_mibps", subPath)
fun encryptedRef(subPath: String = "") = ref(this, "encrypted", subPath)
fun creation_tokenRef(subPath: String = "") = ref(this, "creation_token", subPath)
fun performance_modeRef(subPath: String = "") = ref(this, "performance_mode", subPath)
fun dns_nameRef(subPath: String = "") = ref(this, "dns_name", subPath)
fun lifecycle_policyRef(subPath: String = "") = ref(this, "lifecycle_policy", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
}
