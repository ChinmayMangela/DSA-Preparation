package binarysearch

// Floor of a number : Return the largest element that is <= target
fun floorOfNumber(numbers: Array<Int>, target: Int): Int {
    var start = 0
    var end = numbers.size - 1

    while(start <= end) {
        var mid = start + (end - start) / 2

        when {
            target == numbers[mid] -> return mid
            target > numbers[mid] -> start  = mid + 1
            else -> end = mid - 1
        }
    }

    return end
}