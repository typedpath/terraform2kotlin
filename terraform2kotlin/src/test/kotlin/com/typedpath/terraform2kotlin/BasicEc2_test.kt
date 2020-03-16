import com.typedpath.terraform2kotlin.*
import com.typedpath.terraform2kotlin.aws.schema.*

import org.junit.Test

class BasicEc2_test {
    @Test
    fun test() {
        val strTemplate = toTerraform(BasicEc2Template())
        // load basicEc2.tf and check they match
        val fileContent = BasicEc2_test::class.java.getResource("/basicEc2.tf").readText()
        assertCompareLineByLineIgnoreEmptyLinesIgnoreWhiteSpaceWidth(strTemplate, fileContent)
    }

}
