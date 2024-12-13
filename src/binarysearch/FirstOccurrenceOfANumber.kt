package binarysearch

/*
Example 1:
Input: N = 7, target=13, array[] = {3,4,13,13,13,20,40}
Output: 2
Explanation: As the target value is 13 , it appears for the first time at index number 2.

Example 2:
Input: N = 7, target=60, array[] = {3,4,13,13,13,20,40}
Output: -1
Explanation: Target value 60 is not present in the array
 */

fun countFirstOccurrence(numbers: Array<Int>, target: Int): Int {
    var start = 0
    var end = numbers.size - 1
    var res = -1

    while(start <= end) {
        var mid = start + (end - start) / 2
        if(target == numbers[mid]) {
            res = mid
            end = mid - 1
        } else if(target > numbers[mid]) {
            start = mid + 1
        } else {
            end  = mid - 1
        }
    }
    return res
}