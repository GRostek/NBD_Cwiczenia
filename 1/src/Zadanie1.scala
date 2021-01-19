object Zadanie1 {
  def zad1a(daysList: Array[String]): String ={
    var daysString = "";
    for(s <- daysList){
      daysString += s + ", "
    }
    daysString.dropRight(2)
  }

  def zad1b(daysList: Array[String]): String ={
    var daysString = "";
    for(s <- daysList){
      if(s.startsWith("P")) {
        daysString += s + ", "
      }
    }
    daysString.dropRight(2)
  }

  def zad1c(daysList: Array[String]): String ={
    var daysString = ""
    var i = 0
    while(i < daysList.length){
      daysString += daysList(i) + ", "
      i+=1
    }
    daysString.dropRight(2)
  }

}
