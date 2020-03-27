package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_s3_bucket() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var bucket_prefix: String? = null
  var cors_rule: List<Cors_rule>? = null
  var versioning: List<Versioning>? = null
  var logging: List<Logging>? = null
  var lifecycle_rule: List<Lifecycle_rule>? = null
  var object_lock_configuration: List<Object_lock_configuration>? = null
  var acl: String? = null
  var website: List<Website>? = null
  var region: String? = null
  var tags: Map<String, String>? = null
  var bucket: String? = null
  var arn: String? = null
  var policy: String? = null
  var website_endpoint: String? = null
  var acceleration_status: Acceleration_status? = null
  var request_payer: Request_payer? = null
  var server_side_encryption_configuration: List<Server_side_encryption_configuration>? = null
  var grant: List<Grant>? = null
  var hosted_zone_id: String? = null
  var website_domain: String? = null
  var force_destroy: Boolean? = null
  var replication_configuration: List<Replication_configuration>? = null
 

enum class Acceleration_status(val theValue: String ) {
	 Enabled ("Enabled"), Suspended ("Suspended") ;
	override fun toString() = theValue
	}
enum class Request_payer(val theValue: String ) {
	 Requester ("Requester"), BucketOwner ("BucketOwner") ;
	override fun toString() = theValue
	}

class Versioning() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var mfa_delete: Boolean? = null
 

}

class Logging(val target_bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var target_prefix: String? = null
 

}

class Lifecycle_rule(val enabled : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var abort_incomplete_multipart_upload_days: Int? = null
  var prefix: String? = null
  var expiration: List<Expiration>? = null
  var noncurrent_version_expiration: List<Noncurrent_version_expiration>? = null
  var transition: List<Transition>? = null
  var noncurrent_version_transition: List<Noncurrent_version_transition>? = null
  var id: String? = null
  var tags: Map<String, String>? = null
 


class Expiration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var date: String? = null
  var days: Int? = null
  var expired_object_delete_marker: Boolean? = null
 

}

class Noncurrent_version_expiration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var days: Int? = null
 

}

class Transition(val storage_class : Storage_class) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var date: String? = null
  var days: Int? = null
 

enum class Storage_class(val theValue: String ) {
	 GLACIER ("GLACIER"), STANDARD_IA ("STANDARD_IA"), ONEZONE_IA ("ONEZONE_IA"), INTELLIGENT_TIERING ("INTELLIGENT_TIERING"), DEEP_ARCHIVE ("DEEP_ARCHIVE") ;
	override fun toString() = theValue
	}
}

class Noncurrent_version_transition(val storage_class : Storage_class) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var days: Int? = null
 

enum class Storage_class(val theValue: String ) {
	 GLACIER ("GLACIER"), STANDARD_IA ("STANDARD_IA"), ONEZONE_IA ("ONEZONE_IA"), INTELLIGENT_TIERING ("INTELLIGENT_TIERING"), DEEP_ARCHIVE ("DEEP_ARCHIVE") ;
	override fun toString() = theValue
	}
}
}

class Object_lock_configuration(val object_lock_enabled : Object_lock_enabled) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var rule: List<Rule>? = null
 

enum class Object_lock_enabled(val theValue: String ) {
	 Enabled ("Enabled") ;
	override fun toString() = theValue
	}

class Rule(val default_retention : List<Default_retention>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Default_retention(val mode : Mode) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var days: Int? = null
  var years: Int? = null
 

enum class Mode(val theValue: String ) {
	 GOVERNANCE ("GOVERNANCE"), COMPLIANCE ("COMPLIANCE") ;
	override fun toString() = theValue
	}
}
}
}

class Website() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var index_document: String? = null
  var error_document: String? = null
  var redirect_all_requests_to: String? = null
  var routing_rules: String? = null
 

}

class Grant(val type : Type, val permissions : List<Permissions>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var id: String? = null
  var uri: String? = null
 

enum class Type(val theValue: String ) {
	 CanonicalUser ("CanonicalUser"), Group ("Group") ;
	override fun toString() = theValue
	}
enum class Permissions(val theValue: String ) {
	 FULL_CONTROL ("FULL_CONTROL"), READ ("READ"), READ_ACP ("READ_ACP"), WRITE ("WRITE"), WRITE_ACP ("WRITE_ACP") ;
	override fun toString() = theValue
	}
}

class Cors_rule(val allowed_methods : List<String>, val allowed_origins : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var expose_headers: List<String>? = null
  var max_age_seconds: Int? = null
  var allowed_headers: List<String>? = null
 

}

class Server_side_encryption_configuration(val rule : List<Rule>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Rule(val apply_server_side_encryption_by_default : List<Apply_server_side_encryption_by_default>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Apply_server_side_encryption_by_default(val sse_algorithm : Sse_algorithm) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var kms_master_key_id: String? = null
 

enum class Sse_algorithm(val theValue: String ) {
	 AES256 ("AES256"), aws_kms ("aws:kms") ;
	override fun toString() = theValue
	}
}
}
}

class Replication_configuration(val role : String, val rules : List<Rules>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Rules(val status : Status, val destination : List<Destination>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var priority: Int? = null
  var filter: List<Filter>? = null
  var id: String? = null
  var source_selection_criteria: List<Source_selection_criteria>? = null
  var prefix: String? = null
 

enum class Status(val theValue: String ) {
	 Enabled ("Enabled"), Disabled ("Disabled") ;
	override fun toString() = theValue
	}

class Destination(val bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var account_id: String? = null
  var storage_class: Storage_class? = null
  var replica_kms_key_id: String? = null
  var access_control_translation: List<Access_control_translation>? = null
 

enum class Storage_class(val theValue: String ) {
	 STANDARD ("STANDARD"), REDUCED_REDUNDANCY ("REDUCED_REDUNDANCY"), STANDARD_IA ("STANDARD_IA"), ONEZONE_IA ("ONEZONE_IA"), INTELLIGENT_TIERING ("INTELLIGENT_TIERING"), GLACIER ("GLACIER"), DEEP_ARCHIVE ("DEEP_ARCHIVE") ;
	override fun toString() = theValue
	}

class Access_control_translation(val owner : Owner) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Owner(val theValue: String ) {
	 Destination ("Destination") ;
	override fun toString() = theValue
	}
}
}

class Source_selection_criteria() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var sse_kms_encrypted_objects: List<Sse_kms_encrypted_objects>? = null
 


class Sse_kms_encrypted_objects(val enabled : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}

class Filter() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var prefix: String? = null
  var tags: Map<String, String>? = null
 

}
}
}
fun website_domainRef(subPath: String = "") = ref(this, "website_domain", subPath)
fun bucketRef(subPath: String = "") = ref(this, "bucket", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun bucket_domain_nameRef(subPath: String = "") = ref(this, "bucket_domain_name", subPath)
fun bucket_regional_domain_nameRef(subPath: String = "") = ref(this, "bucket_regional_domain_name", subPath)
fun hosted_zone_idRef(subPath: String = "") = ref(this, "hosted_zone_id", subPath)
fun regionRef(subPath: String = "") = ref(this, "region", subPath)
fun website_endpointRef(subPath: String = "") = ref(this, "website_endpoint", subPath)
}
