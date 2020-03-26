package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_s3_bucket_inventory(val bucket : String, val name : String, val destination : List<Destination>, val schedule : List<Schedule>, val included_object_versions : Included_object_versions) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var optional_fields: List<Optional_fields>? = null
  var enabled: Boolean? = null
  var filter: List<Filter>? = null
 

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
	 


class Bucket(val bucket_arn : String, val format : Format) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var account_id: String? = null
  var prefix: String? = null
  var encryption: List<Encryption>? = null
 

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
