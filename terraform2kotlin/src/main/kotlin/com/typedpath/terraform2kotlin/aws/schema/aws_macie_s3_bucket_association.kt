package com.typedpath.terraform2kotlin.aws.schema

class aws_macie_s3_bucket_association(val bucket_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var prefix: String? = null
  var member_account_id: String? = null
  var classification_type: List<Classification_type>? = null
 


class Classification_type() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var continuous: Continuous? = null
  var one_time: One_time? = null
 

enum class Continuous(val theValue: String ) {
	 FULL ("FULL") ;
	override fun toString() = theValue
	}
enum class One_time(val theValue: String ) {
	 FULL ("FULL"), NONE ("NONE") ;
	override fun toString() = theValue
	}
}
}