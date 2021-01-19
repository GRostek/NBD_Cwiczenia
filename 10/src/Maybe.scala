trait Maybe[+A] {
  def applyFunction[R](fun: A => R): Maybe[R]

  def getOrElse[R >: A](funValue: R): R

  def map[R](fun: A=>R): Maybe[R]

  def flatMap[R](fun: A=>Maybe[R]): Maybe[R]

}


case class No() extends Maybe[Nothing] {
  override def applyFunction[R](fun: Nothing => R): Maybe[R] = No()

  override def getOrElse[R >: Nothing](funValue: R): R = funValue

  override def map[R](fun: Nothing => R): Maybe[R] = No()

  override def flatMap[R](fun: Nothing => Maybe[R]): Maybe[R] = No()
}


case class Yes[A](val value: A) extends Maybe[A]{
  override def applyFunction[R](fun: A => R): Maybe[R] = Yes(fun(value))

  override def getOrElse[R >: A](funValue: R): R = value

  override def map[R](fun: A => R): Maybe[R] = Yes(fun(value))

  override def flatMap[R](fun: A => Maybe[R]): Maybe[R] = fun(value)
}