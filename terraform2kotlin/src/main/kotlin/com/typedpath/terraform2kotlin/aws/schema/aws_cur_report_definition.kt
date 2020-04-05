package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cur_report_definition(val report_name : String, val format : Format, val additional_schema_elements : List<Additional_schema_elements>, val s3_region : String, val time_unit : Time_unit, val compression : Compression, val s3_bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var additional_artifacts: List<Additional_artifacts>? = null
  var s3_prefix: String? = null
 

enum class Time_unit(val theValue: String ) {
	 DAILY ("DAILY"), HOURLY ("HOURLY") ;
	override fun toString() = theValue
	}
enum class Compression(val theValue: String ) {
	 GZIP ("GZIP"), ZIP ("ZIP") ;
	override fun toString() = theValue
	}
enum class Format(val theValue: String ) {
	 textORcsv ("textORcsv") ;
	override fun toString() = theValue
	}
enum class Additional_schema_elements(val theValue: String ) {
	 RESOURCES ("RESOURCES") ;
	override fun toString() = theValue
	}
enum class Additional_artifacts(val theValue: String ) {
	 QUICKSIGHT ("QUICKSIGHT"), REDSHIFT ("REDSHIFT") ;
	override fun toString() = theValue
	}
fun additional_artifactsRef(subPath: String = "") = ref(this, "additional_artifacts", subPath)
fun report_nameRef(subPath: String = "") = ref(this, "report_name", subPath)
fun additional_schema_elementsRef(subPath: String = "") = ref(this, "additional_schema_elements", subPath)
fun s3_prefixRef(subPath: String = "") = ref(this, "s3_prefix", subPath)
fun s3_bucketRef(subPath: String = "") = ref(this, "s3_bucket", subPath)
fun s3_regionRef(subPath: String = "") = ref(this, "s3_region", subPath)
fun time_unitRef(subPath: String = "") = ref(this, "time_unit", subPath)
fun formatRef(subPath: String = "") = ref(this, "format", subPath)
fun compressionRef(subPath: String = "") = ref(this, "compression", subPath)
}
