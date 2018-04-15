package search

object LinearBinarySearch {
  def linearSearch[T](items: List[T], searchElem: T): Boolean = {
    if (items.isEmpty) false
    else if (items.head == searchElem) true
    else linearSearch(items.tail, searchElem)
  }

  def binarySearch[T](items: List[T], find: T)(implicit ordering: Ordering[T]): Boolean = {
    if (items.length == 1) {
      if (items.head == find) true else false
    }

    else {
      val midPoint = dividePoint(items)
      val midElem = items.apply(midPoint)
      if (ordering.gt(find, midElem)) binarySearch(items.drop(midPoint), find)
      else if (ordering.gt(midElem, find)) binarySearch(items.take(midPoint), find)
      else true
    }
  }

  def dividePoint[T](items: List[T]): Int = {
    if (items.size % 2 == 0) items.size / 2 else items.size / 2 + 1
  }

}

