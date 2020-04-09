package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_appmesh_route(val virtual_router_name : String, val spec : List<Spec>, val name : String, val mesh_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 


class Spec() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var tcp_route: List<Tcp_route>? = null
  var http_route: List<Http_route>? = null
  var priority: Int? = null
 


class Tcp_route(val action : List<Action>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Action(val weighted_target : List<Weighted_target>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Weighted_target(val virtual_node : String, val weight : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}

class Http_route(val action : List<Action>, val match : List<Match>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Action(val weighted_target : List<Weighted_target>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Weighted_target(val virtual_node : String, val weight : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}

class Match(val prefix : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var scheme: Scheme? = null
  var header: List<Header>? = null
  var method: Method? = null
 

enum class Method(val theValue: String ) {
	 CONNECT ("CONNECT"), DELETE ("DELETE"), GET ("GET"), HEAD ("HEAD"), OPTIONS ("OPTIONS"), PATCH ("PATCH"), POST ("POST"), PUT ("PUT"), TRACE ("TRACE") ;
	override fun toString() = theValue
	}
enum class Scheme(val theValue: String ) {
	 http ("http"), https ("https") ;
	override fun toString() = theValue
	}

class Header(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var invert: Boolean? = null
  var match: List<Match>? = null
 


class Match() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var exact: String? = null
  var prefix: String? = null
  var range: List<Range>? = null
  var regex: String? = null
  var suffix: String? = null
 


class Range(val start : Int, val end : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
}
}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
