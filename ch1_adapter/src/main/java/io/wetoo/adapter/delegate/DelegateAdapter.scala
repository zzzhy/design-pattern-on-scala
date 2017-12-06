package io.wetoo.adapter.delegate

import io.wetoo.adapter.{ThreeHubCharge, TwoHubCharge}

/**
  * @author zzzhy
  *         2017-12-01
  */
class DelegateAdapter(c: TwoHubCharge) extends ThreeHubCharge {

  override def connectTo(): Unit = {
    c.connectTo()
  }

}
