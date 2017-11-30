package io.wetoo.iterator

/**
  * @author zzzhy
  *         2017-11-30
  */
class BookShelf(maxCapacity: Int) extends Aggregate[Book] {


  private val books = Array.ofDim[Book](maxCapacity)
  private var index = 0

  def getLength: Int = index

  def getBookAt(index: Int): Book = books(index)

  def appendBook(book: Book): Unit = {
    if(index == maxCapacity) {
      throw new RuntimeException("book shelf is full")
    }
    books(index) = book
    index += 1
  }

  override def iterator() = new BookIterator(this)
}
