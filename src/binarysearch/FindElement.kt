package binarysearch

fun binarySearch(numbers: Array<Int>, target: Int): Int {
    var start: Int = 0
    var end: Int = numbers.size - 1

    while(start <= end) {
        var mid: Int = start + (end - start) / 2

        when {
            target == numbers[mid]  -> return mid
            target > numbers[mid] -> start = mid + 1
            else -> end = mid - 1
        }
    }

    return -1
}