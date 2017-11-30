package io.wetoo.adapter

import io.wetoo.adapter.extend.ExtendCharge

object App extends scala.App {

  val comp = new Computer
  comp.charge(new ExtendCharge)

}