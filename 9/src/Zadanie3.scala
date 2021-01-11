trait Maybe_3[+A] {
  def applyFunction[R](fun: A => R): Maybe_3[R]
}


case class No_3() extends Maybe_3[Nothing] {
  override def applyFunction[R](fun: Nothing => R): Maybe_3[R] = No_3()
}


case class Yes_3[A](val value: A) extends Maybe_3[A]{
  override def applyFunction[R](fun: A => R): Maybe_3[R] = Yes_3(fun(value))
}