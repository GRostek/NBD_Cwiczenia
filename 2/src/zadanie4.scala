object zadanie4 {

  def dzialanie(wartosc: Int, funkcja: Int => Int): Int={
    funkcja(funkcja(funkcja(wartosc)))
  }
}
