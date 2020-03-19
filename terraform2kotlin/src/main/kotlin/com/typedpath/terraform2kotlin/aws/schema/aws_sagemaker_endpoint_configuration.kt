package com.typedpath.terraform2kotlin.aws.schema

class aws_sagemaker_endpoint_configuration(val production_variants : List<Production_variants>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var kms_key_arn: String? = null
  var tags: Map<String, String>? = null
 


class Production_variants(val model_name : String, val initial_instance_count : Int, val instance_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var initial_variant_weight: Float? = null
  var accelerator_type: String? = null
  var variant_name: String? = null
 

}
}
