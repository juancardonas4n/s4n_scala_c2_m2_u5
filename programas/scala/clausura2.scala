
object Clausura2 {
  var mas = 10
  // val sumaMas = (x:Int) => x + mas
  val sumaMas = new Function[Int,Int] {
    def apply(x: Int) = x + mas
  }
}
