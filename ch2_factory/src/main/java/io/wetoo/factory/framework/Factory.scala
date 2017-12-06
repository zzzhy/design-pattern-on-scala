package io.wetoo.factory.framework

trait Factory {

  protected def registerProduct(p: Product): Unit

  final def create(owner: String): Product = {
    val p = createProduct(owner)
    registerProduct(p)
    p
  }

  protected def createProduct(owner: String): Product


}
