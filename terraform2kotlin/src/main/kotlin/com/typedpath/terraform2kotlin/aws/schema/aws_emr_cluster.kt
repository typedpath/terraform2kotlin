package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_emr_cluster(val name : String, val service_role : String, val release_label : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var keep_job_flow_alive_when_no_steps: Boolean? = null
  var ec2_attributes: List<Ec2_attributes>? = null
  var core_instance_group: List<Core_instance_group>? = null
  var tags: Map<String, String>? = null
  var master_instance_group: List<Master_instance_group>? = null
  var configurations_json: String? = null
  var custom_ami_id: String? = null
  var visible_to_all_users: Boolean? = null
  var step_concurrency_level: Int? = null
  var log_uri: String? = null
  var kerberos_attributes: List<Kerberos_attributes>? = null
  var autoscaling_role: String? = null
  var applications: List<String>? = null
  var security_configuration: String? = null
  var master_instance_type: String? = null
  var termination_protection: Boolean? = null
  var step: List<Step>? = null
  var core_instance_count: Int? = null
  var bootstrap_action: List<Bootstrap_action>? = null
  var configurations: String? = null
  var scale_down_behavior: Scale_down_behavior? = null
  var ebs_root_volume_size: Int? = null
  var additional_info: String? = null
  var core_instance_type: String? = null
  var instance_group: List<Instance_group>? = null
 

enum class Scale_down_behavior(val theValue: String ) {
	 TERMINATE_AT_INSTANCE_HOUR ("TERMINATE_AT_INSTANCE_HOUR"), TERMINATE_AT_TASK_COMPLETION ("TERMINATE_AT_TASK_COMPLETION") ;
	override fun toString() = theValue
	}

class Ec2_attributes(val instance_profile : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var key_name: String? = null
  var subnet_id: String? = null
  var additional_master_security_groups: String? = null
  var additional_slave_security_groups: String? = null
  var emr_managed_master_security_group: String? = null
  var emr_managed_slave_security_group: String? = null
  var service_access_security_group: String? = null
 

}

class Core_instance_group(val instance_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ebs_config: List<Ebs_config>? = null
  var instance_count: Int? = null
  var name: String? = null
  var autoscaling_policy: String? = null
  var bid_price: String? = null
 


class Ebs_config(val type : Type, val size : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var iops: Int? = null
  var volumes_per_instance: Int? = null
 

enum class Type(val theValue: String ) {
	 gp2 ("gp2"), io1 ("io1"), standard ("standard"), st1 ("st1") ;
	override fun toString() = theValue
	}
}
}

class Master_instance_group(val instance_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var name: String? = null
  var bid_price: String? = null
  var ebs_config: List<Ebs_config>? = null
  var instance_count: Int? = null
 


class Ebs_config(val size : Int, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var volumes_per_instance: Int? = null
  var iops: Int? = null
 

enum class Type(val theValue: String ) {
	 gp2 ("gp2"), io1 ("io1"), standard ("standard"), st1 ("st1") ;
	override fun toString() = theValue
	}
}
}

class Kerberos_attributes(val kdc_admin_password : String, val realm : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cross_realm_trust_principal_password: String? = null
  var ad_domain_join_password: String? = null
  var ad_domain_join_user: String? = null
 

}

class Step(val action_on_failure : Action_on_failure, val hadoop_jar_step : List<Hadoop_jar_step>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Action_on_failure(val theValue: String ) {
	 CANCEL_AND_WAIT ("CANCEL_AND_WAIT"), CONTINUE ("CONTINUE"), TERMINATE_CLUSTER ("TERMINATE_CLUSTER"), TERMINATE_JOB_FLOW ("TERMINATE_JOB_FLOW") ;
	override fun toString() = theValue
	}

class Hadoop_jar_step(val jar : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var args: List<String>? = null
  var main_class: String? = null
  var properties: Map<String, String>? = null
 

}
}

class Bootstrap_action(val name : String, val path : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var args: List<String>? = null
 

}

class Instance_group(val instance_type : String, val instance_role : Instance_role) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var name: String? = null
  var bid_price: String? = null
  var ebs_config: List<Ebs_config>? = null
  var instance_count: Int? = null
  var autoscaling_policy: String? = null
 

enum class Instance_role(val theValue: String ) {
	 MASTER ("MASTER"), CORE ("CORE"), TASK ("TASK") ;
	override fun toString() = theValue
	}

class Ebs_config(val size : Int, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var iops: Int? = null
  var volumes_per_instance: Int? = null
 

enum class Type(val theValue: String ) {
	 gp2 ("gp2"), io1 ("io1"), standard ("standard"), st1 ("st1") ;
	override fun toString() = theValue
	}
}
}
}
