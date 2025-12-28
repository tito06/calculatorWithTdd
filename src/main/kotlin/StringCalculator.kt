package org.example

class StringCalculator {


    fun add(s: String): Int{
        if (s.isEmpty()) return 0

        val (delimiter, numbersPart) = extractDelimiter(s)


        return numbersPart.split(*delimiter).map { it.toInt() }.sum()
    }

    private fun extractDelimiter(numbers: String): Pair<Array<String>, String> {
        return if (numbers.startsWith("//")) {
            Pair(arrayOf(numbers[2].toString()), numbers.substring(4))
        } else {
            Pair(arrayOf(",", "\n"), numbers)
        }
    }
}