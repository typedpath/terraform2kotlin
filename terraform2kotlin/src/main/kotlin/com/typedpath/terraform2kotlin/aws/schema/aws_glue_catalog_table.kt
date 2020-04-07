package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_glue_catalog_table(val name : String, val database_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var catalog_id: String? = null
  var description: String? = null
  var owner: String? = null
  var partition_keys: List<Partition_keys>? = null
  var view_original_text: String? = null
  var view_expanded_text: String? = null
  var parameters: Map<String, String>? = null
  var retention: Int? = null
  var storage_descriptor: List<Storage_descriptor>? = null
  var table_type: String? = null
 


class Partition_keys(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var type: String? = null
  var comment: String? = null
 

}

class Storage_descriptor() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var columns: List<Columns>? = null
  var compressed: Boolean? = null
  var input_format: String? = null
  var location: String? = null
  var output_format: String? = null
  var ser_de_info: List<Ser_de_info>? = null
  var skewed_info: List<Skewed_info>? = null
  var bucket_columns: List<String>? = null
  var number_of_buckets: Int? = null
  var parameters: Map<String, String>? = null
  var sort_columns: List<Sort_columns>? = null
  var stored_as_sub_directories: Boolean? = null
 


class Ser_de_info() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var name: String? = null
  var parameters: Map<String, String>? = null
  var serialization_library: String? = null
 

}

class Skewed_info() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var skewed_column_names: List<String>? = null
  var skewed_column_values: List<String>? = null
  var skewed_column_value_location_maps: Map<String, String>? = null
 

}

class Sort_columns(val column : String, val sort_order : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Columns(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var comment: String? = null
  var type: String? = null
 

}
}
}
