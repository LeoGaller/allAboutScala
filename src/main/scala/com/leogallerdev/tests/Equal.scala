package com.leogallerdev.tests

/*
A trait encapsulates method and field definitions, which can then be reused by mixing them into classes.
Unlike class inheritance, in which each class must inherit from just one superclass, a class can mix in any number of traits.

Traits are used to define object types by specifying the signature of the supported methods. Scala also allows traits to
be partially implemented but traits may not have constructor parameters.

Similar a interfaces em Java, traits são utilizadas para definir tipos de objetos apenas especificando as assinaturas
dos métodos suportados.
 */

trait Similaridade {
  def eSemelhante(x: Any): Boolean
  def naoESemelhante(x: Any): Boolean = !eSemelhante(x)
}

class Point(xc: Int, yc: Int) extends Similaridade {
  var x: Int = xc
  var y: Int = yc
  def eSemelhante(obj: Any) =
    obj.isInstanceOf[Point] &&
      obj.asInstanceOf[Point].x == x
}
object TraitsTest extends App {
  val p1 = new Point(2, 3)
  val p2 = new Point(2, 4)
  val p3 = new Point(3, 3)
  val p4 = new Point(2, 3)
  println(p1.eSemelhante(p2))
  println(p1.eSemelhante(p3))
  // Ponto.naoESemelhante foi definido na classe Similaridade
  println(p1.naoESemelhante(2))
  println(p1.naoESemelhante(p4))
}