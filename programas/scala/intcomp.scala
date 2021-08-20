
def intcomp(p:Double, r:Double, t:Int, n:Int):Double =
  p * math.pow(1 + r / n, n * t)

