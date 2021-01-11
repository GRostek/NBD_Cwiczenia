trait Maybe[A] {}


class No extends Maybe[Nothing] {}

class Yes[A](val value: A) extends Maybe[A]