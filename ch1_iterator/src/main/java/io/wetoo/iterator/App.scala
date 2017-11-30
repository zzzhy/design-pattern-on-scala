package io.wetoo.iterator

/**
  * @author zzzhy
  *         2017-11-30
  */
object App extends scala.App{

  val shelf = new BookShelf(3)
  shelf.appendBook(Book("a book"))
  shelf.appendBook(Book("b book"))
  shelf.appendBook(Book("c book"))
//  shelf.appendBook(Book("d book"))
  val iterator = shelf.iterator()
  while(iterator.hasNext) {
    val v = iterator.next
    println(v)
  }
}
