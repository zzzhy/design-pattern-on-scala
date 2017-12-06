package io.wetoo.factory

import io.wetoo.factory.framework.Factory
import io.wetoo.factory.idcard.IDCardFactory

object App extends scala.App {

  val f: Factory = new IDCardFactory()
  f.create("Tom")

}
