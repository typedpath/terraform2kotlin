package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_wafregional_regex_pattern_set(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var regex_pattern_strings: List<String>? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
