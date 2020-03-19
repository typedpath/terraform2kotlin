package com.typedpath.terraform2kotlin.aws.schema

class aws_s3_bucket_object(val bucket : String, val key : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var metadata: Map<String, String>? = null
  var source: String? = null
  var server_side_encryption: Server_side_encryption? = null
  var etag: String? = null
  var object_lock_retain_until_date: String? = null
  var cache_control: String? = null
  var content_disposition: String? = null
  var content: String? = null
  var kms_key_id: String? = null
  var website_redirect: String? = null
  var tags: Map<String, String>? = null
  var content_encoding: String? = null
  var content_language: String? = null
  var storage_class: Storage_class? = null
  var object_lock_legal_hold_status: Object_lock_legal_hold_status? = null
  var object_lock_mode: Object_lock_mode? = null
  var acl: Acl? = null
  var content_type: String? = null
  var content_base64: String? = null
  var force_destroy: Boolean? = null
 

enum class Server_side_encryption(val theValue: String ) {
	 AES256 ("AES256"), aws_kms ("aws:kms") ;
	override fun toString() = theValue
	}
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
}
