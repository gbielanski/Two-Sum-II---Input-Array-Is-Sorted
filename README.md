# Leetcode problem 167. Two Sum II - Input Array Is Sorted

This repository contains solution and test of [Leetcode problem 167. Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) written in Kotlin language

## Solution

```Kotlin
class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

        var first = 0
        var last = numbers.lastIndex

        while (first < last) {
            if (numbers[first] + numbers[last] == target) {
                return intArrayOf(first + 1, last + 1)
            }

            if (target < numbers[last] + numbers[first]) {
                last--
            } else {
                first++
            }
        }

        return intArrayOf()
    }
}
```


## Tests

```Kotlin

import org.junit.Assert.*
import org.junit.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun `when numbers are 2,7,11,15 and target is 9 should return 1,2`() {
        val numbers = intArrayOf(2, 7, 11, 15)
        val target = 9

        val result = solution.twoSum(numbers, target)

        assertArrayEquals(intArrayOf(1, 2), result)
    }

    @Test
    fun `when numbers are 2,3,4 and target is 6 should return 1,3`() {
        val numbers = intArrayOf(2, 3, 4)
        val target = 6

        val result = solution.twoSum(numbers, target)

        assertArrayEquals(intArrayOf(1, 3), result)
    }

    @Test
    fun `when numbers are -1, 0 and target is -1 should return 1,2`() {
        val numbers = intArrayOf(-1, 0)
        val target = -1

        val result = solution.twoSum(numbers, target)

        assertArrayEquals(intArrayOf(1, 2), result)
    }

    @Test
    fun `when numbers are 5, 25, 75 and target is 100 should return 2,3`() {
        val numbers = intArrayOf(5, 25, 75)
        val target = 100

        val result = solution.twoSum(numbers, target)

        assertArrayEquals(intArrayOf(2, 3), result)
    }
}

```
