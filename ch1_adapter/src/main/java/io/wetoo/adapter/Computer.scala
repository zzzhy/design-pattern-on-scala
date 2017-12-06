package io.wetoo.adapter

/**
  * @author zzzhy
  *         2017-12-01
  */

class Computer(c: ThreeHubCharge) {

  def charge(): Unit = {
    c.connectTo()
  }

}
