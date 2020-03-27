package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_kms_key() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var key_usage: Key_usage? = null
  var is_enabled: Boolean? = null
  var customer_master_key_spec: Customer_master_key_spec? = null
  var policy: String? = null
  var enable_key_rotation: Boolean? = null
  var deletion_window_in_days: Int? = null
  var tags: Map<String, String>? = null
 

enum class Customer_master_key_spec(val theValue: String ) {
	 SYMMETRIC_DEFAULT ("SYMMETRIC_DEFAULT"), RSA_2048 ("RSA_2048"), RSA_3072 ("RSA_3072"), RSA_4096 ("RSA_4096"), ECC_NIST_P256 ("ECC_NIST_P256"), ECC_NIST_P384 ("ECC_NIST_P384"), ECC_NIST_P521 ("ECC_NIST_P521"), ECC_SECG_P256K1 ("ECC_SECG_P256K1") ;
	override fun toString() = theValue
	}
enum class Key_usage(val theValue: String ) {
	 ENCRYPT_DECRYPT ("ENCRYPT_DECRYPT"), SIGN_VERIFY ("SIGN_VERIFY") ;
	override fun toString() = theValue
	}
fun aws_account_idRef(subPath: String = "") = ref(this, "aws_account_id", subPath)
fun key_managerRef(subPath: String = "") = ref(this, "key_manager", subPath)
fun key_usageRef(subPath: String = "") = ref(this, "key_usage", subPath)
fun customer_master_key_specRef(subPath: String = "") = ref(this, "customer_master_key_spec", subPath)
fun originRef(subPath: String = "") = ref(this, "origin", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun grant_tokensRef(subPath: String = "") = ref(this, "grant_tokens", subPath)
fun deletion_dateRef(subPath: String = "") = ref(this, "deletion_date", subPath)
fun enabledRef(subPath: String = "") = ref(this, "enabled", subPath)
fun expiration_modelRef(subPath: String = "") = ref(this, "expiration_model", subPath)
fun valid_toRef(subPath: String = "") = ref(this, "valid_to", subPath)
fun key_idRef(subPath: String = "") = ref(this, "key_id", subPath)
fun key_stateRef(subPath: String = "") = ref(this, "key_state", subPath)
fun creation_dateRef(subPath: String = "") = ref(this, "creation_date", subPath)
}
