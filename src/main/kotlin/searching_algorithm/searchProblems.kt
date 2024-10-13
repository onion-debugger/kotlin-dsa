package searching_algorithm

/**
 * Problem Set
 */
// Write a function named `findZeroPosition` that takes in a
// sorted array of distinct integers as input.
// The function should return the index where the value 0 is
// found in the array, or the index where it would be inserted if
// it were not found.

// If the value 0 is found in the array, the function should
// return the index of the value 0. If the value 0 is not found,
// the function should return the index where it would be inserted
// while maintaining the sorted order of the array.

// Example:
// Input: nums = [-7, -5, -3, 0, 2]
// Output: 3

// Example:
// Input: nums = [3, 5, 7, 9, 11]
// Output: 0

// Brute force solution
fun IntArray.findZeroPosition(): Int {
    val zero = 0
    var result = 0
    var countIndexLessThanZero = 0

    for (i in this.indices) {
        if (this[i] == zero ) {
            result = i
        }

        if (this[i] < zero) {
            countIndexLessThanZero++
            result = countIndexLessThanZero
        } else {
            return result
        }
    }

    return result
}


/**
 * Using Binary Search to solve the Find Zero Position
 */
fun IntArray.binarySearchFindZeroPosition(): Int {
    var start = 0
    var end = this.size
    val target = 0

    while (start != end) {
        val middle = (start + end) / 2
        val middleValue = this[middle]

        if (middleValue > target) {
            end = middle
        } else if (middleValue == target) {
            return middle
        } else {
            start = middle + 1
        }
    }

    return start
}

// Implement a function `findRange` that takes in an array of
// integers sorted in ascending order. The function should
// return an array containing the starting and ending
// positions of the number 3 within the array. If the number 3
// is not found, return [-1, -1].

// Example:
// Input: nums = [1, 2, 3, 3, 3, 3, 3, 4, 5]
// Output: [2, 6]

// Example:
// Input: nums = [1, 2, 5, 5, 6, 9, 10]
// Output: [-1, -1]
fun IntArray.findRangeBruteForce(
    target: Int = 3
): IntArray {

    var targetOccurrence = -1
    var firstIndex = -1

    var i = 0
    while (i < this.size - 1) {
        if (this[i] == target) {
            targetOccurrence++
        }
        i++
    }
    println(targetOccurrence)

    return intArrayOf(firstIndex, targetOccurrence)
}