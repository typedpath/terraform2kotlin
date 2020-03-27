package com.typedpath.terraform2kotlin.`eks-getting-started`

import com.typedpath.terraform2kotlin.TerraformTemplate
import com.typedpath.terraform2kotlin.aws.schema.*


/* VPC Resources
  * VPC
  * Subnets
  * Internet Gateway
  * Route Table
*/

class EksVpcTemplate(val clusterName: String) : TerraformTemplate() {

    val availabilityZones = aws_availability_zones()

    val demoVpc = aws_vpc(cidr_block = "10.0.0.0/16").apply {
        tags = mapOf(
            "Name" to "terraform-eks-demo-node",
            "kubernetes.io/cluster/$clusterName" to "shared"
        )
    }

    fun createSubnet(index: Int): aws_subnet =
        aws_subnet(vpc_id = demoVpc.idRef(), cidr_block = "10.0.${index}.0/24").apply {
            //TODO make refs to arrays typesafe
            availability_zone = availabilityZones.namesRef("[$index]")

            tags = mapOf(
                "Name" to "terraform-eks-demo-node",
                "kubernetes.io/cluster/$clusterName" to "shared"
            )
        }

    val awsSubnet0 = createSubnet(0)
    val awsSubnet1 = createSubnet(1)

    val demoGateway = aws_internet_gateway().apply {
        vpc_id = demoVpc.idRef()
        tags = mapOf(
            "Name" to "terraform-eks-demo"
        )
    }

    val demoRouteTable = aws_route_table(vpc_id = demoVpc.idRef()).apply {
        route = listOf(
            aws_route_table.Route().apply {
                cidr_block = "0.0.0.0/0"
                gateway_id = "\${aws_internet_gateway.demoGateway.id}"
            }
        )
    }

    val demoRouteAssociation0 = aws_route_table_association(route_table_id = demoRouteTable.idRef()).apply {
        subnet_id = awsSubnet0.idRef()
    }

    val demoRouteAssociation1 = aws_route_table_association(route_table_id = demoRouteTable.idRef()).apply {
        subnet_id = awsSubnet1.idRef()
    }

}