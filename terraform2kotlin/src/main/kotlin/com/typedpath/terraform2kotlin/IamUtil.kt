package com.typedpath.terraform2kotlin

import com.typedpath.terraform2kotlin.aws.schema.aws_iam_policy_document

fun assumeRolePolicyDocumentForService(service: String /* e.g. "eks.amazonaws.com"*/)  = aws_iam_policy_document().apply {
    version = aws_iam_policy_document.Version._2012_10_17
    statement = listOf(
            aws_iam_policy_document.Statement().apply {
                effect = aws_iam_policy_document.Statement.Effect.Allow
                principals = listOf(
                        aws_iam_policy_document.Statement.Principals(type = "Service",
                                identifiers = listOf(service)
                        )
                )
                actions = listOf("sts:AssumeRole")
            }
    )
}