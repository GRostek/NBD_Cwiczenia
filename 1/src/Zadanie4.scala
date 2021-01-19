object Zadanie4 {

  def zad4a(daysList: Array[String]): String={
    daysList.foldLeft("")(_ + _ +", ").dropRight(2)
  }

  def zad4b(daysList: Array[String]): String={
    daysList.foldRight("")(_ + ", " + _).dropRight(2)
  }

  def zad4c(daysList: Array[String]): String={
    var result : String = daysList.foldLeft(""){ case (a,b) =>
      if(b.startsWith("P")){
        a + ", " + b
      }
      else a
    }
    result.drop(2)
  }
}
