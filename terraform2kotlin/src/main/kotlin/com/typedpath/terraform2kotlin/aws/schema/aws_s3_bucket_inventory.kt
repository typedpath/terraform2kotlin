package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_s3_bucket_inventory(val included_object_versions : Included_object_versions, val bucket : String, val name : String, val destination : List<Destination>, val schedule : List<Schedule>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enabled: Boolean? = null
  var filter: List<Filter>? = null
  var optional_fields: List<Optional_fields>? = null
 

enum class Included_object_versions(val theValue: String ) {
	 Current ("Current"), All ("All") ;
	override fun toString() = theValue
	}
enum class Optional_fields(val theValue: String ) {
	 Size ("Size"), LastModifiedDate ("LastModifiedDate"), StorageClass ("StorageClass"), ETag ("ETag"), IsMultipartUploaded ("IsMultipartUploaded"), ReplicationStatus ("ReplicationStatus"), EncryptionStatus ("EncryptionStatus"), ObjectLockMode ("ObjectLockMode"), ObjectLockRetainUntilDate ("ObjectLockRetainUntilDate"), ObjectLockLegalHoldStatus ("ObjectLockLegalHoldStatus"), IntelligentTieringAccessTier ("IntelligentTieringAccessTier") ;
	override fun toString() = theValue
	}

class Destination(val bucket : List<Bucket>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Bucket(val format : Format, val bucket_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var prefix: String? = null
  var encryption: List<Encryption>? = null
  var account_id: String? = null
 

enum class Format(val theValue: String ) {
	 CSV ("CSV"), ORC ("ORC"), Parquet ("Parquet") ;
	override fun toString() = theValue
	}

class Encryption() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var sse_kms: List<Sse_kms>? = null
  var sse_s3: List<Sse_s3>? = null
 


class Sse_kms(val key_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Sse_s3() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
}

class Schedule(val frequency : Frequency) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Frequency(val theValue: String ) {
	 Daily ("Daily"), Weekly ("Weekly") ;
	override fun toString() = theValue
	}
}

class Filter() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var prefix: String? = null
 

}
}
