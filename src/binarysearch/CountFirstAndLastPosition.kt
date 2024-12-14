package binarysearch

fun countFirstAndLastPosition(numbers: Array<Int>, target: Int): Array<Int> {
    val firstOccurrence = countFirstOccurrence(numbers, target)
    val lastOccurrence = lastOccurrence(numbers, target)
    return arrayOf(firstOccurrence, lastOccurrence)
}

fun anotherApproach(numbers: Array<Int>, target: Int, isSearchFirst: Boolean): Int {
    var start = 0
    var end = numbers.size - 1
    var res = -1

    while(start <= end) {
        var mid = start + (end - start) / 2
        if(target > numbers[mid]) {
            start = mid + 1
        } else if(target < numbers[mid]) {
            end = mid - 1
        } else {
            res = mid
            if(isSearchFirst) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
    }
    return res
}

fun countFirstAndLastPos(numbers: Array<Int>, target: Int): Array<Int> {
    val firstPos = anotherApproach(numbers, target, true)

    if(firstPos != -1) {
        val lastPos = anotherApproach(numbers, target, false)
        return arrayOf(firstPos, lastPos)
    }
    return arrayOf(-1, -1)
}