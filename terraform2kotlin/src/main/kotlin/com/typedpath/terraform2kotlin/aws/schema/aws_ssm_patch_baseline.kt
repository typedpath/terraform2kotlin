package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ssm_patch_baseline(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var operating_system: Operating_system? = null
  var rejected_patches: List<String>? = null
  var description: String? = null
  var global_filter: List<Global_filter>? = null
  var approval_rule: List<Approval_rule>? = null
  var approved_patches: List<String>? = null
  var approved_patches_compliance_level: Approved_patches_compliance_level? = null
  var tags: Map<String, String>? = null
 

enum class Operating_system(val theValue: String ) {
	 WINDOWS ("WINDOWS"), AMAZON_LINUX ("AMAZON_LINUX"), UBUNTU ("UBUNTU"), REDHAT_ENTERPRISE_LINUX ("REDHAT_ENTERPRISE_LINUX"), CENTOS ("CENTOS"), AMAZON_LINUX_2 ("AMAZON_LINUX_2"), SUSE ("SUSE") ;
	override fun toString() = theValue
	}
enum class Approved_patches_compliance_level(val theValue: String ) {
	 CRITICAL ("CRITICAL"), HIGH ("HIGH"), MEDIUM ("MEDIUM"), LOW ("LOW"), INFORMATIONAL ("INFORMATIONAL"), UNSPECIFIED ("UNSPECIFIED") ;
	override fun toString() = theValue
	}

class Approval_rule(val approve_after_days : Int, val patch_filter : List<Patch_filter>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var compliance_level: Compliance_level? = null
  var enable_non_security: Boolean? = null
 

enum class Compliance_level(val theValue: String ) {
	 CRITICAL ("CRITICAL"), HIGH ("HIGH"), MEDIUM ("MEDIUM"), LOW ("LOW"), INFORMATIONAL ("INFORMATIONAL"), UNSPECIFIED ("UNSPECIFIED") ;
	override fun toString() = theValue
	}

class Patch_filter(val key : String, val values : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}

class Global_filter(val key : String, val values : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
fun ownerRef(subPath: String = "") = ref(this, "owner", subPath)
fun name_prefixRef(subPath: String = "") = ref(this, "name_prefix", subPath)
fun default_baselineRef(subPath: String = "") = ref(this, "default_baseline", subPath)
fun operating_systemRef(subPath: String = "") = ref(this, "operating_system", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
}
