object Main {

  def main(args: Array[String]): Unit = {

    println("Zadanie 1:")

    def numGenerator = for {
        a <- Iterator.from(1)
        b <- 1 until a+1 if a%b == 0
    } yield (a,b)

    println("take: ")

    numGenerator take 20 foreach println

    println()
    println("next: ")
    println()

    val buffered = numGenerator.buffered

    for ( i <- 1 to 20){
      println(buffered.next())
    }

    oddzielZadania("Zadanie 2:")



    val no = No()
    val yes = Yes(List(1,2,3))
    println(no.map(mapFun))
    //println(no.flatMap(flatMapFun()))
    println(yes.map(flatMapFun))
    println(yes.flatMap(flatMapFun))



  }

  def mapFun(value: List[Int]): List[Int] = value.map(f => f+10)
  def flatMapFun(value: List[Int]): Maybe[List[Int]] = Yes(value.map(f => f+10))



  def oddzielZadania(nr: String): Unit={
    println()
    println("==============================")
    println(nr)
    println()
  }

}
