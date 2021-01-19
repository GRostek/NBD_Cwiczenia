object Main {

  def main(args: Array[String]) {
    println("Zadanie 1:")
    val days = Array("Poniedziałek", "Wtorek", "środa", "Czwartek", "PiąTeK", "sOBOTA", "Niedziela", "pjatk is love, pjatk is live")
    for (d <- days) {
      print(d + ": " + zadanie1.jakiToDzien(d))
      println()
    }

    println()
    println("============================")
    println()
    println("Zadanie2")
    val konto1 = new KontoBankowe()
    println("Stan konta 1 (konstruktor bezargumentowy): "+konto1.stanKonta)
    val konto2 = new KontoBankowe(1000)
    println("Stan konta 2: "+konto2.stanKonta)
    println("Wpłacamy 500zł")
    konto2.wplata(500)
    println("Stan konta 2: "+konto2.stanKonta)
    println("Wypłacamy 2000zł")
    konto2.wyplata(2000)
    println("Stan konta 2: "+konto2.stanKonta)
    println("Wypłacamy 1000zł")
    konto2.wyplata(1000)
    println("Stan konta 2: "+konto2.stanKonta)

    println()
    println("============================")
    println()
    println("Zadanie3")

    val jan = new Osoba("Jan", "Kowalski")
    val anna = new Osoba("Anna", "Nowacka")
    val krzysztof = new Osoba("Krzysztof", "Abacki")
    val grzegorz = new Osoba("Grzegorz", "Rostek")
    zadanie3.przywitaj(jan)
    zadanie3.przywitaj(anna)
    zadanie3.przywitaj(krzysztof)
    zadanie3.przywitaj(grzegorz)


    println()
    println("============================")
    println()
    println("Zadanie4")

    println("Przekażmy do funkcji 3 i wykonajmy mnożenie")
    println(zadanie4.dzialanie(3, {x: Int => x*x }))


    println()
    println("============================")
    println()
    println("Zadanie5")

    val Osoba1 = new OsobaZad5("Jan", "Kowalski") with Student
    val Osoba2 = new OsobaZad5("Anna", "Nowacka") with Pracownik {
      override def pensja: Double = 2000
    }
    val Osoba3 = new OsobaZad5("Krzysztof", "Abacki") with Nauczyciel{
      override def pensja: Double = 2500
    }

    println("Student: ")
    Osoba1.wypiszOsobe()
    println()
    println("Pracownik: ")
    Osoba2.wypiszOsobe()
    println()
    println("Nauczyciel: ")
    Osoba3.wypiszOsobe()
    println()


    println("Student pracownik: ")
    val Osoba4 = new OsobaZad5("Tomasz", "Babacki") with Student with Pracownik{
      override def pensja: Double = 8000
    }
    Osoba4.wypiszOsobe()
    println()
    println("Pracownik student: ")
    val Osoba5 = new OsobaZad5("Marcin", "Cabacki") with Pracownik with Student {
      override def pensja: Double = 6000
    }
    Osoba5.wypiszOsobe()

  }

}
