package searching_algorithm


/**
 * Linear search Algorithm
 * The time complexity is O(N)
 */
fun List<Int>.linearSearch(
    lookingFor: Int,
): Boolean {

    for (value in this) {
        if (value == lookingFor) {
            return true
        }
    }

    return false
}


fun List<Int>.binarySearch(
    target: Int
): Boolean {
    var lowIdx = 0
    var highIdx = this.size - 1

    while (lowIdx != highIdx) {
        val midIdx = (lowIdx + highIdx) / 2
        val value = this[midIdx]


        when {
            value == target -> return true
            target > value -> lowIdx = midIdx + 1
            else -> highIdx = midIdx
        }
    }

    return false
}

fun main() {
    val list = listOf(1, 3, 5, 7, 9, 13, 17)
    println(
        list.binarySearch(9)
    )
    println(
        list.linearSearch(5)
    )
    println(
        list.linearSearch(20)
    )
    println(
        list.binarySearch(20)
    )

    // Finding Zero Position
    println()
    println(
        intArrayOf(-7, -5, -3, 0, 2)
            .binarySearchFindZeroPosition()
    )
    println(
        intArrayOf(-5, -3, 1, 2, 3)
            .binarySearchFindZeroPosition()
    )
    println(
        intArrayOf(3, 5, 7, 9, 11)
            .findZeroPosition()
    )
    println(
        intArrayOf(-8, -7, -5, -2, -1)
            .binarySearchFindZeroPosition()
    )

    // Find the range of three
    println()
    println()

    println(
        intArrayOf(1, 2, 3, 3, 3, 3, 3, 4, 5)
            .findRangeBruteForce()
            .contentToString()
    )
}