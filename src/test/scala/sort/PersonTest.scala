package sort

import org.scalatest.FunSuite
import sort.ordering.Person
import sort.ordering.PersonOrdering._

import scala.util.Sorting

class PersonTest extends FunSuite {
  val pairs = Array(("a", 5, 2), ("c", 3, 1), ("b", 1, 3))
  val peopleList = List(sort.ordered.Person("John Sr", "Male", 27), sort.ordered.Person("Harry", "Male", 29), sort.ordered.Person("Stacy Wilson", "Male", 21))
  val people = Array(Person("John Sr", "Male", 27), Person("Harry", "Male", 29), Person("Stacy Wilson", "Male", 21))
  val numbers = Array(136, 4, 235, 25, 3)


  test("Person sort test") {
    Sorting.quickSort(pairs)(Ordering[(Int, String)].on(x => (x._3, x._1)))
    Sorting.quickSort(numbers)

    Sorting.quickSort(people)(AgeOrdering)
    println(people.toList)

    Sorting.quickSort(people)(NameOrdering.reverse)
    println(people.toList)

    println(pairs.toList)
    println(numbers.toList)

    val sortledList1 = peopleList.sortWith(_ < _).reverse
    println(sortledList1)
  }
}
