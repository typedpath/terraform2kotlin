package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_appsync_datasource(val name : String, val type : Type, val api_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var lambda_config: List<Lambda_config>? = null
  var dynamodb_config: List<Dynamodb_config>? = null
  var elasticsearch_config: List<Elasticsearch_config>? = null
  var http_config: List<Http_config>? = null
  var description: String? = null
  var service_role_arn: String? = null
 

enum class Type(val theValue: String ) {
	 AWS_LAMBDA ("AWS_LAMBDA"), AMAZON_DYNAMODB ("AMAZON_DYNAMODB"), AMAZON_ELASTICSEARCH ("AMAZON_ELASTICSEARCH"), HTTP ("HTTP"), NONE ("NONE") ;
	override fun toString() = theValue
	}

class Lambda_config(val function_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Dynamodb_config(val table_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var use_caller_credentials: Boolean? = null
  var region: String? = null
 

}

class Elasticsearch_config(val endpoint : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var region: String? = null
 

}

class Http_config(val endpoint : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
