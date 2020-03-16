package com.typedpath.terraform2kotlin

import java.io.File
import java.io.IOException
import java.util.concurrent.TimeUnit

fun String.runCommand(workingDir: File, timeout :Long = 2, timeoutUnit: TimeUnit =TimeUnit.MINUTES): String? {
    try {
        val parts = this.split("\\s".toRegex())
        val proc = ProcessBuilder(*parts.toTypedArray())
            .directory(workingDir)
            .redirectOutput(ProcessBuilder.Redirect.PIPE)
            .redirectError(ProcessBuilder.Redirect.PIPE)
            .start()

        proc.waitFor(timeout, timeoutUnit)
        return proc.inputStream.bufferedReader().readText() + System.lineSeparator() + "errors" +  System.lineSeparator() + proc.errorStream.bufferedReader().readText()
    } catch(e: IOException) {
        e.printStackTrace()
        return null
    }
}
