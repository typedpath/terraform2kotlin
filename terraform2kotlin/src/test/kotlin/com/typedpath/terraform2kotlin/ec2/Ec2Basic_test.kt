import com.typedpath.terraform2kotlin.*
import com.typedpath.terraform2kotlin.ec2.Ec2BasicTemplate

import org.junit.Test

class Ec2Basic_test {
    @Test
    fun test() {
        val strTemplate = toTerraform(Ec2BasicTemplate())
        println(strTemplate)
        // load basicEc2.tf and check they match
        val fileContent = Ec2Basic_test::class.java.getResource("/basicEc2.tf").readText()
        assertCompareLineByLineIgnoreEmptyLinesIgnoreWhiteSpaceWidth(strTemplate, fileContent)
    }

}
