package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ssm_document(val name : String, val content : String, val document_type : Document_type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var target_type: String? = null
  var attachments_source: List<Attachments_source>? = null
  var tags: Map<String, String>? = null
  var document_format: Document_format? = null
  var permissions: Map<String, String>? = null
 

enum class Document_type(val theValue: String ) {
	 Command ("Command"), Policy ("Policy"), Automation ("Automation"), Session ("Session"), Package ("Package") ;
	override fun toString() = theValue
	}
enum class Document_format(val theValue: String ) {
	 JSON ("JSON"), YAML ("YAML") ;
	override fun toString() = theValue
	}

class Attachments_source(val key : Key, val values : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var name: String? = null
 

enum class Key(val theValue: String ) {
	 AttachmentReference ("AttachmentReference"), SourceUrl ("SourceUrl"), S3FileUrl ("S3FileUrl") ;
	override fun toString() = theValue
	}
}
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun contentRef(subPath: String = "") = ref(this, "content", subPath)
fun document_formatRef(subPath: String = "") = ref(this, "document_format", subPath)
fun document_typeRef(subPath: String = "") = ref(this, "document_type", subPath)
fun document_versionRef(subPath: String = "") = ref(this, "document_version", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
}
