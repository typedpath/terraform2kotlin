package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_user_login_profile(val user : String, val pgp_key : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var password_length: Int? = null
  var password_reset_required: Boolean? = null
 

}
