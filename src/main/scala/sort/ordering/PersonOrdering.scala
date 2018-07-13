package sort.ordering

/**
  * Demonstration of usage of Ordering trait
  */
object PersonOrdering {

  object AgeOrdering extends Ordering[Person] {
    override def compare(x: Person, y: Person): Int = if (x.age > y.age) 1 else if (y.age > x.age) -1 else 0
  }

  object NameOrdering extends Ordering[Person] {
    override def compare(x: Person, y: Person): Int = if (x.name.length > y.name.length) 1 else if (y.name.length > x.name.length) -1 else 0
  }

}


