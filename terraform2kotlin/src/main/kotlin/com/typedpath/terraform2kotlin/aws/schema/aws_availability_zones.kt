package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_availability_zones() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="data"
	  var blacklisted_zone_ids: List<String>? = null
  var state: State? = null
  var blacklisted_names: List<String>? = null
 

enum class State(val theValue: String ) {
	 available ("available"), information ("information"), impaired ("impaired"), unavailable ("unavailable") ;
	override fun toString() = theValue
	}
fun blacklisted_namesRef(subPath: String = "") = ref(this, "blacklisted_names", subPath)
fun blacklisted_zone_idsRef(subPath: String = "") = ref(this, "blacklisted_zone_ids", subPath)
fun namesRef(subPath: String = "") = ref(this, "names", subPath)
fun stateRef(subPath: String = "") = ref(this, "state", subPath)
fun zone_idsRef(subPath: String = "") = ref(this, "zone_ids", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
