package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_codebuild_project(val artifacts : List<Artifacts>, val name : String, val source : List<Source>, val environment : List<Environment>, val service_role : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var build_timeout: Int? = null
  var queued_timeout: Int? = null
  var badge_enabled: Boolean? = null
  var vpc_config: List<Vpc_config>? = null
  var description: String? = null
  var logs_config: List<Logs_config>? = null
  var secondary_artifacts: List<Secondary_artifacts>? = null
  var source_version: String? = null
  var tags: Map<String, String>? = null
  var encryption_key: String? = null
  var secondary_sources: List<Secondary_sources>? = null
  var cache: List<Cache>? = null
 


class Artifacts(val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var encryption_disabled: Boolean? = null
  var location: String? = null
  var namespace_type: Namespace_type? = null
  var packaging: Packaging? = null
  var path: String? = null
  var artifact_identifier: String? = null
  var override_artifact_name: Boolean? = null
  var name: String? = null
 

enum class Type(val theValue: String ) {
	 CODEPIPELINE ("CODEPIPELINE"), S3 ("S3"), NO_ARTIFACTS ("NO_ARTIFACTS") ;
	override fun toString() = theValue
	}
enum class Namespace_type(val theValue: String ) {
	 NONE ("NONE"), BUILD_ID ("BUILD_ID") ;
	override fun toString() = theValue
	}
enum class Packaging(val theValue: String ) {
	 NONE ("NONE"), ZIP ("ZIP") ;
	override fun toString() = theValue
	}
}

class Source(val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var insecure_ssl: Boolean? = null
  var report_build_status: Boolean? = null
  var auth: List<Auth>? = null
  var buildspec: String? = null
  var location: String? = null
  var git_clone_depth: Int? = null
  var git_submodules_config: List<Git_submodules_config>? = null
 

enum class Type(val theValue: String ) {
	 CODECOMMIT ("CODECOMMIT"), CODEPIPELINE ("CODEPIPELINE"), GITHUB ("GITHUB"), S3 ("S3"), BITBUCKET ("BITBUCKET"), GITHUB_ENTERPRISE ("GITHUB_ENTERPRISE"), NO_SOURCE ("NO_SOURCE") ;
	override fun toString() = theValue
	}

class Auth(val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var resource: String? = null
 

enum class Type(val theValue: String ) {
	 OAUTH ("OAUTH") ;
	override fun toString() = theValue
	}
}

class Git_submodules_config(val fetch_submodules : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}

class Environment(val compute_type : Compute_type, val image : String, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var image_pull_credentials_type: Image_pull_credentials_type? = null
  var privileged_mode: Boolean? = null
  var certificate: String? = null
  var registry_credential: List<Registry_credential>? = null
  var environment_variable: List<Environment_variable>? = null
 

enum class Compute_type(val theValue: String ) {
	 BUILD_GENERAL1_SMALL ("BUILD_GENERAL1_SMALL"), BUILD_GENERAL1_MEDIUM ("BUILD_GENERAL1_MEDIUM"), BUILD_GENERAL1_LARGE ("BUILD_GENERAL1_LARGE"), BUILD_GENERAL1_2XLARGE ("BUILD_GENERAL1_2XLARGE") ;
	override fun toString() = theValue
	}
enum class Type(val theValue: String ) {
	 LINUX_CONTAINER ("LINUX_CONTAINER"), LINUX_GPU_CONTAINER ("LINUX_GPU_CONTAINER"), WINDOWS_CONTAINER ("WINDOWS_CONTAINER"), ARM_CONTAINER ("ARM_CONTAINER") ;
	override fun toString() = theValue
	}
enum class Image_pull_credentials_type(val theValue: String ) {
	 CODEBUILD ("CODEBUILD"), SERVICE_ROLE ("SERVICE_ROLE") ;
	override fun toString() = theValue
	}

class Environment_variable(val name : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var type: Type? = null
 

enum class Type(val theValue: String ) {
	 PLAINTEXT ("PLAINTEXT"), PARAMETER_STORE ("PARAMETER_STORE") ;
	override fun toString() = theValue
	}
}

class Registry_credential(val credential : String, val credential_provider : Credential_provider) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Credential_provider(val theValue: String ) {
	 SECRETS_MANAGER ("SECRETS_MANAGER") ;
	override fun toString() = theValue
	}
}
}

class Secondary_artifacts(val type : Type, val artifact_identifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var name: String? = null
  var override_artifact_name: Boolean? = null
  var packaging: Packaging? = null
  var path: String? = null
  var encryption_disabled: Boolean? = null
  var location: String? = null
  var namespace_type: Namespace_type? = null
 

enum class Type(val theValue: String ) {
	 S3 ("S3") ;
	override fun toString() = theValue
	}
enum class Packaging(val theValue: String ) {
	 NONE ("NONE"), ZIP ("ZIP") ;
	override fun toString() = theValue
	}
enum class Namespace_type(val theValue: String ) {
	 NONE ("NONE"), BUILD_ID ("BUILD_ID") ;
	override fun toString() = theValue
	}
}

class Secondary_sources(val source_identifier : String, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var auth: List<Auth>? = null
  var location: String? = null
  var git_submodules_config: List<Git_submodules_config>? = null
  var insecure_ssl: Boolean? = null
  var report_build_status: Boolean? = null
  var buildspec: String? = null
  var git_clone_depth: Int? = null
 

enum class Type(val theValue: String ) {
	 CODECOMMIT ("CODECOMMIT"), CODEPIPELINE ("CODEPIPELINE"), GITHUB ("GITHUB"), S3 ("S3"), BITBUCKET ("BITBUCKET"), GITHUB_ENTERPRISE ("GITHUB_ENTERPRISE") ;
	override fun toString() = theValue
	}

class Auth(val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var resource: String? = null
 

enum class Type(val theValue: String ) {
	 OAUTH ("OAUTH") ;
	override fun toString() = theValue
	}
}

class Git_submodules_config(val fetch_submodules : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}

class Cache() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var modes: List<String>? = null
  var type: Type? = null
  var location: String? = null
 

enum class Type(val theValue: String ) {
	 NO_CACHE ("NO_CACHE"), S3 ("S3"), LOCAL ("LOCAL") ;
	override fun toString() = theValue
	}
}

class Vpc_config(val vpc_id : String, val subnets : List<String>, val security_group_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Logs_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cloudwatch_logs: List<Cloudwatch_logs>? = null
  var s3_logs: List<S3_logs>? = null
 


class Cloudwatch_logs() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var status: Status? = null
  var group_name: String? = null
  var stream_name: String? = null
 

enum class Status(val theValue: String ) {
	 DISABLED ("DISABLED"), ENABLED ("ENABLED") ;
	override fun toString() = theValue
	}
}

class S3_logs() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var status: Status? = null
  var location: String? = null
  var encryption_disabled: Boolean? = null
 

enum class Status(val theValue: String ) {
	 DISABLED ("DISABLED"), ENABLED ("ENABLED") ;
	override fun toString() = theValue
	}
}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
