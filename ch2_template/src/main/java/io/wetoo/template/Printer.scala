package io.wetoo.template

abstract class Printer {

  final def exec(): Unit = {
    open()
    printSome()
    close()
  }

  abstract def open()

  abstract def printSome()

  abstract def close()

}