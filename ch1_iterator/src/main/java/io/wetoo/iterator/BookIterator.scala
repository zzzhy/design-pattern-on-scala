package io.wetoo.iterator

/**
  * @author zzzhy
  *         2017-11-30
  */
class BookIterator(shelf: BookShelf) extends Iterator[Book] {

  private var index = 0
  private val length = shelf.getLength

  override def next: Book = {
    val book = shelf.getBookAt(index)
    index += 1
    book
  }

  override def hasNext: Boolean = if(index <= length - 1) true else false

}
