package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_placement_group(val name : String, val strategy : Strategy) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 

enum class Strategy(val theValue: String ) {
	 cluster ("cluster"), partition ("partition"), spread ("spread") ;
	override fun toString() = theValue
	}
}
