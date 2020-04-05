package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_vpc_endpoint_service(val acceptance_required : Boolean, val network_load_balancer_arns : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var allowed_principals: List<String>? = null
 

fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun availability_zonesRef(subPath: String = "") = ref(this, "availability_zones", subPath)
fun manages_vpc_endpointsRef(subPath: String = "") = ref(this, "manages_vpc_endpoints", subPath)
fun private_dns_nameRef(subPath: String = "") = ref(this, "private_dns_name", subPath)
fun serviceRef(subPath: String = "") = ref(this, "service", subPath)
fun service_nameRef(subPath: String = "") = ref(this, "service_name", subPath)
fun vpc_endpoint_policy_supportedRef(subPath: String = "") = ref(this, "vpc_endpoint_policy_supported", subPath)
fun acceptance_requiredRef(subPath: String = "") = ref(this, "acceptance_required", subPath)
fun base_endpoint_dns_namesRef(subPath: String = "") = ref(this, "base_endpoint_dns_names", subPath)
fun ownerRef(subPath: String = "") = ref(this, "owner", subPath)
fun service_idRef(subPath: String = "") = ref(this, "service_id", subPath)
fun service_typeRef(subPath: String = "") = ref(this, "service_type", subPath)
}
