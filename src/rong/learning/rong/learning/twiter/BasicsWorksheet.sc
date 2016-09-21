def mul(m: Int,n: Int): Int = m * n

def adder(m: Int, n: Int) = m + n

def addOne(m: Int): Int = m + 1

val add2 = adder(2, _:Int)

add2(4)

def multiply(m: Int)(n: Int): Int = m * n

multiply(2)(3)

val timesTwo = multiply(2)_

timesTwo(9)

def divider(m: Float, n: Float): Float =  m / n

val t1 = (divider _).curried

 //t1(3f) _


class Calculator(brand:String) {

  /**
    * A constructor.
    */
  val color: String = if (brand == "TI") {
    "blue"
  } else if (brand == "HP") {
    "black"
  } else {
    "white"
  }

    //val brand: String = "HP"
     def add(m: Int, n: Int): Int = m + n
   }

val calc = new Calculator("HP")

calc add(2,3)

calc color

class C {
     var acc = 0
     def minc = { acc+=1
       acc}
     val finc = { () => acc += _ }
   }

val c= new C

c minc

c finc

