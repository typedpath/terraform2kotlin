package com.typedpath.terraform2kotlin

import java.io.IOException
import java.net.URL

const val findMyIpUrl : String = "http://ipv4.icanhazip.com"

fun waitForConnectionRead(strUrl: String, timeoutSeconds: Int): String? {
    val endTime = System.currentTimeMillis() + (1000 * timeoutSeconds)
    val url = URL(strUrl)
    while (System.currentTimeMillis() < endTime) {
        val response = readURL(url)
        if (response != null) {
            return response
        }
        Thread.sleep(1000)
    }
    return null
}

private fun readURL(url: URL): String? {
    return try {
        url.readText()
    } catch (exception: IOException) {
        null
    }
}

fun getMyExternalIp() : String {
    val externalIp = waitForConnectionRead(findMyIpUrl, 10)
    if (externalIp == null) {
        throw Exception("cant read external ip from " + findMyIpUrl)
    }
    return externalIp.trim()
}
