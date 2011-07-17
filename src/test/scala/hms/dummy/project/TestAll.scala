package hms.dummy.project

import org.scalacheck.Properties


object TestAll {
  object ScalaCheckSpecification extends Properties("DummyPorject") {
    include(DummySpecification)
  }

  def main(args: Array[String]) = ScalaCheckSpecification.main(args)
}