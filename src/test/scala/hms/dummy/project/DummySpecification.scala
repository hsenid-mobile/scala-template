package hms.dummy.project

import org.scalacheck._
import Gen._
import Prop._
import Test._
import Arbitrary._
import collection.mutable.ListBuffer

object DummySpecification extends Properties("Dummy") {

  property("dummy") = forAll {
    (l1: List[Int], l2: List[Int]) =>
      l1.size + l2.size == (l1 ::: l2).size
  }
}

