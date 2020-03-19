package com.typedpath.terraform2kotlin.aws.schema

class aws_organizations_organization() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var feature_set: Feature_set? = null
  var aws_service_access_principals: List<String>? = null
  var enabled_policy_types: List<Enabled_policy_types>? = null
 

enum class Feature_set(val theValue: String ) {
	 ALL ("ALL"), CONSOLIDATED_BILLING ("CONSOLIDATED_BILLING") ;
	override fun toString() = theValue
	}
enum class Enabled_policy_types(val theValue: String ) {
	 SERVICE_CONTROL_POLICY ("SERVICE_CONTROL_POLICY"), TAG_POLICY ("TAG_POLICY") ;
	override fun toString() = theValue
	}
}
