object Zadanie7 {

  def zad7(mapa: Map[String, String], szukane: Array[String]): Unit={
    println("Mapa")
    println(mapa)
    for(s <- szukane){
      println("Szukane: "+s)
      println(mapa.getOrElse(s,"Takiego klucza nie ma w mapie")) //getOrElse używa Option
    }
  }
}
