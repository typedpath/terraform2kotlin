package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_datasync_location_smb(val agent_arns : List<String>, val password : String, val subdirectory : String, val user : String, val server_hostname : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var mount_options: List<Mount_options>? = null
  var tags: Map<String, String>? = null
  var domain: String? = null
 


class Mount_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var version: Version? = null
 

enum class Version(val theValue: String ) {
	 AUTOMATIC ("AUTOMATIC"), SMB2 ("SMB2"), SMB3 ("SMB3") ;
	override fun toString() = theValue
	}
}
}
