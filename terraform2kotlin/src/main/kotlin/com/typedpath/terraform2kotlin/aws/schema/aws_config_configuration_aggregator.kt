package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_config_configuration_aggregator(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var organization_aggregation_source: List<Organization_aggregation_source>? = null
  var tags: Map<String, String>? = null
  var account_aggregation_source: List<Account_aggregation_source>? = null
 


class Organization_aggregation_source(val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var all_regions: Boolean? = null
  var regions: List<String>? = null
 

}

class Account_aggregation_source(val account_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var all_regions: Boolean? = null
  var regions: List<String>? = null
 

}
}
