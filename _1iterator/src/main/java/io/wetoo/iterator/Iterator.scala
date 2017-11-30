package io.wetoo.iterator

trait Iterator[A] {

  def next: A

  def hasNext: Boolean

}