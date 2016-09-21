class Foo {}
object FooMaker {
     def apply() = new Foo
   }
val newFoo = FooMaker()


class Bar {
     def apply() = 0
   }
val bar = new Bar
bar()

object Timer {
  var count = 0

  def currentCount(): Long = {
    count += 1
    //print(count + ' ')
    count
  }
}

var i=0
while ( i<10) {
  print(Timer.currentCount().toString + ' ') //; print( ' ')
  i +=1
}
println()


object addOne extends Function1[Int,Int] {
  def apply(m: Int): Int = m + 1
  }
addOne(3)

class AddOne extends Function1[Int,Int] {
  def apply(m: Int): Int = m + 1
}
val addOneNew = new AddOne
addOneNew(5)

class AddOne2 extends (Int => Int) {
  def apply(m: Int): Int = m + 1
}


//#######match ########
val times = 1

times match {
  case 1 => println("one")
  case 2 => println("two")
  case _ => println("some other number")
}

times match {
  case i if i == 1 => println("one")
  case i if i == 2 => println("two")
  case _ =>           println("some other number")
}