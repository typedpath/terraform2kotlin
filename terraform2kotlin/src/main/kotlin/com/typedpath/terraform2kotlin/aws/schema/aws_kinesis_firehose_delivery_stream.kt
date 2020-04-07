package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_kinesis_firehose_delivery_stream(val name : String, val destination : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var kinesis_source_configuration: List<Kinesis_source_configuration>? = null
  var s3_configuration: List<S3_configuration>? = null
  var splunk_configuration: List<Splunk_configuration>? = null
  var version_id: String? = null
  var tags: Map<String, String>? = null
  var extended_s3_configuration: List<Extended_s3_configuration>? = null
  var redshift_configuration: List<Redshift_configuration>? = null
  var elasticsearch_configuration: List<Elasticsearch_configuration>? = null
  var arn: String? = null
  var destination_id: String? = null
  var server_side_encryption: List<Server_side_encryption>? = null
 


class Server_side_encryption() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
 

}

class Kinesis_source_configuration(val kinesis_stream_arn : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class S3_configuration(val bucket_arn : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cloudwatch_logging_options: List<Cloudwatch_logging_options>? = null
  var buffer_size: Int? = null
  var buffer_interval: Int? = null
  var compression_format: String? = null
  var kms_key_arn: String? = null
  var prefix: String? = null
 


class Cloudwatch_logging_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var log_group_name: String? = null
  var log_stream_name: String? = null
 

}
}

class Splunk_configuration(val hec_endpoint : String, val hec_token : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var s3_backup_mode: String? = null
  var retry_duration: Int? = null
  var cloudwatch_logging_options: List<Cloudwatch_logging_options>? = null
  var processing_configuration: List<Processing_configuration>? = null
  var hec_acknowledgment_timeout: Int? = null
  var hec_endpoint_type: String? = null
 


class Cloudwatch_logging_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var log_group_name: String? = null
  var log_stream_name: String? = null
 

}

class Processing_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var processors: List<Processors>? = null
 


class Processors(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var parameters: List<Parameters>? = null
 


class Parameters(val parameter_name : String, val parameter_value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
}

class Extended_s3_configuration(val bucket_arn : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var data_format_conversion_configuration: List<Data_format_conversion_configuration>? = null
  var kms_key_arn: String? = null
  var cloudwatch_logging_options: List<Cloudwatch_logging_options>? = null
  var buffer_size: Int? = null
  var buffer_interval: Int? = null
  var s3_backup_mode: String? = null
  var s3_backup_configuration: List<S3_backup_configuration>? = null
  var processing_configuration: List<Processing_configuration>? = null
  var compression_format: String? = null
  var error_output_prefix: String? = null
  var prefix: String? = null
 


class Data_format_conversion_configuration(val output_format_configuration : List<Output_format_configuration>, val schema_configuration : List<Schema_configuration>, val input_format_configuration : List<Input_format_configuration>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
 


class Output_format_configuration(val serializer : List<Serializer>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Serializer() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var parquet_ser_de: List<Parquet_ser_de>? = null
  var orc_ser_de: List<Orc_ser_de>? = null
 


class Orc_ser_de() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var bloom_filter_columns: List<String>? = null
  var dictionary_key_threshold: Float? = null
  var format_version: Format_version? = null
  var padding_tolerance: Float? = null
  var row_index_stride: Int? = null
  var stripe_size_bytes: Int? = null
  var block_size_bytes: Int? = null
  var compression: Compression? = null
  var enable_padding: Boolean? = null
  var bloom_filter_false_positive_probability: Float? = null
 

enum class Compression(val theValue: String ) {
	 NONE ("NONE"), SNAPPY ("SNAPPY"), ZLIB ("ZLIB") ;
	override fun toString() = theValue
	}
enum class Format_version(val theValue: String ) {
	 V0_11 ("V0_11"), V0_12 ("V0_12") ;
	override fun toString() = theValue
	}
}

class Parquet_ser_de() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var max_padding_bytes: Int? = null
  var page_size_bytes: Int? = null
  var writer_version: Writer_version? = null
  var block_size_bytes: Int? = null
  var compression: Compression? = null
  var enable_dictionary_compression: Boolean? = null
 

enum class Writer_version(val theValue: String ) {
	 V1 ("V1"), V2 ("V2") ;
	override fun toString() = theValue
	}
enum class Compression(val theValue: String ) {
	 GZIP ("GZIP"), SNAPPY ("SNAPPY"), UNCOMPRESSED ("UNCOMPRESSED") ;
	override fun toString() = theValue
	}
}
}
}

class Schema_configuration(val database_name : String, val role_arn : String, val table_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var region: String? = null
  var version_id: String? = null
  var catalog_id: String? = null
 

}

class Input_format_configuration(val deserializer : List<Deserializer>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Deserializer() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var hive_json_ser_de: List<Hive_json_ser_de>? = null
  var open_x_json_ser_de: List<Open_x_json_ser_de>? = null
 


class Hive_json_ser_de() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var timestamp_formats: List<String>? = null
 

}

class Open_x_json_ser_de() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var case_insensitive: Boolean? = null
  var column_to_json_key_mappings: Map<String, String>? = null
  var convert_dots_in_json_keys_to_underscores: Boolean? = null
 

}
}
}
}

class Cloudwatch_logging_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var log_group_name: String? = null
  var log_stream_name: String? = null
 

}

class S3_backup_configuration(val role_arn : String, val bucket_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var compression_format: String? = null
  var kms_key_arn: String? = null
  var prefix: String? = null
  var cloudwatch_logging_options: List<Cloudwatch_logging_options>? = null
  var buffer_size: Int? = null
  var buffer_interval: Int? = null
 


class Cloudwatch_logging_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var log_stream_name: String? = null
  var enabled: Boolean? = null
  var log_group_name: String? = null
 

}
}

class Processing_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var processors: List<Processors>? = null
 


class Processors(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var parameters: List<Parameters>? = null
 


class Parameters(val parameter_name : String, val parameter_value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
}

class Redshift_configuration(val password : String, val data_table_name : String, val username : String, val role_arn : String, val cluster_jdbcurl : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var s3_backup_mode: String? = null
  var s3_backup_configuration: List<S3_backup_configuration>? = null
  var copy_options: String? = null
  var cloudwatch_logging_options: List<Cloudwatch_logging_options>? = null
  var processing_configuration: List<Processing_configuration>? = null
  var retry_duration: Int? = null
  var data_table_columns: String? = null
 


class S3_backup_configuration(val role_arn : String, val bucket_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var prefix: String? = null
  var cloudwatch_logging_options: List<Cloudwatch_logging_options>? = null
  var buffer_size: Int? = null
  var buffer_interval: Int? = null
  var compression_format: String? = null
  var kms_key_arn: String? = null
 


class Cloudwatch_logging_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var log_group_name: String? = null
  var log_stream_name: String? = null
 

}
}

class Cloudwatch_logging_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var log_group_name: String? = null
  var log_stream_name: String? = null
 

}

class Processing_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var processors: List<Processors>? = null
 


class Processors(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var parameters: List<Parameters>? = null
 


class Parameters(val parameter_name : String, val parameter_value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
}

class Elasticsearch_configuration(val domain_arn : String, val index_name : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var s3_backup_mode: String? = null
  var buffering_interval: Int? = null
  var buffering_size: Int? = null
  var index_rotation_period: String? = null
  var retry_duration: Int? = null
  var type_name: String? = null
  var cloudwatch_logging_options: List<Cloudwatch_logging_options>? = null
  var processing_configuration: List<Processing_configuration>? = null
 


class Cloudwatch_logging_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var log_group_name: String? = null
  var log_stream_name: String? = null
 

}

class Processing_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var processors: List<Processors>? = null
 


class Processors(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var parameters: List<Parameters>? = null
 


class Parameters(val parameter_name : String, val parameter_value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
}
}
