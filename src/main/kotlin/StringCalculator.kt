package org.example

class StringCalculator {


    fun add(s: String): Int{
        if (s.isEmpty()) return 0

        val (delimiter, numbersPart) = extractDelimiter(s)

        val values = numbersPart
            .split(*delimiter)
            .map { it.toInt() }

        val negatives = values.filter { it < 0 }

        if (negatives.isNotEmpty()) {
            throw IllegalArgumentException(
                "negative numbers not allowed: ${negatives.joinToString(", ")}"
            )
        }

        return values.sum()
    }

    private fun extractDelimiter(numbers: String): Pair<Array<String>, String> {
        return if (numbers.startsWith("//")) {
            Pair(arrayOf(numbers[2].toString()), numbers.substring(4))
        } else {
            Pair(arrayOf(",", "\n"), numbers)
        }
    }
}