package com.typedpath.terraform2kotlin.s3

import com.typedpath.terraform2kotlin.Output
import com.typedpath.terraform2kotlin.TerraformTemplate

class S3UtilOutputsTemplate(mainTemplate: S3UtilMainTemplate) : TerraformTemplate(scope=mainTemplate.scope) {

    val this_s3_bucket_id = Output(mainTemplate.s3_bucket.idRef())
    val this_s3_bucket_arn = Output(mainTemplate.s3_bucket.arnRef())
    val this_s3_bucket_domain_name = Output(mainTemplate.s3_bucket.bucket_domain_nameRef())
    val this_s3_bucket_bucket_regional_domain_name = Output(mainTemplate.s3_bucket.bucket_regional_domain_nameRef())
    val this_s3_bucket_hosted_zone_id = Output(mainTemplate.s3_bucket.hosted_zone_idRef())
    val this_s3_bucket_region = Output(mainTemplate.s3_bucket.bucket_domain_nameRef())
    val this_s3_bucket_website_endpoint = Output(mainTemplate.s3_bucket.website_endpointRef())
    val this_s3_bucket_website_domain = Output(mainTemplate.s3_bucket.website_domainRef())

    val allNames = listOf(::this_s3_bucket_id.name, ::this_s3_bucket_arn.name,
        ::this_s3_bucket_domain_name.name, ::this_s3_bucket_bucket_regional_domain_name.name,
        ::this_s3_bucket_hosted_zone_id.name, ::this_s3_bucket_region.name,
        ::this_s3_bucket_website_endpoint.name, ::this_s3_bucket_website_domain.name
    ).map { scopeName(it) }

    val nonWebsiteNames = listOf(::this_s3_bucket_id.name, ::this_s3_bucket_arn.name,
        ::this_s3_bucket_domain_name.name, ::this_s3_bucket_bucket_regional_domain_name.name,
        ::this_s3_bucket_hosted_zone_id.name, ::this_s3_bucket_region.name
    ).map{ scopeName(it)}

}