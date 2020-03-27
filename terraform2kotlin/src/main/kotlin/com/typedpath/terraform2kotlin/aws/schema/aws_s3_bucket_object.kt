package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_s3_bucket_object(val bucket : String, val key : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var metadata: Map<String, String>? = null
  var content_type: String? = null
  var object_lock_retain_until_date: String? = null
  var content: String? = null
  var server_side_encryption: Server_side_encryption? = null
  var kms_key_id: String? = null
  var tags: Map<String, String>? = null
  var force_destroy: Boolean? = null
  var content_language: String? = null
  var source: String? = null
  var content_base64: String? = null
  var website_redirect: String? = null
  var content_encoding: String? = null
  var cache_control: String? = null
  var content_disposition: String? = null
  var storage_class: Storage_class? = null
  var etag: String? = null
  var object_lock_legal_hold_status: Object_lock_legal_hold_status? = null
  var object_lock_mode: Object_lock_mode? = null
  var acl: Acl? = null
 

enum class Storage_class(val theValue: String ) {
	 STANDARD ("STANDARD"), REDUCED_REDUNDANCY ("REDUCED_REDUNDANCY"), GLACIER ("GLACIER"), STANDARD_IA ("STANDARD_IA"), ONEZONE_IA ("ONEZONE_IA"), INTELLIGENT_TIERING ("INTELLIGENT_TIERING"), DEEP_ARCHIVE ("DEEP_ARCHIVE") ;
	override fun toString() = theValue
	}
enum class Object_lock_legal_hold_status(val theValue: String ) {
	 ON ("ON"), OFF ("OFF") ;
	override fun toString() = theValue
	}
enum class Object_lock_mode(val theValue: String ) {
	 GOVERNANCE ("GOVERNANCE"), COMPLIANCE ("COMPLIANCE") ;
	override fun toString() = theValue
	}
enum class Acl(val theValue: String ) {
	 _private ("private"), public_read ("public-read"), public_read_write ("public-read-write"), authenticated_read ("authenticated-read"), aws_exec_read ("aws-exec-read"), bucket_owner_read ("bucket-owner-read"), bucket_owner_full_control ("bucket-owner-full-control") ;
	override fun toString() = theValue
	}
enum class Server_side_encryption(val theValue: String ) {
	 AES256 ("AES256"), aws_kms ("aws:kms") ;
	override fun toString() = theValue
	}
fun rangeRef(subPath: String = "") = ref(this, "range", subPath)
fun website_redirect_locationRef(subPath: String = "") = ref(this, "website_redirect_location", subPath)
fun bodyRef(subPath: String = "") = ref(this, "body", subPath)
fun content_encodingRef(subPath: String = "") = ref(this, "content_encoding", subPath)
fun content_lengthRef(subPath: String = "") = ref(this, "content_length", subPath)
fun expiresRef(subPath: String = "") = ref(this, "expires", subPath)
fun keyRef(subPath: String = "") = ref(this, "key", subPath)
fun object_lock_retain_until_dateRef(subPath: String = "") = ref(this, "object_lock_retain_until_date", subPath)
fun version_idRef(subPath: String = "") = ref(this, "version_id", subPath)
fun content_languageRef(subPath: String = "") = ref(this, "content_language", subPath)
fun etagRef(subPath: String = "") = ref(this, "etag", subPath)
fun expirationRef(subPath: String = "") = ref(this, "expiration", subPath)
fun last_modifiedRef(subPath: String = "") = ref(this, "last_modified", subPath)
fun metadataRef(subPath: String = "") = ref(this, "metadata", subPath)
fun object_lock_modeRef(subPath: String = "") = ref(this, "object_lock_mode", subPath)
fun content_typeRef(subPath: String = "") = ref(this, "content_type", subPath)
fun object_lock_legal_hold_statusRef(subPath: String = "") = ref(this, "object_lock_legal_hold_status", subPath)
fun server_side_encryptionRef(subPath: String = "") = ref(this, "server_side_encryption", subPath)
fun bucketRef(subPath: String = "") = ref(this, "bucket", subPath)
fun cache_controlRef(subPath: String = "") = ref(this, "cache_control", subPath)
fun content_dispositionRef(subPath: String = "") = ref(this, "content_disposition", subPath)
fun sse_kms_key_idRef(subPath: String = "") = ref(this, "sse_kms_key_id", subPath)
fun storage_classRef(subPath: String = "") = ref(this, "storage_class", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
}
