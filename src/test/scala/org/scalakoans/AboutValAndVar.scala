package org.scalakoans

import support.KoanSuite

class AboutValAndVar extends KoanSuite {

  koan("basic assignment") {
    val a: Int = 5

    a should equal(5)
  }

  koan("type inference makes type declaration unecessary") {
    val blah = 5

    blah should be(5)
  }

  koan("assignment with var may be reassigned") {
    var a = 5
    a should be (5)

    a = 7
    a should be(7)
  }

  koan("assignment with val may not be reassigned") {
    val a = 5
    a should be (5)

    // What happens if you uncomment these lines?
     a should be (5)
  }

}
