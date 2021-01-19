object Zadanie2 {

  def zad2a(daysList: Array[String], iter: Int = 0): String ={
    if(iter == daysList.length-1){
      return daysList(iter)
    }
    daysList(iter) + ", " + zad2a(daysList, iter+1)
  }

  def zad2b(daysList: Array[String], iter: Int = 0): String ={
    if(iter == daysList.length-1){
      return daysList(daysList.length - 1 - iter)
    }
    daysList(daysList.length - 1 - iter) + ", " + zad2b(daysList, iter+1)
  }

}
