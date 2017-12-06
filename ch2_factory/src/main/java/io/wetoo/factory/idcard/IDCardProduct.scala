package io.wetoo.factory.idcard

import io.wetoo.factory.framework.Product

case class IDCardProduct(owner: String) extends Product {
  override def use(): Unit = println(s"use $owner card")
}
