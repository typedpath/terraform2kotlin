package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_group_membership(val name : String, val users : List<String>, val group : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
