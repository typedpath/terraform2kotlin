package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ec2_transit_gateway() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var auto_accept_shared_attachments: Auto_accept_shared_attachments? = null
  var default_route_table_association: Default_route_table_association? = null
  var description: String? = null
  var vpn_ecmp_support: Vpn_ecmp_support? = null
  var amazon_side_asn: Int? = null
  var default_route_table_propagation: Default_route_table_propagation? = null
  var dns_support: Dns_support? = null
 

enum class Default_route_table_association(val theValue: String ) {
	 disable ("disable"), enable ("enable") ;
	override fun toString() = theValue
	}
enum class Vpn_ecmp_support(val theValue: String ) {
	 disable ("disable"), enable ("enable") ;
	override fun toString() = theValue
	}
enum class Default_route_table_propagation(val theValue: String ) {
	 disable ("disable"), enable ("enable") ;
	override fun toString() = theValue
	}
enum class Dns_support(val theValue: String ) {
	 disable ("disable"), enable ("enable") ;
	override fun toString() = theValue
	}
enum class Auto_accept_shared_attachments(val theValue: String ) {
	 disable ("disable"), enable ("enable") ;
	override fun toString() = theValue
	}
fun amazon_side_asnRef(subPath: String = "") = ref(this, "amazon_side_asn", subPath)
fun dns_supportRef(subPath: String = "") = ref(this, "dns_support", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun propagation_default_route_table_idRef(subPath: String = "") = ref(this, "propagation_default_route_table_id", subPath)
fun association_default_route_table_idRef(subPath: String = "") = ref(this, "association_default_route_table_id", subPath)
fun auto_accept_shared_attachmentsRef(subPath: String = "") = ref(this, "auto_accept_shared_attachments", subPath)
fun default_route_table_propagationRef(subPath: String = "") = ref(this, "default_route_table_propagation", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun owner_idRef(subPath: String = "") = ref(this, "owner_id", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun default_route_table_associationRef(subPath: String = "") = ref(this, "default_route_table_association", subPath)
fun vpn_ecmp_supportRef(subPath: String = "") = ref(this, "vpn_ecmp_support", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
