package io.wetoo.template

object App extends scala.App {

  val charPrinter = new CharPrinter(Array('c','h','a','r'))
  val stringPrinter = new StringPrinter("string")

  charPrinter.exec()
  stringPrinter.exec()

}
