package com.typedpath.terraform2kotlin.aws.schema

class aws_codepipeline(val role_arn : String, val artifact_store : List<Artifact_store>, val stage : List<Stage>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 


class Artifact_store(val type : Type, val location : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var encryption_key: List<Encryption_key>? = null
 

enum class Type(val theValue: String ) {
	 S3 ("S3") ;
	override fun toString() = theValue
	}

class Encryption_key(val type : Type, val id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Type(val theValue: String ) {
	 KMS ("KMS") ;
	override fun toString() = theValue
	}
}
}

class Stage(val name : String, val action : List<Action>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Action(val provider : String, val version : String, val owner : Owner, val name : String, val category : Category) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var configuration: Map<String, String>? = null
  var role_arn: String? = null
  var run_order: Int? = null
  var input_artifacts: List<String>? = null
  var output_artifacts: List<String>? = null
 

enum class Owner(val theValue: String ) {
	 AWS ("AWS"), ThirdParty ("ThirdParty"), Custom ("Custom") ;
	override fun toString() = theValue
	}
enum class Category(val theValue: String ) {
	 Source ("Source"), Build ("Build"), Deploy ("Deploy"), Test ("Test"), Invoke ("Invoke"), Approval ("Approval") ;
	override fun toString() = theValue
	}
}
}
}
