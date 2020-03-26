package com.typedpath.terraform2kotlin.eks

import com.typedpath.terraform2kotlin.`eks-getting-started`.*
import com.typedpath.terraform2kotlin.autoTag
import com.typedpath.terraform2kotlin.terraformAwsRunnerFromEnvironment
import com.typedpath.terraform2kotlin.toTerraform

import org.junit.Assert
import org.junit.Test

class EksGettingStarted_test {
@Test
fun test() {
    val clusterName = "testEksCluster"
    val vpcTemplate = EksVpcTemplate(clusterName)
    val vpcName = EksVpcTemplate::demoVpc.name
    autoTag(vpcTemplate)
    val clusterTemplate = EksClusterTemplate(clusterName, vpcName,
        listOf(vpcTemplate.awsSubnet0, vpcTemplate.awsSubnet1))
    autoTag(clusterTemplate)
    val nodesTemplate = EksWorkerNodesTemplate(clusterName)
    autoTag(nodesTemplate)
    val globalsTemplate = GlobalsTemplate()

    val outputTemplate =  OutputTemplate(clusterTemplate.demoEksCluster, clusterTemplate.demoClusterRole, clusterName)

    println(toTerraform(vpcTemplate))
    println(toTerraform(clusterTemplate))
    println(toTerraform(globalsTemplate))
    println(toTerraform(outputTemplate))

    val runner = terraformAwsRunnerFromEnvironment(this, clusterTemplate, vpcTemplate, globalsTemplate, outputTemplate)
    try {
        val outputs = runner.initApply()
        Assert.assertTrue(outputs.containsKey("roleArn"))
        println("created role: " + outputs.get("roleArn"))
        val kubeconfig = outputTemplate.kubeconfig(outputs)
        println("kubeconfig: $kubeconfig")
        Assert.assertTrue(!kubeconfig.contains("null"))
        val configMapAwsAuth = outputTemplate.configMapAwsAuth(outputs)
        println("configMapAwsAuth: $configMapAwsAuth")
        Assert.assertTrue(!configMapAwsAuth.contains("null"))
    } finally {
        runner.destroy()
    }

}

}