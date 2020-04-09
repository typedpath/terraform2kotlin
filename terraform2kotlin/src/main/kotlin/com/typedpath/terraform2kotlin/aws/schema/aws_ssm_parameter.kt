package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ssm_parameter(val name : String, val type : Type, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var tier: Tier? = null
  var allowed_pattern: String? = null
  var tags: Map<String, String>? = null
  var arn: String? = null
  var key_id: String? = null
  var overwrite: Boolean? = null
 

enum class Type(val theValue: String ) {
	 _String ("String"), StringList ("StringList"), SecureString ("SecureString") ;
	override fun toString() = theValue
	}
enum class Tier(val theValue: String ) {
	 Standard ("Standard"), Advanced ("Advanced") ;
	override fun toString() = theValue
	}
fun versionRef(subPath: String = "") = ref(this, "version", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun typeRef(subPath: String = "") = ref(this, "type", subPath)
fun valueRef(subPath: String = "") = ref(this, "value", subPath)
fun with_decryptionRef(subPath: String = "") = ref(this, "with_decryption", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
