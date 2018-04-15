package search

import org.scalatest.FunSuite


class LinearBinarySearchTest extends FunSuite {
  test("linear search test") {
    val numbers = List(1, 2, 3, 4, 5, 6)
    assert(LinearBinarySearch.binarySearch(numbers, 23))
  }

  test("binary search test") {
    val numbers = List(1, 2, 3, 4, 5, 6)
    assert(LinearBinarySearch.binarySearch(numbers, 23))
  }
}




