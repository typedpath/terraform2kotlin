package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_appmesh_mesh(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var spec: List<Spec>? = null
  var tags: Map<String, String>? = null
 


class Spec() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var egress_filter: List<Egress_filter>? = null
 


class Egress_filter() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var type: Type? = null
 

enum class Type(val theValue: String ) {
	 ALLOW_ALL ("ALLOW_ALL"), DROP_ALL ("DROP_ALL") ;
	override fun toString() = theValue
	}
}
}
}
