package org.example

class StringCalculator {


    fun add(s: String): Int{
        if (s.isEmpty()) return 0

        var delimiter = arrayOf(",","\n")
        var numberParts = s

        if(s.startsWith("//")){
            delimiter = arrayOf(s[2].toString())
            numberParts = s.substring(4)
        }

        return numberParts.split(*delimiter).map { it.toInt() }.sum()
    }
}