package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ssm_association(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var automation_target_parameter_name: String? = null
  var association_name: String? = null
  var max_concurrency: String? = null
  var parameters: Map<String, String>? = null
  var schedule_expression: String? = null
  var targets: List<Targets>? = null
  var compliance_severity: Compliance_severity? = null
  var instance_id: String? = null
  var document_version: String? = null
  var max_errors: String? = null
  var output_location: List<Output_location>? = null
 

enum class Compliance_severity(val theValue: String ) {
	 UNSPECIFIED ("UNSPECIFIED"), LOW ("LOW"), MEDIUM ("MEDIUM"), HIGH ("HIGH"), CRITICAL ("CRITICAL") ;
	override fun toString() = theValue
	}

class Targets(val key : String, val values : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Output_location(val s3_bucket_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var s3_key_prefix: String? = null
 

}
}
