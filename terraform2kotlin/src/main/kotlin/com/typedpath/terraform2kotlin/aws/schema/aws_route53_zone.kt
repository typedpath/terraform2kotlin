package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_route53_zone(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var comment: String? = null
  var vpc: List<Vpc>? = null
  var vpc_id: String? = null
  var vpc_region: String? = null
  var delegation_set_id: String? = null
  var force_destroy: Boolean? = null
 


class Vpc(val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var vpc_region: String? = null
 

}
fun private_zoneRef(subPath: String = "") = ref(this, "private_zone", subPath)
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
fun linked_service_principalRef(subPath: String = "") = ref(this, "linked_service_principal", subPath)
fun name_serversRef(subPath: String = "") = ref(this, "name_servers", subPath)
fun linked_service_descriptionRef(subPath: String = "") = ref(this, "linked_service_description", subPath)
fun zone_idRef(subPath: String = "") = ref(this, "zone_id", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun commentRef(subPath: String = "") = ref(this, "comment", subPath)
fun caller_referenceRef(subPath: String = "") = ref(this, "caller_reference", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun resource_record_set_countRef(subPath: String = "") = ref(this, "resource_record_set_count", subPath)
}
