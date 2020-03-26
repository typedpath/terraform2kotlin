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

    val demoVpc = aws_vpc(cidr_block = "10.0.0.0/16").apply {
        tags = mapOf(
            "Name" to "terraform-eks-demo-node",
            "kubernetes.io/cluster/$clusterName" to "shared"
        )
    }

    fun createSubnet(index: Int): aws_subnet =
        aws_subnet(vpc_id = "\${aws_vpc.demoVpc.id}", cidr_block = "10.0.${index}.0/24").apply {
            availability_zone = "\${data.aws_availability_zones.available.names[$index]}"

            tags = mapOf(
                "Name" to "terraform-eks-demo-node",
                "kubernetes.io/cluster/$clusterName" to "shared"
            )
        }

    val awsSubnet0 = createSubnet(0)
    val awsSubnet1 = createSubnet(1)

    val demoGateway = aws_internet_gateway().apply {
        vpc_id = "\${aws_vpc.demoVpc.id}"
        tags = mapOf (
            "Name" to "terraform-eks-demo"
        )
    }

    val demoRouteTable = aws_route_table(vpc_id = "\${aws_vpc.demoVpc.id}").apply {
        route = listOf(
            aws_route_table.Route().apply {
                cidr_block = "0.0.0.0/0"
                gateway_id = "\${aws_internet_gateway.demoGateway.id}"
            }
        )
    }

    fun associateRoute(index: Int) = aws_route_table_association(route_table_id = "\${aws_route_table.demoRouteTable.id}").apply{
        subnet_id      = "\${aws_subnet.awsSubnet$index.id}"
    }

    val demoRouteAssociation0 = associateRoute(0)
    val demoRouteAssociation1 = associateRoute(1)



}