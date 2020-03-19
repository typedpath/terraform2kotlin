package com.typedpath.terraform2kotlin.aws.schema

class aws_kms_key() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var policy: String? = null
  var is_enabled: Boolean? = null
  var enable_key_rotation: Boolean? = null
  var deletion_window_in_days: Int? = null
  var description: String? = null
  var key_usage: Key_usage? = null
  var customer_master_key_spec: Customer_master_key_spec? = null
  var tags: Map<String, String>? = null
 

enum class Key_usage(val theValue: String ) {
	 ENCRYPT_DECRYPT ("ENCRYPT_DECRYPT"), SIGN_VERIFY ("SIGN_VERIFY") ;
	override fun toString() = theValue
	}
enum class Customer_master_key_spec(val theValue: String ) {
	 SYMMETRIC_DEFAULT ("SYMMETRIC_DEFAULT"), RSA_2048 ("RSA_2048"), RSA_3072 ("RSA_3072"), RSA_4096 ("RSA_4096"), ECC_NIST_P256 ("ECC_NIST_P256"), ECC_NIST_P384 ("ECC_NIST_P384"), ECC_NIST_P521 ("ECC_NIST_P521"), ECC_SECG_P256K1 ("ECC_SECG_P256K1") ;
	override fun toString() = theValue
	}
}
