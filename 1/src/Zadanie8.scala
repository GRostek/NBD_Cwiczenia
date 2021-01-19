object Zadanie8 {

  def zad8(list: Array[Int]): Array[Int]={
    val outList: Array[Int] = Array()
    zad8rec(list, outList)
  }

  def zad8rec(inList: Array[Int], outList: Array[Int], iter: Int=0): Array[Int] ={
    if(iter == inList.length-1){
      inList(iter) match {
        case 0 => return outList
        case _ => return outList :+ inList(iter)
      }
    }
    if(inList(iter) != 0){
      zad8rec(inList,outList :+ inList(iter), iter+1)
    } else {
      zad8rec(inList,outList, iter+1)
    }
  }
}
