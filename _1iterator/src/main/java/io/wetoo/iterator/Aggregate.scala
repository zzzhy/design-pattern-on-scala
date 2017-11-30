package io.wetoo.iterator

/**
  * @author zzzhy
  *         2017-11-30
  */
trait Aggregate[A] {

  def iterator(): Iterator[A]

}
