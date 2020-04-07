package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_kinesis_analytics_application(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var code: String? = null
  var description: String? = null
  var cloudwatch_logging_options: List<Cloudwatch_logging_options>? = null
  var inputs: List<Inputs>? = null
  var outputs: List<Outputs>? = null
  var reference_data_sources: List<Reference_data_sources>? = null
  var tags: Map<String, String>? = null
 


class Cloudwatch_logging_options(val role_arn : String, val log_stream_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Inputs(val name_prefix : String, val schema : List<Schema>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var parallelism: List<Parallelism>? = null
  var kinesis_firehose: List<Kinesis_firehose>? = null
  var kinesis_stream: List<Kinesis_stream>? = null
  var processing_configuration: List<Processing_configuration>? = null
 


class Schema(val record_columns : List<Record_columns>, val record_format : List<Record_format>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var record_encoding: String? = null
 


class Record_columns(val name : String, val sql_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var mapping: String? = null
 

}

class Record_format() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var mapping_parameters: List<Mapping_parameters>? = null
 


class Mapping_parameters() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var csv: List<Csv>? = null
  var json: List<Json>? = null
 


class Json(val record_row_path : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Csv(val record_column_delimiter : String, val record_row_delimiter : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
}

class Parallelism(val count : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Kinesis_firehose(val resource_arn : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Kinesis_stream(val resource_arn : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Processing_configuration(val lambda : List<Lambda>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Lambda(val resource_arn : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}

class Outputs(val name : String, val schema : List<Schema>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var kinesis_firehose: List<Kinesis_firehose>? = null
  var kinesis_stream: List<Kinesis_stream>? = null
  var lambda: List<Lambda>? = null
 


class Schema() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var record_format_type: Record_format_type? = null
 

enum class Record_format_type(val theValue: String ) {
	 CSV ("CSV"), JSON ("JSON") ;
	override fun toString() = theValue
	}
}

class Kinesis_firehose(val resource_arn : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Kinesis_stream(val resource_arn : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Lambda(val resource_arn : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}

class Reference_data_sources(val schema : List<Schema>, val table_name : String, val s3 : List<S3>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class S3(val role_arn : String, val bucket_arn : String, val file_key : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Schema(val record_columns : List<Record_columns>, val record_format : List<Record_format>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var record_encoding: String? = null
 


class Record_columns(val name : String, val sql_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var mapping: String? = null
 

}

class Record_format() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var mapping_parameters: List<Mapping_parameters>? = null
 


class Mapping_parameters() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var csv: List<Csv>? = null
  var json: List<Json>? = null
 


class Json(val record_row_path : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Csv(val record_column_delimiter : String, val record_row_delimiter : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
}
}
}
