package com.typedpath.terraform2kotlin.dynamodb

import com.typedpath.terraform2kotlin.Output
import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.aws.schema.aws_dynamodb_table
import com.typedpath.terraform2kotlin.aws.schema.aws_dynamodb_table.*
import com.typedpath.terraform2kotlin.aws.schema.aws_dynamodb_table.Attribute.Type

/**
 * based on https://www.terraform.io/docs/providers/aws/r/dynamodb_table.html
 */
class DynamoDbBasicTemplate(val tableName: String = "GameScores") : TerraformTemplate() {

    val UserIdAttributeName = "UserId"
    val GameTitleAttributeName = "GameTitle"
    val TopScoreAttributeName = "TopScore"

    val basicDynamodbTable = aws_dynamodb_table(
            name = tableName,
            hash_key = UserIdAttributeName,
            attribute = listOf(
                    Attribute(name = UserIdAttributeName, type = Type.S),
                    Attribute(name = GameTitleAttributeName, type = Type.S),
                    Attribute(name = TopScoreAttributeName, type = Type.N)
            )
    ).apply {
        billing_mode = Billing_mode.PROVISIONED
        read_capacity = 2
        write_capacity = 2
        range_key = GameTitleAttributeName
        // This is disabled because it causes an error if called frequently
        // see https://github.com/terraform-providers/terraform-provider-aws/issues/10304
        /*   ttl = listOf(Ttl(attribute_name = "TimeToExist").apply {
               enabled = false
           })
   */
        global_secondary_index = listOf(
                Global_secondary_index(name = "GameTitleIndex",
                        hash_key = GameTitleAttributeName, projection_type = "INCLUDE"
                ).apply {
                    range_key = TopScoreAttributeName
                    write_capacity = 2
                    read_capacity = 2
                    non_key_attributes = listOf(UserIdAttributeName)
                })

        tags = mapOf("Name" to "dynamodb-table-1",
                "Environment" to "production")
    }

    val tableArn = Output(basicDynamodbTable.arnRef())
    val tableId = Output(basicDynamodbTable.idRef())

}