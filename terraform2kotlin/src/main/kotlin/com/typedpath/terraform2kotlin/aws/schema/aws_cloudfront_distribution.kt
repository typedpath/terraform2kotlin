package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudfront_distribution(val viewer_certificate : List<Viewer_certificate>, val enabled : Boolean, val restrictions : List<Restrictions>, val origin : List<Origin>, val default_cache_behavior : List<Default_cache_behavior>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var origin_group: List<Origin_group>? = null
  var default_root_object: String? = null
  var logging_config: List<Logging_config>? = null
  var retain_on_delete: Boolean? = null
  var wait_for_deployment: Boolean? = null
  var custom_error_response: List<Custom_error_response>? = null
  var http_version: Http_version? = null
  var price_class: String? = null
  var ordered_cache_behavior: List<Ordered_cache_behavior>? = null
  var web_acl_id: String? = null
  var is_ipv6_enabled: Boolean? = null
  var comment: String? = null
  var aliases: List<String>? = null
  var cache_behavior: List<Cache_behavior>? = null
 

enum class Http_version(val theValue: String ) {
	 http1_1 ("http1.1"), http2 ("http2") ;
	override fun toString() = theValue
	}

class Viewer_certificate() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var acm_certificate_arn: String? = null
  var cloudfront_default_certificate: Boolean? = null
  var iam_certificate_id: String? = null
  var minimum_protocol_version: String? = null
  var ssl_support_method: String? = null
 

}

class Restrictions(val geo_restriction : List<Geo_restriction>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Geo_restriction(val restriction_type : Restriction_type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var locations: List<String>? = null
 

enum class Restriction_type(val theValue: String ) {
	 none ("none"), blacklist ("blacklist"), whitelist ("whitelist") ;
	override fun toString() = theValue
	}
}
}

class Origin(val origin_id : String, val domain_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var custom_header: List<Custom_header>? = null
  var origin_path: String? = null
  var s3_origin_config: List<S3_origin_config>? = null
  var custom_origin_config: List<Custom_origin_config>? = null
 


class S3_origin_config(val origin_access_identity : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Custom_origin_config(val https_port : Int, val origin_protocol_policy : String, val origin_ssl_protocols : List<String>, val http_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var origin_read_timeout: Int? = null
  var origin_keepalive_timeout: Int? = null
 

}

class Custom_header(val name : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}

class Default_cache_behavior(val target_origin_id : String, val cached_methods : List<String>, val forwarded_values : List<Forwarded_values>, val viewer_protocol_policy : String, val allowed_methods : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var default_ttl: Int? = null
  var field_level_encryption_id: String? = null
  var min_ttl: Int? = null
  var compress: Boolean? = null
  var max_ttl: Int? = null
  var smooth_streaming: Boolean? = null
  var trusted_signers: List<String>? = null
  var lambda_function_association: List<Lambda_function_association>? = null
 


class Forwarded_values(val cookies : List<Cookies>, val query_string : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var headers: List<String>? = null
  var query_string_cache_keys: List<String>? = null
 


class Cookies(val forward : Forward) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var whitelisted_names: List<String>? = null
 

enum class Forward(val theValue: String ) {
	 all ("all"), none ("none"), whitelist ("whitelist") ;
	override fun toString() = theValue
	}
}
}

class Lambda_function_association(val lambda_arn : String, val event_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var include_body: Boolean? = null
 

}
}

class Origin_group(val origin_id : String, val failover_criteria : List<Failover_criteria>, val member : List<Member>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Failover_criteria(val status_codes : List<Int>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Member(val origin_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}

class Logging_config(val bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var include_cookies: Boolean? = null
  var prefix: String? = null
 

}

class Custom_error_response(val error_code : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var response_page_path: String? = null
  var error_caching_min_ttl: Int? = null
  var response_code: Int? = null
 

}

class Ordered_cache_behavior(val target_origin_id : String, val allowed_methods : List<String>, val cached_methods : List<String>, val forwarded_values : List<Forwarded_values>, val path_pattern : String, val viewer_protocol_policy : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var field_level_encryption_id: String? = null
  var min_ttl: Int? = null
  var lambda_function_association: List<Lambda_function_association>? = null
  var trusted_signers: List<String>? = null
  var compress: Boolean? = null
  var default_ttl: Int? = null
  var max_ttl: Int? = null
  var smooth_streaming: Boolean? = null
 


class Forwarded_values(val cookies : List<Cookies>, val query_string : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var headers: List<String>? = null
  var query_string_cache_keys: List<String>? = null
 


class Cookies(val forward : Forward) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var whitelisted_names: List<String>? = null
 

enum class Forward(val theValue: String ) {
	 all ("all"), none ("none"), whitelist ("whitelist") ;
	override fun toString() = theValue
	}
}
}

class Lambda_function_association(val lambda_arn : String, val event_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var include_body: Boolean? = null
 

}
}

class Cache_behavior(val viewer_protocol_policy : String, val cached_methods : List<String>, val path_pattern : String, val allowed_methods : List<String>, val forwarded_values : List<Forwarded_values>, val target_origin_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var lambda_function_association: List<Lambda_function_association>? = null
  var max_ttl: Int? = null
  var compress: Boolean? = null
  var default_ttl: Int? = null
  var field_level_encryption_id: String? = null
  var min_ttl: Int? = null
  var smooth_streaming: Boolean? = null
  var trusted_signers: List<String>? = null
 


class Forwarded_values(val cookies : List<Cookies>, val query_string : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var headers: List<String>? = null
  var query_string_cache_keys: List<String>? = null
 


class Cookies(val forward : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var whitelisted_names: List<String>? = null
 

}
}

class Lambda_function_association(val lambda_arn : String, val event_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var include_body: Boolean? = null
 

}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
