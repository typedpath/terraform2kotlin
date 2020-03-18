package com.typedpath.terraform2kotlin

import org.junit.Test

class SerializationTest {
    @Test
    fun testToJson() {
        val assumeRolePolicyDocument = IamPolicy().apply {
            statement {
                //TODO make this a constant
                action("sts:AssumeRole")
                effect = IamPolicy.EffectType.Allow
                //TODO make this a constant
                principal = mapOf( Pair( IamPolicy.PrincipalType.Service, listOf("lambda.amazonaws.com"))
                )
            }
        }
        println(toJson(assumeRolePolicyDocument))
    }
}