package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_directory_service_directory(val name : String, val password : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var connect_settings: List<Connect_settings>? = null
  var type: Type? = null
  var edition: Edition? = null
  var alias: String? = null
  var tags: Map<String, String>? = null
  var enable_sso: Boolean? = null
  var size: Size? = null
  var description: String? = null
  var short_name: String? = null
  var vpc_settings: List<Vpc_settings>? = null
 

enum class Type(val theValue: String ) {
	 ADConnector ("ADConnector"), MicrosoftAD ("MicrosoftAD"), SimpleAD ("SimpleAD") ;
	override fun toString() = theValue
	}
enum class Edition(val theValue: String ) {
	 Enterprise ("Enterprise"), Standard ("Standard") ;
	override fun toString() = theValue
	}
enum class Size(val theValue: String ) {
	 Large ("Large"), Small ("Small") ;
	override fun toString() = theValue
	}

class Vpc_settings(val subnet_ids : List<String>, val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Connect_settings(val customer_dns_ips : List<String>, val subnet_ids : List<String>, val vpc_id : String, val customer_username : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun short_nameRef(subPath: String = "") = ref(this, "short_name", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun vpc_settingsRef(subPath: String = "") = ref(this, "vpc_settings", subPath)
fun enable_ssoRef(subPath: String = "") = ref(this, "enable_sso", subPath)
fun security_group_idRef(subPath: String = "") = ref(this, "security_group_id", subPath)
fun sizeRef(subPath: String = "") = ref(this, "size", subPath)
fun aliasRef(subPath: String = "") = ref(this, "alias", subPath)
fun access_urlRef(subPath: String = "") = ref(this, "access_url", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun connect_settingsRef(subPath: String = "") = ref(this, "connect_settings", subPath)
fun typeRef(subPath: String = "") = ref(this, "type", subPath)
fun directory_idRef(subPath: String = "") = ref(this, "directory_id", subPath)
fun dns_ip_addressesRef(subPath: String = "") = ref(this, "dns_ip_addresses", subPath)
fun editionRef(subPath: String = "") = ref(this, "edition", subPath)
}
