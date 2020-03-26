package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_account_password_policy() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var minimum_password_length: Int? = null
  var require_uppercase_characters: Boolean? = null
  var hard_expiry: Boolean? = null
  var max_password_age: Int? = null
  var require_numbers: Boolean? = null
  var require_symbols: Boolean? = null
  var allow_users_to_change_password: Boolean? = null
  var password_reuse_prevention: Int? = null
  var require_lowercase_characters: Boolean? = null
 

}
