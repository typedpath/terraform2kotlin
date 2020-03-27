package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lambda_layer_version(val layer_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var filename: String? = null
  var s3_key: String? = null
  var s3_object_version: String? = null
  var s3_bucket: String? = null
  var compatible_runtimes: List<Compatible_runtimes>? = null
  var source_code_hash: String? = null
  var description: String? = null
  var license_info: String? = null
 

enum class Compatible_runtimes(val theValue: String ) {
	 dotnetcore1_0 ("dotnetcore1.0"), dotnetcore2_0 ("dotnetcore2.0"), dotnetcore2_1 ("dotnetcore2.1"), go1_x ("go1.x"), java8 ("java8"), java11 ("java11"), nodejs4_3 ("nodejs4.3"), nodejs4_3_edge ("nodejs4.3-edge"), nodejs6_10 ("nodejs6.10"), nodejs8_10 ("nodejs8.10"), nodejs10_x ("nodejs10.x"), nodejs12_x ("nodejs12.x"), provided ("provided"), python2_7 ("python2.7"), python3_6 ("python3.6"), python3_7 ("python3.7"), python3_8 ("python3.8"), ruby2_5 ("ruby2.5"), ruby2_7 ("ruby2.7") ;
	override fun toString() = theValue
	}
fun compatible_runtimeRef(subPath: String = "") = ref(this, "compatible_runtime", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun license_infoRef(subPath: String = "") = ref(this, "license_info", subPath)
fun layer_arnRef(subPath: String = "") = ref(this, "layer_arn", subPath)
fun created_dateRef(subPath: String = "") = ref(this, "created_date", subPath)
fun source_code_hashRef(subPath: String = "") = ref(this, "source_code_hash", subPath)
fun source_code_sizeRef(subPath: String = "") = ref(this, "source_code_size", subPath)
fun layer_nameRef(subPath: String = "") = ref(this, "layer_name", subPath)
fun versionRef(subPath: String = "") = ref(this, "version", subPath)
fun compatible_runtimesRef(subPath: String = "") = ref(this, "compatible_runtimes", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
}
