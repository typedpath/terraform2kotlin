package com.typedpath.terraform2kotlin.aws.schema

class aws_dms_endpoint(val endpoint_id : String, val endpoint_type : Endpoint_type, val engine_name : Engine_name) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var service_access_role: String? = null
  var server_name: String? = null
  var tags: Map<String, String>? = null
  var port: Int? = null
  var ssl_mode: Ssl_mode? = null
  var database_name: String? = null
  var kms_key_arn: String? = null
  var password: String? = null
  var extra_connection_attributes: String? = null
  var username: String? = null
  var mongodb_settings: List<Mongodb_settings>? = null
  var s3_settings: List<S3_settings>? = null
  var certificate_arn: String? = null
 

enum class Endpoint_type(val theValue: String ) {
	 source ("source"), target ("target") ;
	override fun toString() = theValue
	}
enum class Engine_name(val theValue: String ) {
	 aurora ("aurora"), aurora_postgresql ("aurora-postgresql"), azuredb ("azuredb"), db2 ("db2"), docdb ("docdb"), dynamodb ("dynamodb"), mariadb ("mariadb"), mongodb ("mongodb"), mysql ("mysql"), oracle ("oracle"), postgres ("postgres"), redshift ("redshift"), s3 ("s3"), sqlserver ("sqlserver"), sybase ("sybase") ;
	override fun toString() = theValue
	}
enum class Ssl_mode(val theValue: String ) {
	 none ("none"), require ("require"), verify_ca ("verify-ca"), verify_full ("verify-full") ;
	override fun toString() = theValue
	}

class Mongodb_settings() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var auth_type: String? = null
  var auth_mechanism: String? = null
  var nesting_level: String? = null
  var extract_doc_id: String? = null
  var docs_to_investigate: String? = null
  var auth_source: String? = null
 

}

class S3_settings() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var bucket_folder: String? = null
  var bucket_name: String? = null
  var compression_type: String? = null
  var service_access_role_arn: String? = null
  var external_table_definition: String? = null
  var csv_row_delimiter: String? = null
  var csv_delimiter: String? = null
 

}
}