import scala.annotation.tailrec

object Zadanie3 {

  def zad3(daysList: Array[String]): String ={
    @tailrec
    def rec(result: String, recIter: Int, daysList: Array[String]): String= {
      if(recIter == daysList.length-1) result + ", " + daysList(recIter)
      else rec(result + ", " + daysList(recIter), recIter+1, daysList)
    }
    rec("",0, daysList).drop(2)
  }
}
