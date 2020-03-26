package com.typedpath.terraform2kotlin.`eks-getting-started`

import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.aws.schema.aws_availability_zones
import com.typedpath.terraform2kotlin.aws.schema.aws_region

class GlobalsTemplate() : TerraformTemplate() {
    val current = aws_region()
    val available = aws_availability_zones()
}