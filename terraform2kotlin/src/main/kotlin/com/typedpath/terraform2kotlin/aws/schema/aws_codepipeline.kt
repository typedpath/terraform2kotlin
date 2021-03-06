package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_codepipeline(val name : String, val role_arn : String, val artifact_store : List<Artifact_store>, val stage : List<Stage>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 


class Artifact_store(val location : String, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var encryption_key: List<Encryption_key>? = null
 

enum class Type(val theValue: String ) {
	 S3 ("S3") ;
	override fun toString() = theValue
	}

class Encryption_key(val id : String, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Type(val theValue: String ) {
	 KMS ("KMS") ;
	override fun toString() = theValue
	}
}
}

class Stage(val name : String, val action : List<Action>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Action(val category : Category, val owner : Owner, val provider : String, val version : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var input_artifacts: List<String>? = null
  var role_arn: String? = null
  var run_order: Int? = null
  var configuration: Map<String, String>? = null
  var output_artifacts: List<String>? = null
 

enum class Category(val theValue: String ) {
	 Source ("Source"), Build ("Build"), Deploy ("Deploy"), Test ("Test"), Invoke ("Invoke"), Approval ("Approval") ;
	override fun toString() = theValue
	}
enum class Owner(val theValue: String ) {
	 AWS ("AWS"), ThirdParty ("ThirdParty"), Custom ("Custom") ;
	override fun toString() = theValue
	}
}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
