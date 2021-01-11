object Main {

  def main(args: Array[String]): Unit = {

    println("Zadanie 1:")
    println()
    val container = new Container[Int](34)
    println("getContent: "+container.getContent)

    println("applyFunction: "+container.applyFunction[Char]((x: Int) => (x*2).toChar))


    oddzielZadania("Zadanie 2:")

    val no = new No()
    val yes = new Yes[Int](2)

    println("Czy no jest podtypem Maybe[_]?: "+no.isInstanceOf[Maybe[_]])
    println("Czy yes jest podtypem Maybe[_]?: "+yes.isInstanceOf[Maybe[_]])


    oddzielZadania("Zadanie 3:")

    val no_3 = No_3()
    val yes_3 = new Yes_3[Int](34)

    println("Dzialanie applyFunction dla No: "+no_3.applyFunction[Char]( _ => 'x'))
    println("Dzialanie applyFunction dla Yes: "+yes_3.applyFunction[Char]((x: Int) => (x*2).toChar))

    oddzielZadania("Zadanie 4:")


    val no_4 = No_4()
    val yes_4 = new Yes_4[Int](34)

    println("getOrElse('x') dla No: "+ no_4.getOrElse('x'))
    println("getOrElse(80) dla Yes z value 34: "+ yes_4.getOrElse(80))


  }


  def oddzielZadania(nr: String): Unit={
    println()
    println("==============================")
    println(nr)
    println()
  }

}
