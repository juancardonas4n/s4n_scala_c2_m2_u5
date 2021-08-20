
def xor(a:Boolean, b:Boolean) = (a,b) match {
  case (false,false) => false
  case (false,true)  => true
  case (true,false)  => true
  case _             => false
}
