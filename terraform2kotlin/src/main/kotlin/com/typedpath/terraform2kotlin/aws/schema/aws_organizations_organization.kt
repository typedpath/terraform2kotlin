package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_organizations_organization() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var feature_set: Feature_set? = null
  var enabled_policy_types: List<Enabled_policy_types>? = null
  var aws_service_access_principals: List<String>? = null
 

enum class Feature_set(val theValue: String ) {
	 ALL ("ALL"), CONSOLIDATED_BILLING ("CONSOLIDATED_BILLING") ;
	override fun toString() = theValue
	}
enum class Enabled_policy_types(val theValue: String ) {
	 SERVICE_CONTROL_POLICY ("SERVICE_CONTROL_POLICY"), TAG_POLICY ("TAG_POLICY") ;
	override fun toString() = theValue
	}
fun feature_setRef(subPath: String = "") = ref(this, "feature_set", subPath)
fun master_account_arnRef(subPath: String = "") = ref(this, "master_account_arn", subPath)
fun non_master_accountsRef(subPath: String = "") = ref(this, "non_master_accounts", subPath)
fun accountsRef(subPath: String = "") = ref(this, "accounts", subPath)
fun aws_service_access_principalsRef(subPath: String = "") = ref(this, "aws_service_access_principals", subPath)
fun enabled_policy_typesRef(subPath: String = "") = ref(this, "enabled_policy_types", subPath)
fun master_account_emailRef(subPath: String = "") = ref(this, "master_account_email", subPath)
fun master_account_idRef(subPath: String = "") = ref(this, "master_account_id", subPath)
fun rootsRef(subPath: String = "") = ref(this, "roots", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
}
