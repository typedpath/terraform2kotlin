package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_kms_ciphertext(val plaintext : String, val key_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var context: Map<String, String>? = null
 

fun plaintextRef(subPath: String = "") = ref(this, "plaintext", subPath)
fun key_idRef(subPath: String = "") = ref(this, "key_id", subPath)
fun contextRef(subPath: String = "") = ref(this, "context", subPath)
fun ciphertext_blobRef(subPath: String = "") = ref(this, "ciphertext_blob", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
