package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_storagegateway_gateway(val gateway_timezone : String, val gateway_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var medium_changer_type: Medium_changer_type? = null
  var tape_drive_type: Tape_drive_type? = null
  var tags: Map<String, String>? = null
  var activation_key: String? = null
  var gateway_ip_address: String? = null
  var cloudwatch_log_group_arn: String? = null
  var gateway_type: Gateway_type? = null
  var smb_active_directory_settings: List<Smb_active_directory_settings>? = null
  var smb_guest_password: String? = null
 

enum class Tape_drive_type(val theValue: String ) {
	 IBM_ULT3580_TD5 ("IBM-ULT3580-TD5") ;
	override fun toString() = theValue
	}
enum class Gateway_type(val theValue: String ) {
	 CACHED ("CACHED"), FILE_S3 ("FILE_S3"), STORED ("STORED"), VTL ("VTL") ;
	override fun toString() = theValue
	}
enum class Medium_changer_type(val theValue: String ) {
	 AWS_Gateway_VTL ("AWS-Gateway-VTL"), STK_L700 ("STK-L700") ;
	override fun toString() = theValue
	}

class Smb_active_directory_settings(val domain_name : String, val password : String, val username : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
