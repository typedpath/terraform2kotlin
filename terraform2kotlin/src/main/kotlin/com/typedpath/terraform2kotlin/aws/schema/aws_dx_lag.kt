package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dx_lag(val location : String, val name : String, val connections_bandwidth : Connections_bandwidth) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var number_of_connections: Int? = null
  var force_destroy: Boolean? = null
  var tags: Map<String, String>? = null
 

enum class Connections_bandwidth(val theValue: String ) {
	 _1Gbps ("1Gbps"), _10Gbps ("10Gbps"), _50Mbps ("50Mbps"), _100Mbps ("100Mbps"), _200Mbps ("200Mbps"), _300Mbps ("300Mbps"), _400Mbps ("400Mbps"), _500Mbps ("500Mbps") ;
	override fun toString() = theValue
	}
}
