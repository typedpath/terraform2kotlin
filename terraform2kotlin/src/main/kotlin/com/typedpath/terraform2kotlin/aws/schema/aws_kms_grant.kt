package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_kms_grant(val grantee_principal : String, val key_id : String, val operations : List<Operations>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var retiring_principal: String? = null
  var name: String? = null
  var constraints: List<Constraints>? = null
  var grant_creation_tokens: List<String>? = null
  var retire_on_delete: Boolean? = null
 

enum class Operations(val theValue: String ) {
	 CreateGrant ("CreateGrant"), Decrypt ("Decrypt"), DescribeKey ("DescribeKey"), Encrypt ("Encrypt"), GenerateDataKey ("GenerateDataKey"), GenerateDataKeyWithoutPlaintext ("GenerateDataKeyWithoutPlaintext"), ReEncryptFrom ("ReEncryptFrom"), ReEncryptTo ("ReEncryptTo"), RetireGrant ("RetireGrant") ;
	override fun toString() = theValue
	}

class Constraints() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var encryption_context_equals: Map<String, String>? = null
  var encryption_context_subset: Map<String, String>? = null
 

}
}
