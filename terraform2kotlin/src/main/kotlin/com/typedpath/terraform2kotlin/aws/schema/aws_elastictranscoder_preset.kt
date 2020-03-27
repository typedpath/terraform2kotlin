package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_elastictranscoder_preset(val container : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var thumbnails: List<Thumbnails>? = null
  var video_codec_options: Map<String, String>? = null
  var audio: List<Audio>? = null
  var audio_codec_options: List<Audio_codec_options>? = null
  var description: String? = null
  var video: List<Video>? = null
  var video_watermarks: List<Video_watermarks>? = null
  var type: String? = null
 


class Audio_codec_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var bit_order: String? = null
  var profile: String? = null
  var signed: String? = null
  var bit_depth: String? = null
 

}

class Video() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var bit_rate: String? = null
  var keyframes_max_dist: String? = null
  var max_frame_rate: String? = null
  var max_width: String? = null
  var resolution: String? = null
  var sizing_policy: String? = null
  var aspect_ratio: String? = null
  var codec: String? = null
  var display_aspect_ratio: String? = null
  var fixed_gop: String? = null
  var frame_rate: String? = null
  var max_height: String? = null
  var padding_policy: String? = null
 

}

class Video_watermarks() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var max_height: String? = null
  var sizing_policy: String? = null
  var target: String? = null
  var horizontal_align: String? = null
  var horizontal_offset: String? = null
  var id: String? = null
  var vertical_offset: String? = null
  var max_width: String? = null
  var opacity: String? = null
  var vertical_align: String? = null
 

}

class Thumbnails() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var interval: String? = null
  var max_height: String? = null
  var max_width: String? = null
  var padding_policy: String? = null
  var resolution: String? = null
  var sizing_policy: String? = null
  var aspect_ratio: String? = null
  var format: String? = null
 

}

class Audio() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var codec: String? = null
  var sample_rate: String? = null
  var audio_packing_mode: String? = null
  var bit_rate: String? = null
  var channels: String? = null
 

}
}
