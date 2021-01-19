object Zadanie10 {

  def zad10(numbersList: Array[Int]): Array[Int] = {
    numbersList.filter(x => (x >= -5 && x <= 12)) map (_.abs)
  }

}
