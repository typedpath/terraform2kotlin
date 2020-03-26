package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_config_delivery_channel(val s3_bucket_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var s3_key_prefix: String? = null
  var sns_topic_arn: String? = null
  var snapshot_delivery_properties: List<Snapshot_delivery_properties>? = null
 


class Snapshot_delivery_properties() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var delivery_frequency: Delivery_frequency? = null
 

enum class Delivery_frequency(val theValue: String ) {
	 One_Hour ("One_Hour"), Three_Hours ("Three_Hours"), Six_Hours ("Six_Hours"), Twelve_Hours ("Twelve_Hours"), TwentyFour_Hours ("TwentyFour_Hours") ;
	override fun toString() = theValue
	}
}
}
