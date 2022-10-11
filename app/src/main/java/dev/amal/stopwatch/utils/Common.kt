package dev.amal.stopwatch.utils

fun formatTime(
    seconds: String, minutes: String, hours: String
): String = "$hours:$minutes:$seconds"

fun Int.pad(): String = this.toString().padStart(2, '0')