package io.wetoo.adapter.extend

import io.wetoo.adapter.Charge

class ExtendCharge extends Charge with AdapterChargeable {

  override def v220Plugin(): Unit = {
    println("connected to 220v, do some adapter")
    v12Plugin()
  }

}
