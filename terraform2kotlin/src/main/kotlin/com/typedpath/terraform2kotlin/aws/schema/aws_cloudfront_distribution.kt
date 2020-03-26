package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudfront_distribution(val default_cache_behavior : List<Default_cache_behavior>, val restrictions : List<Restrictions>, val origin : List<Origin>, val viewer_certificate : List<Viewer_certificate>, val enabled : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var default_root_object: String? = null
  var tags: Map<String, String>? = null
  var wait_for_deployment: Boolean? = null
  var retain_on_delete: Boolean? = null
  var ordered_cache_behavior: List<Ordered_cache_behavior>? = null
  var custom_error_response: List<Custom_error_response>? = null
  var is_ipv6_enabled: Boolean? = null
  var http_version: Http_version? = null
  var cache_behavior: List<Cache_behavior>? = null
  var logging_config: List<Logging_config>? = null
  var origin_group: List<Origin_group>? = null
  var price_class: String? = null
  var aliases: List<String>? = null
  var comment: String? = null
  var web_acl_id: String? = null
 

enum class Http_version(val theValue: String ) {
	 http1_1 ("http1.1"), http2 ("http2") ;
	override fun toString() = theValue
	}

class Default_cache_behavior(val forwarded_values : List<Forwarded_values>, val target_origin_id : String, val allowed_methods : List<String>, val viewer_protocol_policy : String, val cached_methods : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var trusted_signers: List<String>? = null
  var compress: Boolean? = null
  var default_ttl: Int? = null
  var lambda_function_association: List<Lambda_function_association>? = null
  var min_ttl: Int? = null
  var field_level_encryption_id: String? = null
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

class Lambda_function_association(val event_type : String, val lambda_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var include_body: Boolean? = null
 

}
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

class Origin(val domain_name : String, val origin_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var custom_header: List<Custom_header>? = null
  var origin_path: String? = null
  var s3_origin_config: List<S3_origin_config>? = null
  var custom_origin_config: List<Custom_origin_config>? = null
 


class Custom_header(val name : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class S3_origin_config(val origin_access_identity : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Custom_origin_config(val http_port : Int, val https_port : Int, val origin_protocol_policy : String, val origin_ssl_protocols : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var origin_read_timeout: Int? = null
  var origin_keepalive_timeout: Int? = null
 

}
}

class Viewer_certificate() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var acm_certificate_arn: String? = null
  var cloudfront_default_certificate: Boolean? = null
  var iam_certificate_id: String? = null
  var minimum_protocol_version: String? = null
  var ssl_support_method: String? = null
 

}

class Ordered_cache_behavior(val cached_methods : List<String>, val path_pattern : String, val target_origin_id : String, val allowed_methods : List<String>, val forwarded_values : List<Forwarded_values>, val viewer_protocol_policy : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var lambda_function_association: List<Lambda_function_association>? = null
  var default_ttl: Int? = null
  var compress: Boolean? = null
  var field_level_encryption_id: String? = null
  var smooth_streaming: Boolean? = null
  var max_ttl: Int? = null
  var min_ttl: Int? = null
  var trusted_signers: List<String>? = null
 


class Forwarded_values(val query_string : Boolean, val cookies : List<Cookies>) :  com.typedpath.terraform2kotlin.Resource() {
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

class Custom_error_response(val error_code : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var response_code: Int? = null
  var response_page_path: String? = null
  var error_caching_min_ttl: Int? = null
 

}

class Cache_behavior(val path_pattern : String, val viewer_protocol_policy : String, val forwarded_values : List<Forwarded_values>, val allowed_methods : List<String>, val cached_methods : List<String>, val target_origin_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var lambda_function_association: List<Lambda_function_association>? = null
  var min_ttl: Int? = null
  var compress: Boolean? = null
  var default_ttl: Int? = null
  var field_level_encryption_id: String? = null
  var max_ttl: Int? = null
  var smooth_streaming: Boolean? = null
  var trusted_signers: List<String>? = null
 


class Forwarded_values(val query_string : Boolean, val cookies : List<Cookies>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var headers: List<String>? = null
  var query_string_cache_keys: List<String>? = null
 


class Cookies(val forward : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var whitelisted_names: List<String>? = null
 

}
}

class Lambda_function_association(val event_type : String, val lambda_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var include_body: Boolean? = null
 

}
}

class Logging_config(val bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var include_cookies: Boolean? = null
  var prefix: String? = null
 

}

class Origin_group(val failover_criteria : List<Failover_criteria>, val member : List<Member>, val origin_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Failover_criteria(val status_codes : List<Int>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Member(val origin_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
