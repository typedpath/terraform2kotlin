package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ecr_repository(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var image_tag_mutability: Image_tag_mutability? = null
  var image_scanning_configuration: List<Image_scanning_configuration>? = null
 

enum class Image_tag_mutability(val theValue: String ) {
	 MUTABLE ("MUTABLE"), IMMUTABLE ("IMMUTABLE") ;
	override fun toString() = theValue
	}

class Image_scanning_configuration(val scan_on_push : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun registry_idRef(subPath: String = "") = ref(this, "registry_id", subPath)
fun repository_urlRef(subPath: String = "") = ref(this, "repository_url", subPath)
}
