package com.typedpath.terraform2kotlin.aws.schema

class aws_gamelift_game_session_queue(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var timeout_in_seconds: Int? = null
  var tags: Map<String, String>? = null
  var destinations: List<String>? = null
  var player_latency_policy: List<Player_latency_policy>? = null
 


class Player_latency_policy(val maximum_individual_player_latency_milliseconds : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var policy_duration_seconds: Int? = null
 

}
}
