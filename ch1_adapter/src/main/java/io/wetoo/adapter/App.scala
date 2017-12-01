package io.wetoo.adapter

import io.wetoo.adapter.delegate.DelegateAdapter

object App extends scala.App {

  println("now we only have two hub charge")
  val c1 = new DelegateAdapter(new TwoHubCharge {})
  /**
    * 这是台只有三口插座充电器电脑
    */
  val computer = new Computer(c1)
  // 使用双口插座在充电
  computer.charge()

}