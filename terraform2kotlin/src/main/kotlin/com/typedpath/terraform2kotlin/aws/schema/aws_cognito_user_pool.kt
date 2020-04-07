package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cognito_user_pool(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var verification_message_template: List<Verification_message_template>? = null
  var alias_attributes: List<Alias_attributes>? = null
  var sms_authentication_message: String? = null
  var user_pool_add_ons: List<User_pool_add_ons>? = null
  var mfa_configuration: Mfa_configuration? = null
  var email_configuration: List<Email_configuration>? = null
  var email_verification_message: String? = null
  var admin_create_user_config: List<Admin_create_user_config>? = null
  var auto_verified_attributes: List<Auto_verified_attributes>? = null
  var device_configuration: List<Device_configuration>? = null
  var password_policy: List<Password_policy>? = null
  var sms_configuration: List<Sms_configuration>? = null
  var username_attributes: List<Username_attributes>? = null
  var sms_verification_message: String? = null
  var tags: Map<String, String>? = null
  var email_verification_subject: String? = null
  var lambda_config: List<Lambda_config>? = null
  var schema: List<Schema>? = null
 

enum class Username_attributes(val theValue: String ) {
	 email ("email"), phone_number ("phone_number") ;
	override fun toString() = theValue
	}
enum class Alias_attributes(val theValue: String ) {
	 email ("email"), phone_number ("phone_number"), preferred_username ("preferred_username") ;
	override fun toString() = theValue
	}
enum class Mfa_configuration(val theValue: String ) {
	 OFF ("OFF"), ON ("ON"), OPTIONAL ("OPTIONAL") ;
	override fun toString() = theValue
	}
enum class Auto_verified_attributes(val theValue: String ) {
	 phone_number ("phone_number"), email ("email") ;
	override fun toString() = theValue
	}

class Lambda_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var create_auth_challenge: String? = null
  var custom_message: String? = null
  var post_authentication: String? = null
  var pre_authentication: String? = null
  var pre_sign_up: String? = null
  var pre_token_generation: String? = null
  var define_auth_challenge: String? = null
  var post_confirmation: String? = null
  var user_migration: String? = null
  var verify_auth_challenge_response: String? = null
 

}

class Verification_message_template() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var default_email_option: Default_email_option? = null
  var email_message: String? = null
  var email_message_by_link: String? = null
  var email_subject: String? = null
  var email_subject_by_link: String? = null
  var sms_message: String? = null
 

enum class Default_email_option(val theValue: String ) {
	 CONFIRM_WITH_LINK ("CONFIRM_WITH_LINK"), CONFIRM_WITH_CODE ("CONFIRM_WITH_CODE") ;
	override fun toString() = theValue
	}
}

class Email_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var source_arn: String? = null
  var email_sending_account: Email_sending_account? = null
  var reply_to_email_address: String? = null
 

enum class Email_sending_account(val theValue: String ) {
	 COGNITO_DEFAULT ("COGNITO_DEFAULT"), DEVELOPER ("DEVELOPER") ;
	override fun toString() = theValue
	}
}

class Admin_create_user_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var allow_admin_create_user_only: Boolean? = null
  var invite_message_template: List<Invite_message_template>? = null
  var unused_account_validity_days: Int? = null
 


class Invite_message_template() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var email_message: String? = null
  var email_subject: String? = null
  var sms_message: String? = null
 

}
}

class Password_policy() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var require_lowercase: Boolean? = null
  var require_numbers: Boolean? = null
  var require_symbols: Boolean? = null
  var require_uppercase: Boolean? = null
  var temporary_password_validity_days: Int? = null
  var minimum_length: Int? = null
 

}

class Sms_configuration(val external_id : String, val sns_caller_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class User_pool_add_ons(val advanced_security_mode : Advanced_security_mode) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Advanced_security_mode(val theValue: String ) {
	 AUDIT ("AUDIT"), ENFORCED ("ENFORCED"), OFF ("OFF") ;
	override fun toString() = theValue
	}
}

class Device_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var challenge_required_on_new_device: Boolean? = null
  var device_only_remembered_on_user_prompt: Boolean? = null
 

}

class Schema(val attribute_data_type : Attribute_data_type, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var developer_only_attribute: Boolean? = null
  var mutable: Boolean? = null
  var number_attribute_constraints: List<Number_attribute_constraints>? = null
  var required: Boolean? = null
  var string_attribute_constraints: List<String_attribute_constraints>? = null
 

enum class Attribute_data_type(val theValue: String ) {
	 _String ("String"), Number ("Number"), DateTime ("DateTime"), Boolean ("Boolean") ;
	override fun toString() = theValue
	}

class Number_attribute_constraints() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var min_value: String? = null
  var max_value: String? = null
 

}

class String_attribute_constraints() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var min_length: String? = null
  var max_length: String? = null
 

}
}
}
