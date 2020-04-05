package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ami(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var image_location: String? = null
  var root_device_name: String? = null
  var sriov_net_support: String? = null
  var architecture: String? = null
  var ephemeral_block_device: List<Ephemeral_block_device>? = null
  var ramdisk_id: String? = null
  var virtualization_type: String? = null
  var ebs_block_device: List<Ebs_block_device>? = null
  var ena_support: Boolean? = null
  var kernel_id: String? = null
  var tags: Map<String, String>? = null
  var description: String? = null
 


class Ephemeral_block_device(val virtual_name : String, val device_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Ebs_block_device(val device_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var encrypted: Boolean? = null
  var iops: Int? = null
  var snapshot_id: String? = null
  var volume_size: Int? = null
  var volume_type: String? = null
  var delete_on_termination: Boolean? = null
 

}
fun image_locationRef(subPath: String = "") = ref(this, "image_location", subPath)
fun image_owner_aliasRef(subPath: String = "") = ref(this, "image_owner_alias", subPath)
fun root_snapshot_idRef(subPath: String = "") = ref(this, "root_snapshot_id", subPath)
fun stateRef(subPath: String = "") = ref(this, "state", subPath)
fun state_reasonRef(subPath: String = "") = ref(this, "state_reason", subPath)
fun ownersRef(subPath: String = "") = ref(this, "owners", subPath)
fun owner_idRef(subPath: String = "") = ref(this, "owner_id", subPath)
fun publicRef(subPath: String = "") = ref(this, "public", subPath)
fun most_recentRef(subPath: String = "") = ref(this, "most_recent", subPath)
fun architectureRef(subPath: String = "") = ref(this, "architecture", subPath)
fun creation_dateRef(subPath: String = "") = ref(this, "creation_date", subPath)
fun block_device_mappingsRef(subPath: String = "") = ref(this, "block_device_mappings", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun hypervisorRef(subPath: String = "") = ref(this, "hypervisor", subPath)
fun image_typeRef(subPath: String = "") = ref(this, "image_type", subPath)
fun kernel_idRef(subPath: String = "") = ref(this, "kernel_id", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun root_device_nameRef(subPath: String = "") = ref(this, "root_device_name", subPath)
fun root_device_typeRef(subPath: String = "") = ref(this, "root_device_type", subPath)
fun virtualization_typeRef(subPath: String = "") = ref(this, "virtualization_type", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun sriov_net_supportRef(subPath: String = "") = ref(this, "sriov_net_support", subPath)
fun executable_usersRef(subPath: String = "") = ref(this, "executable_users", subPath)
fun name_regexRef(subPath: String = "") = ref(this, "name_regex", subPath)
fun image_idRef(subPath: String = "") = ref(this, "image_id", subPath)
fun ramdisk_idRef(subPath: String = "") = ref(this, "ramdisk_id", subPath)
fun platformRef(subPath: String = "") = ref(this, "platform", subPath)
fun product_codesRef(subPath: String = "") = ref(this, "product_codes", subPath)
}
