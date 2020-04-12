package com.typedpath.terraform2kotlin.eks

import com.typedpath.terraform2kotlin.`eks-getting-started`.*
import com.typedpath.terraform2kotlin.autoTag
import com.typedpath.terraform2kotlin.terraformAwsRunnerFromEnvironment
import com.typedpath.terraform2kotlin.toTerraform

import org.junit.Assert
import org.junit.Test
import java.io.File

class EksGettingStarted_test {
@Test
fun test() {
    val clusterName = "testEksCluster"
    val vpcTemplate = EksVpcTemplate(clusterName)
    autoTag(vpcTemplate)
    val subnets = listOf(vpcTemplate.awsSubnet0, vpcTemplate.awsSubnet1)
    val clusterTemplate = EksClusterTemplate(clusterName, vpcTemplate.demoVpc, subnets )
    autoTag(clusterTemplate)
    val nodesTemplate = EksWorkerNodesTemplate(clusterTemplate.demoEksCluster, subnets)
    autoTag(nodesTemplate)

    val outputTemplate =  OutputTemplate(clusterTemplate.demoEksCluster, clusterTemplate.demoClusterRole, clusterName)

    println(toTerraform(vpcTemplate))
    println(toTerraform(clusterTemplate))
    println(toTerraform(nodesTemplate))
    println(toTerraform(outputTemplate))

    val runner = terraformAwsRunnerFromEnvironment(this, vpcTemplate, clusterTemplate, nodesTemplate, outputTemplate)
    try {
        println("executing in " + runner.runDir)
        val outputs = runner.initApply()
        println("executed in " + runner.runDir)

        Assert.assertTrue(outputs.containsKey("roleArn"))
        println("created role: " + outputs.get("roleArn"))

        val kubeconfig = outputTemplate.kubeconfig(outputs)
        println("writing kubeconfig to ${runner.runDir}/kubeconfig.txt")
        File(runner.runDir, "kubeconfig.txt").writeText(kubeconfig)
        Assert.assertTrue(!kubeconfig.contains("null"))

        val configMapAwsAuth = outputTemplate.configMapAwsAuth(outputs)
        println("writing configMapAwsAuth to ${runner.runDir}/configMapAwsAuth.txt")
        File(runner.runDir, "configMapAwsAuth.txt").writeText(configMapAwsAuth)
        Assert.assertTrue(!configMapAwsAuth.contains("null"))

    } finally {
        println("destroying")
        println(runner.destroy())
    }

}

}