
object Closure(more:Int) {
  val addMore = new Function[Int,Int] {
    def apply(x: Int) = x + more
  }
}
