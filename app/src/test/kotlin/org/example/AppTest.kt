package org.example

import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {

    @Test 
    fun testReplaceDiagonalWithPositiveColumnSums() {
        val matrix = mutableListOf(
            mutableListOf(1, 2, 0),
            mutableListOf(3, -3, 5),
            mutableListOf(6, 7, 8),
        )

        replaceDiagonalWithPositiveColumnSums(matrix)

        val expected = mutableListOf(
            mutableListOf(10, 2, 0),
            mutableListOf(3, -3, 5),
            mutableListOf(6, 7, 13),
        )

        assertEquals(expected, matrix)
    }
    
}
