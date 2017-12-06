package io.wetoo.factory.idcard

import io.wetoo.factory.framework
import io.wetoo.factory.framework.Factory

class IDCardFactory extends Factory{
  override protected def createProduct(owner: String): framework.Product =
    IDCardProduct(owner)

  override protected def registerProduct(p: framework.Product): Unit =
    println(s"register ${p.asInstanceOf[IDCardProduct].owner} idcard ")
}
