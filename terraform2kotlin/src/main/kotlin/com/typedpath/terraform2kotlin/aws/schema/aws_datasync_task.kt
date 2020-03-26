package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_datasync_task(val destination_location_arn : String, val source_location_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var options: List<Options>? = null
  var tags: Map<String, String>? = null
  var cloudwatch_log_group_arn: String? = null
  var name: String? = null
 


class Options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var posix_permissions: Posix_permissions? = null
  var preserve_deleted_files: Preserve_deleted_files? = null
  var uid: Uid? = null
  var bytes_per_second: Int? = null
  var gid: Gid? = null
  var preserve_devices: Preserve_devices? = null
  var verify_mode: Verify_mode? = null
  var atime: Atime? = null
  var mtime: Mtime? = null
 

enum class Posix_permissions(val theValue: String ) {
	 NONE ("NONE"), PRESERVE ("PRESERVE") ;
	override fun toString() = theValue
	}
enum class Preserve_deleted_files(val theValue: String ) {
	 PRESERVE ("PRESERVE"), REMOVE ("REMOVE") ;
	override fun toString() = theValue
	}
enum class Uid(val theValue: String ) {
	 BOTH ("BOTH"), INT_VALUE ("INT_VALUE"), NAME ("NAME"), NONE ("NONE") ;
	override fun toString() = theValue
	}
enum class Gid(val theValue: String ) {
	 BOTH ("BOTH"), INT_VALUE ("INT_VALUE"), NAME ("NAME"), NONE ("NONE") ;
	override fun toString() = theValue
	}
enum class Preserve_devices(val theValue: String ) {
	 NONE ("NONE"), PRESERVE ("PRESERVE") ;
	override fun toString() = theValue
	}
enum class Verify_mode(val theValue: String ) {
	 NONE ("NONE"), POINT_IN_TIME_CONSISTENT ("POINT_IN_TIME_CONSISTENT") ;
	override fun toString() = theValue
	}
enum class Atime(val theValue: String ) {
	 BEST_EFFORT ("BEST_EFFORT"), NONE ("NONE") ;
	override fun toString() = theValue
	}
enum class Mtime(val theValue: String ) {
	 NONE ("NONE"), PRESERVE ("PRESERVE") ;
	override fun toString() = theValue
	}
}
}
