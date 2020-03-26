package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_acmpca_certificate_authority(val certificate_authority_configuration : List<Certificate_authority_configuration>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enabled: Boolean? = null
  var tags: Map<String, String>? = null
  var type: Type? = null
  var revocation_configuration: List<Revocation_configuration>? = null
  var permanent_deletion_time_in_days: Int? = null
 

enum class Type(val theValue: String ) {
	 ROOT ("ROOT"), SUBORDINATE ("SUBORDINATE") ;
	override fun toString() = theValue
	}

class Certificate_authority_configuration(val key_algorithm : Key_algorithm, val signing_algorithm : Signing_algorithm, val subject : List<Subject>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Signing_algorithm(val theValue: String ) {
	 SHA256WITHECDSA ("SHA256WITHECDSA"), SHA256WITHRSA ("SHA256WITHRSA"), SHA384WITHECDSA ("SHA384WITHECDSA"), SHA384WITHRSA ("SHA384WITHRSA"), SHA512WITHECDSA ("SHA512WITHECDSA"), SHA512WITHRSA ("SHA512WITHRSA") ;
	override fun toString() = theValue
	}
enum class Key_algorithm(val theValue: String ) {
	 EC_prime256v1 ("EC_prime256v1"), EC_secp384r1 ("EC_secp384r1"), RSA_2048 ("RSA_2048"), RSA_4096 ("RSA_4096") ;
	override fun toString() = theValue
	}

class Subject() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var country: String? = null
  var generation_qualifier: String? = null
  var given_name: String? = null
  var initials: String? = null
  var surname: String? = null
  var pseudonym: String? = null
  var state: String? = null
  var title: String? = null
  var common_name: String? = null
  var distinguished_name_qualifier: String? = null
  var locality: String? = null
  var organization: String? = null
  var organizational_unit: String? = null
 

}
}

class Revocation_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var crl_configuration: List<Crl_configuration>? = null
 


class Crl_configuration(val expiration_in_days : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var custom_cname: String? = null
  var enabled: Boolean? = null
  var s3_bucket_name: String? = null
 

}
}
fun certificate_chainRef(subPath: String = "") = ref(this, "certificate_chain", subPath)
fun certificate_signing_requestRef(subPath: String = "") = ref(this, "certificate_signing_request", subPath)
fun not_afterRef(subPath: String = "") = ref(this, "not_after", subPath)
fun serialRef(subPath: String = "") = ref(this, "serial", subPath)
fun statusRef(subPath: String = "") = ref(this, "status", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun certificateRef(subPath: String = "") = ref(this, "certificate", subPath)
fun not_beforeRef(subPath: String = "") = ref(this, "not_before", subPath)
fun revocation_configurationRef(subPath: String = "") = ref(this, "revocation_configuration", subPath)
fun typeRef(subPath: String = "") = ref(this, "type", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
}
