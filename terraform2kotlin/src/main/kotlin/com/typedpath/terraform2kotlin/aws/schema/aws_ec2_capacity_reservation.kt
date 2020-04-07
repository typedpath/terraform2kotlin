package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ec2_capacity_reservation(val availability_zone : String, val instance_platform : Instance_platform, val instance_type : String, val instance_count : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tenancy: Tenancy? = null
  var end_date: String? = null
  var end_date_type: End_date_type? = null
  var instance_match_criteria: Instance_match_criteria? = null
  var tags: Map<String, String>? = null
  var ebs_optimized: Boolean? = null
  var ephemeral_storage: Boolean? = null
 

enum class Instance_platform(val theValue: String ) {
	 Linux_UNIX ("Linux/UNIX"), Red_Hat_Enterprise_Linux ("Red Hat Enterprise Linux"), SUSE_Linux ("SUSE Linux"), Windows ("Windows"), Windows_with_SQL_Server ("Windows with SQL Server"), Enterprise_Windows_with_SQL_Server ("Enterprise Windows with SQL Server"), Standard_Windows_with_SQL_Server_Web ("Standard Windows with SQL Server Web") ;
	override fun toString() = theValue
	}
enum class End_date_type(val theValue: String ) {
	 unlimited ("unlimited"), limited ("limited") ;
	override fun toString() = theValue
	}
enum class Instance_match_criteria(val theValue: String ) {
	 _open ("open"), targeted ("targeted") ;
	override fun toString() = theValue
	}
enum class Tenancy(val theValue: String ) {
	 default ("default"), dedicated ("dedicated") ;
	override fun toString() = theValue
	}
}
