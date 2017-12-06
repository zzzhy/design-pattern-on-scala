package io.wetoo.adapter

import io.wetoo.adapter.delegate.DelegateCharge

object App extends scala.App {

  val comp = new Computer
  comp.charge(new DelegateCharge)

}