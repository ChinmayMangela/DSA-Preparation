package binarysearch

// Ceiling of Number : Return the smallest element that is >= target

fun ceiling(numbers: Array<Int>, target: Int): Int {
    var start = 0
    var end = numbers.size - 1

    // return -1 if target element is greater than the greatest number in array
    if(target > numbers[numbers.size - 1]) {
        return -1;
    }

    while(start <= end) {
        var mid = start + (end - start) / 2

        when {
            target == numbers[mid] -> return mid
            target > numbers[mid] -> start = mid + 1
            else -> end = mid - 1
        }
    }

    return start
}