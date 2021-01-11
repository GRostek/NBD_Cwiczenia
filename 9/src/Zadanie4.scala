trait Maybe_4[+A] {
  def applyFunction[R](fun: A => R): Maybe_4[R]

  def getOrElse[R >: A](funValue: R): R
}


case class No_4() extends Maybe_4[Nothing] {
  override def applyFunction[R](fun: Nothing => R): Maybe_4[R] = No_4()

  override def getOrElse[R >: Nothing](funValue: R): R = funValue
}


case class Yes_4[A](val value: A) extends Maybe_4[A]{
  override def applyFunction[R](fun: A => R): Maybe_4[R] = Yes_4(fun(value))

  override def getOrElse[R >: A](funValue: R): R = value
}