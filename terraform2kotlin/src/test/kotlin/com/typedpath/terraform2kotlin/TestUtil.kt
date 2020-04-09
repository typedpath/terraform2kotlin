package com.typedpath.terraform2kotlin
import com.amazonaws.auth.AWSSessionCredentials
import com.amazonaws.auth.BasicAWSCredentials
import org.junit.Assert
import java.io.File
import kotlin.reflect.KFunction
import kotlin.reflect.jvm.javaMethod


class LineComparison(val matches: Boolean, val line1: String?, val line2: String?) {
}
fun compareLineByLineIgnoreEmptyLinesIgnoreWhiteSpaceWidth(str1: String, str2: String)
        : List<LineComparison> {
   fun normalizedSplit(str: String)  = str.split("\r", "\n")
       .filter { it.isNotEmpty() }
       .map {
       val lres =  it.replace("\\s+".toRegex()) {it.value[0].toString().trimEnd()}
       lres
   }
   val lines1 =  normalizedSplit(str1)
   val lines2 =  normalizedSplit(str2)

   val result = mutableListOf<LineComparison>()
   for (i in 0 until (Math.max(lines1.size, lines2.size))) {
       var line1 = if (i>=lines1.size) null else lines1[i]
       var line2 = if (i>=lines2.size) null else lines2[i]
       val matches = (line1.isNullOrEmpty() && line2.isNullOrEmpty())
               || (line1 != null && line2 != null && line1.equals(line2))
       result.add(LineComparison(matches, line1, line2))
   }
   return result
}

fun assertCompareLineByLineIgnoreEmptyLinesIgnoreWhiteSpaceWidth(str1: String, str2: String) {
    val comparisonResult = compareLineByLineIgnoreEmptyLinesIgnoreWhiteSpaceWidth(str1, str2)
    val diffCount = comparisonResult.count { !it.matches }

    Assert.assertTrue(
                "comparing\r\n"  + str1 + "\r\n to \r\n" + str2 + "\r\n" +

        "$diffCount lines mismatching\r\n"
                + comparisonResult.map
            { "${if (it.matches) "match" else "FAIL"} line1:${it.line1} line2:${it.line2}" }
            .joinToString(System.lineSeparator()),
        diffCount == 0)
}

fun contextAsString(context: Any) : String {
    return if (context is KFunction<*>) {
         if (context.javaMethod!=null) context.javaMethod!!.declaringClass.simpleName + "/" + context.name
         else context.name
    } else context.javaClass.simpleName
}

val accessKeyPropertyName = "awsTestAccessKey"
val secretKeyPropertyName =   "awsTestSecretKey"
val regionPropertyName    = "awsTestRegion"
val accountIdPropertyName    = "awsTestAccountId"

fun getTestAccessKey() = System.getenv(accessKeyPropertyName)
fun getTestSecretKey() = System.getenv(secretKeyPropertyName)
fun getTestRegion() = System.getenv(regionPropertyName)
fun getTestAccountId() = System.getenv(accountIdPropertyName)

fun terraformAwsRunnerFromEnvironment( context: Any, vararg templates: TerraformTemplate) : TerraformAWSRunner{
    val terraformTestDirPropertyName = "terraformTestDir"
    val accessKey = getTestAccessKey()
    val secretKey = getTestSecretKey()
    val region = getTestRegion()
    val terraformTestDir= System.getenv(terraformTestDirPropertyName)

    val strContext = contextAsString(context)

    if (accessKey == null) {
        throw Exception("system property $accessKeyPropertyName not specified e.g. AKIA42VZ2QKNI5LJAYWV")
    }
    if (secretKey == null) {
        throw Exception("system property $secretKeyPropertyName not specified e.g. 5wI3XljuhDCfez7+gGAEXCvTSzAlZGo6T2mFvq+s")
    }
    if (region == null) {
        throw Exception("system property $regionPropertyName not specified e.g. eu-west-2")
    }
    val runDir = if (null==terraformTestDir) {
        createTempDir("terraformTest")
    } else {
        File(terraformTestDir + "/" + strContext)
    }
    runDir.mkdirs()

    return TerraformAWSRunner(accessKey, secretKey, region, runDir, *templates)
}


