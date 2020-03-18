import com.typedpath.terraform2kotlin.*
import org.junit.Assert
import org.junit.Test
import java.io.File
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL

//TODO use unique names for resources so that previous test runs cant interfere
//TODO auto clean up - terraform destroy
class SecurityGroupEc2_test {
    @Test
    fun test() {
        val webGreeting = "Hello Terraform 2 Kotlin"
        val template = SecurityGroupEc2Template(webGreeting)
        println("template:\r\n ${toTerraform(template)}")
        val runner = terraformAwsRunnerFromEnvironment(SecurityGroupEc2Template(webGreeting))

        try {
            val outputs = runner.initApply()
            println("outputs:")
            outputs.forEach { println("'${it.key}'=>'${it.value}'") }
            val webaddressOutput = "webaddress"
            Assert.assertTrue("apply should return $webaddressOutput output", outputs.containsKey(webaddressOutput))
            val webaddress = outputs.get(webaddressOutput)
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

    fun waitForConnectionRead(strUrl: String, timeoutSeconds: Int): String? {
        val endTime = System.currentTimeMillis() + (1000 * timeoutSeconds)
        val url = URL(strUrl)
        while (System.currentTimeMillis() < endTime) {
            val response = readURL(url)
            if (response != null) {
                return response
            }
            Thread.sleep(1000)
        }
        return null
    }

    fun readURL(url: URL): String? {
        return try {
            url.readText()
        } catch (exception: IOException) {
            null
        }
    }

}

