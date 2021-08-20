
object Clausura {
  val mas = 10
  // val sumaMas = (x:Int) => x + mas
  val sumaMas = new Function[Int,Int] {
    def apply(x: Int) = x + mas
  }
}
