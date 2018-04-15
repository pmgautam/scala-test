package search

object Launch {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6)
    assert(LinearBinarySearch.binarySearch(numbers, 4))
  }
}
