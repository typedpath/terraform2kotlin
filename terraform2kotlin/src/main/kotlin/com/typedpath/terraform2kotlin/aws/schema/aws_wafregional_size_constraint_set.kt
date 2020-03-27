package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_wafregional_size_constraint_set(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var size_constraints: List<Size_constraints>? = null
 


class Size_constraints(val comparison_operator : String, val size : Int, val text_transformation : String, val field_to_match : List<Field_to_match>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Field_to_match(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var data: String? = null
 

}
}
}
