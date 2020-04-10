import com.amazonaws.auth.AWSCredentials
import com.amazonaws.auth.AWSStaticCredentialsProvider
import com.amazonaws.auth.BasicAWSCredentials
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder
import com.amazonaws.services.dynamodbv2.model.*
import com.typedpath.terraform2kotlin.*
import com.typedpath.terraform2kotlin.dynamodb.DynamoDbBasicTemplate
import org.junit.Assert
import org.junit.Test
import java.util.*


class DynamoDbBasic_test {

    @Test
    fun test() {
        val timestamp = System.currentTimeMillis()
        val tableName = "GameScores${timestamp}"
        val template = DynamoDbBasicTemplate(tableName)
        println("template:\r\n ${toTerraform(template)}")
        val runner = terraformAwsRunnerFromEnvironment(::test, template)

        try {
            val outputs = runner.initApply()
            println("outputs:")
            outputs.forEach { println("'${it.key}'=>'${it.value}'") }
            Assert.assertNotNull(DynamoDbBasicTemplate::tableArn.name, outputs.get(DynamoDbBasicTemplate::tableArn.name))
            Assert.assertNotNull(DynamoDbBasicTemplate::tableId.name, outputs.get(DynamoDbBasicTemplate::tableId.name))

            val awsCredentials: AWSCredentials = BasicAWSCredentials(getTestAccessKey(), getTestSecretKey())
            val ddbClient = AmazonDynamoDBClientBuilder.standard()
                    .withRegion(getTestRegion())
                    .withCredentials(AWSStaticCredentialsProvider(awsCredentials)).build()

            val tableInfo: TableDescription = ddbClient.describeTable(tableName).getTable()
            Assert.assertNotNull("table info", tableInfo)
            println("tableInfo ****:\r\n $tableInfo")
            // create
            val gameTitle = "Space Invaders"
            val topScore = 9876543L

            val id = insertItem(template, ddbClient, gameTitle, topScore)
            println("id= $id")
            // read
            val item = readItem(template, ddbClient, id, gameTitle)
            val gameTitleOut: AttributeValue = item!!.get(template.GameTitleAttributeName) as AttributeValue
            Assert.assertEquals(template.GameTitleAttributeName, gameTitle, gameTitleOut.s)
            val topScoreOut: AttributeValue = item!!.get(template.TopScoreAttributeName) as AttributeValue
            Assert.assertEquals(template.TopScoreAttributeName, topScore, topScoreOut.n.toLong())
            updateItem(template, ddbClient, id, gameTitle, topScore + 1)
            val updatedItem = readItem(template, ddbClient, id, gameTitle)
            Assert.assertEquals("updated topScore", topScore + 1,
                    updatedItem!!.get(template.TopScoreAttributeName)!!.n.toLong())
            deleteItem(template, ddbClient, id, gameTitle)
            val deletedItem = readItem(template, ddbClient, id, gameTitle)
            Assert.assertNull("item deleted", deletedItem)

        } finally {
            println("destroying")
            println(runner.destroy())
        }

    }

    fun insertItem(template: DynamoDbBasicTemplate, ddb: AmazonDynamoDB, gameTitle: String, topScore: Long): String {
        val item_values = mutableMapOf<String, AttributeValue>()
        val id = "${System.currentTimeMillis()}"
        item_values.put(template.UserIdAttributeName, AttributeValue(id));
        item_values.put(template.GameTitleAttributeName, AttributeValue(gameTitle))
        item_values.put(template.TopScoreAttributeName, AttributeValue().withN("$topScore"))
        ddb.putItem(template.tableName, item_values);
        return id
    }

    fun readItem(template: DynamoDbBasicTemplate, ddb: AmazonDynamoDB, id: String, gameTitle: String): Map<String, AttributeValue>? {
        val key_to_get = HashMap<String, AttributeValue>()
        key_to_get[template.UserIdAttributeName] = AttributeValue(id)
        key_to_get[template.GameTitleAttributeName] = AttributeValue(gameTitle)
        return ddb.getItem(template.tableName, key_to_get).item
    }

    fun updateItem(template: DynamoDbBasicTemplate, ddb: AmazonDynamoDB, id: String, gameTitle: String, topScore: Long): UpdateItemResult {
        val key_to_get = HashMap<String, AttributeValue>()
        key_to_get[template.UserIdAttributeName] = AttributeValue(id)
        key_to_get[template.GameTitleAttributeName] = AttributeValue(gameTitle)

        val updated_values = HashMap<String, AttributeValueUpdate>()

        updated_values[template.TopScoreAttributeName] = AttributeValueUpdate(
                AttributeValue().withN("$topScore"), AttributeAction.PUT)

        val result = ddb.updateItem(template.tableName, key_to_get, updated_values)
        return result
    }

    fun deleteItem(template: DynamoDbBasicTemplate, ddb: AmazonDynamoDB, id: String, gameTitle: String) {
        val key_to_get = HashMap<String, AttributeValue>()
        key_to_get[template.UserIdAttributeName] = AttributeValue(id)
        key_to_get[template.GameTitleAttributeName] = AttributeValue(gameTitle)
        ddb.deleteItem(template.tableName, key_to_get)
    }
}