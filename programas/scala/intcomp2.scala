
// val intcomp2 = (p:Double, r:Double, t:Int, n:Int) =>
//            p * math.pow(1 + r / n, n * t)

val intcomp2 = new Function4[Double,Double,Int,Int,Double] {
  def apply(p:Double, r:Double, t:Int, n:Int):Double =
    p * math.pow(1 + r / n, n * t)
}
