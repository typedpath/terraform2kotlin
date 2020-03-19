package com.typedpath.terraform2kotlin.aws.schema

class aws_cur_report_definition(val s3_region : String, val report_name : String, val format : Format, val compression : Compression, val time_unit : Time_unit, val additional_schema_elements : List<Additional_schema_elements>, val s3_bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var s3_prefix: String? = null
  var additional_artifacts: List<Additional_artifacts>? = null
 

enum class Compression(val theValue: String ) {
	 GZIP ("GZIP"), ZIP ("ZIP") ;
	override fun toString() = theValue
	}
enum class Time_unit(val theValue: String ) {
	 DAILY ("DAILY"), HOURLY ("HOURLY") ;
	override fun toString() = theValue
	}
enum class Additional_schema_elements(val theValue: String ) {
	 RESOURCES ("RESOURCES") ;
	override fun toString() = theValue
	}
enum class Format(val theValue: String ) {
	 textORcsv ("textORcsv") ;
	override fun toString() = theValue
	}
enum class Additional_artifacts(val theValue: String ) {
	 QUICKSIGHT ("QUICKSIGHT"), REDSHIFT ("REDSHIFT") ;
	override fun toString() = theValue
	}
}
