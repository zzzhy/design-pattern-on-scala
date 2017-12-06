package io.wetoo.adapter.delegate

import io.wetoo.adapter.{AdapterChargeable, Charge}

class DelegateCharge extends Charge with AdapterChargeable {

  override def v220Plugin(): Unit = {
    println("connected to 220v, do some adapter")
    v12Plugin()
  }

}
