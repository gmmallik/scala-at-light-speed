package com.gauravmal.scalayt.Playground

object MBasics extends App {

  // define a value
  val meaningOfLife: Int = 42 // equivalent py code meaningOfLife = 42

  // we can also skip type mentioning most of the time
  val meaningOfLife2 = 37

  val aBoolean = false

  // a string and sting op
  val aString = "I Learn Scala"
  val aComposedString = "I" + " " + "want to learn Spark"
  val anInterpolatedString = s"What am I doing? $aString"

  // expressions are formulas /functions that can reduce to a value
  val anExp = 1 + 2

  // In scala, we think of assign values and/ from expressions usually
  // If-expression
  val ifExp = if (meaningOfLife > 43) 22 else 999 // in python if x > 43: ifExp = 22 else: ifExp = 999



  // code bolock

  val aCodeBlock = {
    val aLocalValue = 67

    // last exp needs to be a return
    aLocalValue + 3
  }

  def myFun(x: Int, y: String): String =
    y + " " + x

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

  // Println are side Effects. These functions return Unit  

}
