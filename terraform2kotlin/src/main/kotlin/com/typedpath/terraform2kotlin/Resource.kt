package com.typedpath.terraform2kotlin
abstract class Resource {
    abstract fun typestring() : String
    //TODO can this be restricted to Resource

    var depends_on: List<Resource>? = null

}