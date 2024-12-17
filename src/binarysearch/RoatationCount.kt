package binarysearch

// //https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
fun countRotation(array: Array<Int>): Int {
    val answer = findPivot(array)
    return if (answer != -1) answer + 1 else -1
}