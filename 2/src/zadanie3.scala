object zadanie3 {

  def przywitaj(osoba: Osoba): Unit ={
    osoba match{
      case Osoba("Jan","Kowalski") => println("Witaj CEO Jan Kowalski")
      case Osoba("Anna",_) => println("Dzień dobry Anno")
      case Osoba(_,"Abacki") => println("Panie Abacki, witamy")
      case _ => println("Zapraszamy, "+ osoba.imie + " " + osoba.nazwisko)
    }
  }
}
