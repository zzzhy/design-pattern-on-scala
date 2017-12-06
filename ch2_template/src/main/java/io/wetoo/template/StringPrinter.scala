package io.wetoo.template

class StringPrinter(some: String) extends Printer {

  override def open(): Unit = println("--------------")

  override def printSome(): Unit = println(some)

  override def close(): Unit = println("--------------")
}
