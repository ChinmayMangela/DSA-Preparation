package binarysearch


/*
 Binary Search Algorithm - by Chinmay Mangela
 In binary search, we are given a sorted array and a target element. We need to check whether
  the target element exists in the array or not. If it exists, we return the index of that element
  otherwise, we return -1.
  Steps:
   1. Initialize the start and end indices:
    start = 0
    end = length of the array - 1
   2. Use a loop with the condition (start <= end) to repeatedly divide the search space:
      Calculate the mid index: mid = (start + end) / 2
      Check the following conditions:
      a. If the element at mid is equal to the target, return the index mid.
      b. If the element at mid is less than the target, update start to mid + 1.
      c. If the element at mid is greater than the target, update end to mid - 1.

  Benefits:
  -The search space is divided in half with each iteration, making the algorithm efficient.

  EXAMPLE -

fun binarySearch(numbers: Array<Int>, target: Int): Int {
    var start = 0
    var end = numbers.size - 1 while (start <= end) {
        val mid = (start + end) / 2
        when {
            numbers[mid] == target -> return mid
            numbers [mid] < target -> start = mid + 1
            else -> end = mid - 1
        }
    } return -1
}

 */