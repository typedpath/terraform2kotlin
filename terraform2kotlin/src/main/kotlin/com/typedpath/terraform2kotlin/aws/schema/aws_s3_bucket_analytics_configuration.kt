package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_s3_bucket_analytics_configuration(val name : String, val bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var filter: List<Filter>? = null
  var storage_class_analysis: List<Storage_class_analysis>? = null
 


class Filter() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var prefix: String? = null
  var tags: Map<String, String>? = null
 

}

class Storage_class_analysis(val data_export : List<Data_export>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Data_export(val destination : List<Destination>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var output_schema_version: Output_schema_version? = null
 

enum class Output_schema_version(val theValue: String ) {
	 V_1 ("V_1") ;
	override fun toString() = theValue
	}

class Destination(val s3_bucket_destination : List<S3_bucket_destination>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class S3_bucket_destination(val bucket_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var bucket_account_id: String? = null
  var format: Format? = null
  var prefix: String? = null
 

enum class Format(val theValue: String ) {
	 CSV ("CSV") ;
	override fun toString() = theValue
	}
}
}
}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
