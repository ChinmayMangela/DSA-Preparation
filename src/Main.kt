import binarysearch.*
import java.util.Arrays

fun main() {
    val numbers: Array<Int> = arrayOf(29,52,84,85,85,85,86,96,99)
//    println(binarySearch(numbers,5))
//    println(ceiling(numbers, 12))
//    println(floorOfNumber(numbers, 81))
//    println(countFirstOccurrence(numbers,53))
    println(countFirstAndLastPos(numbers, 85).contentToString())
}