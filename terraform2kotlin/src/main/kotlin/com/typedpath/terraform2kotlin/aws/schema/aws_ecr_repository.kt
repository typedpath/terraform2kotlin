package com.typedpath.terraform2kotlin.aws.schema

class aws_ecr_repository(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var image_scanning_configuration: List<Image_scanning_configuration>? = null
  var tags: Map<String, String>? = null
  var image_tag_mutability: Image_tag_mutability? = null
 

enum class Image_tag_mutability(val theValue: String ) {
	 MUTABLE ("MUTABLE"), IMMUTABLE ("IMMUTABLE") ;
	override fun toString() = theValue
	}

class Image_scanning_configuration(val scan_on_push : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
