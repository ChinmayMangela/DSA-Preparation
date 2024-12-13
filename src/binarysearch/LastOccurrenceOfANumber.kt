package binarysearch

fun lastOccurrence(numbers: Array<Int>, target: Int): Int {
    var start = 0
    var end = numbers.size - 1
    var res = -1

    while(start <= end) {
        var mid = start + (end - start) / 2
        if(target == numbers[mid]) {
            res = mid
            start = mid + 1
        } else if(target > numbers[mid]) {
            start = mid + 1
        } else {
            end = mid - 1
        }
    }
    return res
}