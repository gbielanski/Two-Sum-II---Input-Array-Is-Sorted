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