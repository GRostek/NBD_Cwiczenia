
object Cwiczenia1 {
  def main(args: Array[String]) {
    println("================================")
    println("Zadanie 1:")
    val days = Array("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
    println("a):")
    var result = Zadanie1.zad1a(days)
    println(result)

    println("b):")
    result = Zadanie1.zad1b(days)
    println(result)

    println("c):")
    result = Zadanie1.zad1c(days)
    println(result)

    println()
    println("================================")
    println("Zadanie 2:")
    println("a):")
    result = Zadanie2.zad2a(days)
    println(result)

    println("b):")
    result = Zadanie2.zad2b(days)
    println(result)

    println("================================")
    println("Zadanie 3:")
    result = Zadanie3.zad3(days)
    println(result)

    println("================================")
    println("Zadanie 4:")
    println("a):")
    result = Zadanie4.zad4a(days)
    println(result)

    println("b):")
    result = Zadanie4.zad4b(days)
    println(result)

    println("c):")
    result = Zadanie4.zad4c(days)
    println(result)

    println("================================")
    println("Zadanie 5:")
    Zadanie5.zad5()

    println("================================")
    println("Zadanie 6:")
    val krotka: (Int, Boolean, String) = (42, true, "Test")
    Zadanie6.zad6(krotka)

    println("================================")
    println("Zadanie 7:")
    val mapa: Map[String, String] = Map("Jan" -> "Kowalski", "Anna" -> "Nowak")
    val szukane: Array[String] = Array("Jan", "Krzysztof")
    Zadanie7.zad7(mapa,szukane)

    println("================================")
    println("Zadanie 8:")
    var liczby: Array[Int] = Array(0,1,2,3,4,0,5,0)
    println("Lista przed:")
    println(liczby.mkString(", "))
    println("Lista po:")
    println(Zadanie8.zad8(liczby).mkString(", "))

    println("================================")
    println("Zadanie 9:")
    println("Lista przed:")
    println(liczby.mkString(", "))
    println("Lista po:")
    println(Zadanie9.zad9(liczby).mkString(", "))

    println("================================")
    println("Zadanie 10:")
    println("Lista przed:")
    liczby = Array.range(-6,14)
    println(liczby.mkString(", "))
    println("Lista po:")
    println(Zadanie10.zad10(liczby).mkString(", "))
  }

}