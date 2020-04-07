package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_storagegateway_smb_file_share(val gateway_arn : String, val role_arn : String, val location_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var invalid_user_list: List<String>? = null
  var read_only: Boolean? = null
  var kms_encrypted: Boolean? = null
  var kms_key_arn: String? = null
  var authentication: Authentication? = null
  var guess_mime_type_enabled: Boolean? = null
  var requester_pays: Boolean? = null
  var valid_user_list: List<String>? = null
  var tags: Map<String, String>? = null
  var default_storage_class: Default_storage_class? = null
  var object_acl: Object_acl? = null
 

enum class Default_storage_class(val theValue: String ) {
	 S3_ONEZONE_IA ("S3_ONEZONE_IA"), S3_STANDARD_IA ("S3_STANDARD_IA"), S3_STANDARD ("S3_STANDARD") ;
	override fun toString() = theValue
	}
enum class Object_acl(val theValue: String ) {
	 authenticated_read ("authenticated-read"), aws_exec_read ("aws-exec-read"), bucket_owner_full_control ("bucket-owner-full-control"), bucket_owner_read ("bucket-owner-read"), _private ("private"), public_read ("public-read"), public_read_write ("public-read-write") ;
	override fun toString() = theValue
	}
enum class Authentication(val theValue: String ) {
	 ActiveDirectory ("ActiveDirectory"), GuestAccess ("GuestAccess") ;
	override fun toString() = theValue
	}
}
