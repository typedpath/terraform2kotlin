import com.typedpath.terraform2kotlin.*
import org.junit.Assert
import org.junit.Test

//TODO use unique names for resources so that previous test runs cant interfere
//TODO auto clean up - terraform destroy
class SecurityGroupEc2_test {
    @Test
    fun test() {
        val webGreeting = "Hello Terraform 2 Kotlin"
        val template = SecurityGroupEc2Template(webGreeting)
        println("template:\r\n ${toTerraform(template)}")
        val runner = terraformAwsRunnerFromEnvironment(this, SecurityGroupEc2Template(webGreeting))

        try {
            val outputs = runner.initApply()
            println("outputs:")
            outputs.forEach { println("'${it.key}'=>'${it.value}'") }
            val webaddressOutput = "webaddress"
            Assert.assertTrue("apply should return $webaddressOutput output", outputs.containsKey(webaddressOutput))
            val webaddress = outputs.get(webaddressOutput) as String?
            val response = waitForConnectionRead(webaddress!!, 120)
            println("response: $response")
            Assert.assertTrue(
                "web response should contain '$webGreeting' : '$response' ",
                response != null && response!!.contains(webGreeting)
            )
        } finally {
            val destroyresult = runner.destroy()
            println(destroyresult)
        }
    }
}

