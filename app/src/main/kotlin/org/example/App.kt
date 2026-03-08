
package org.example

fun main() {

    val matrix = listOf<MutableList<Int>>(
        mutableListOf(1, 2, 0),
        mutableListOf(3, -3, 5),
        mutableListOf(6, 7, 8),
    )

    matrixOutput(matrix)
    replaceDiagonalWithPositiveColumnSums(matrix)
    matrixOutput(matrix)
}

fun replaceDiagonalWithPositiveColumnSums(matrix: List<MutableList<Int>>) {

    val matrixSize = matrix.size
    for (columnIndex in 0 until matrixSize) {
        var sumOfColumnElements = 0
        for (rowIndex in 0 until matrixSize) {
            val columnElement = matrix[rowIndex][columnIndex]
            if (columnElement < 0) {
                sumOfColumnElements = 0
                break
            }

            sumOfColumnElements += columnElement
        }

        if (sumOfColumnElements > 0) {
            matrix[columnIndex][columnIndex] = sumOfColumnElements
        }

    }
}

fun matrixOutput(matrix: List<List<Int>>) {

    println("Matrix output:")
    matrix.forEach { row ->
        println(row)
    }

    println()
}
