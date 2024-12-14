package binarysearch

fun findPivot(numbers: Array<Int>): Int {
  // Pivot - Largest element of an array
  var start = 0
  var end = numbers.size - 1

  while(start <= end) {
    var mid = start + (end - start) / 2
    if(numbers[mid] > numbers[mid + 1] && mid < end) {
      return mid
    }

    if(numbers[mid] < numbers[mid - 1] && mid > start) {
      return mid - 1
    }

    if(numbers[start] < numbers[mid]) {
      start = mid
    } else {
      end = mid - 1
    }
  }

  return -1
}