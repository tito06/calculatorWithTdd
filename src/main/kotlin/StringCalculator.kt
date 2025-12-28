package org.example

class StringCalculator {


    fun add(s: String): Int{
        if (s.isEmpty()) return 0

        return s.split(",").map { it.toInt() }.sum()
    }
}