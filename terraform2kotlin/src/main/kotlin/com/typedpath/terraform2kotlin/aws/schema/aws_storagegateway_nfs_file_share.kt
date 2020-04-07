package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_storagegateway_nfs_file_share(val client_list : List<String>, val role_arn : String, val location_arn : String, val gateway_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var default_storage_class: Default_storage_class? = null
  var guess_mime_type_enabled: Boolean? = null
  var kms_key_arn: String? = null
  var nfs_file_share_defaults: List<Nfs_file_share_defaults>? = null
  var requester_pays: Boolean? = null
  var object_acl: Object_acl? = null
  var read_only: Boolean? = null
  var squash: Squash? = null
  var tags: Map<String, String>? = null
  var kms_encrypted: Boolean? = null
 

enum class Default_storage_class(val theValue: String ) {
	 S3_ONEZONE_IA ("S3_ONEZONE_IA"), S3_STANDARD_IA ("S3_STANDARD_IA"), S3_STANDARD ("S3_STANDARD") ;
	override fun toString() = theValue
	}
enum class Object_acl(val theValue: String ) {
	 authenticated_read ("authenticated-read"), aws_exec_read ("aws-exec-read"), bucket_owner_full_control ("bucket-owner-full-control"), bucket_owner_read ("bucket-owner-read"), _private ("private"), public_read ("public-read"), public_read_write ("public-read-write") ;
	override fun toString() = theValue
	}
enum class Squash(val theValue: String ) {
	 AllSquash ("AllSquash"), NoSquash ("NoSquash"), RootSquash ("RootSquash") ;
	override fun toString() = theValue
	}

class Nfs_file_share_defaults() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var directory_mode: String? = null
  var file_mode: String? = null
  var group_id: Int? = null
  var owner_id: Int? = null
 

}
}
