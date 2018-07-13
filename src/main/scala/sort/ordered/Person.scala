package sort.ordered

/**
  * Demonstration of usage of Ordered trait
  */
case class Person(name: String, gender: String, age: Int) extends Ordered[Person] {
  override def compare(that: Person): Int = if (name.length > that.name.length) 1 else if (name.length < that.name.length) -1 else 0
}



