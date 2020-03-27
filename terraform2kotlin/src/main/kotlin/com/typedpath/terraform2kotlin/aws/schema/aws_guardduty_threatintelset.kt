package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_guardduty_threatintelset(val detector_id : String, val name : String, val format : Format, val location : String, val activate : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

enum class Format(val theValue: String ) {
	 TXT ("TXT"), STIX ("STIX"), OTX_CSV ("OTX_CSV"), ALIEN_VAULT ("ALIEN_VAULT"), PROOF_POINT ("PROOF_POINT"), FIRE_EYE ("FIRE_EYE") ;
	override fun toString() = theValue
	}
}
