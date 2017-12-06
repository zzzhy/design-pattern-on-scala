package io.wetoo.template

class CharPrinter(some: Array[Char]) extends Printer {

  override def open(): Unit = print("<<<")

  override def printSome(): Unit = print(some)

  override def close(): Unit = print(">>>")
}
