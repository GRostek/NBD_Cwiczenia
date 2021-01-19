object zadanie1 {

  def jakiToDzien(dzien: String): String={
    val dzienLowerCase = dzien.toLowerCase()

    dzienLowerCase match {
        case "poniedziałek" => "Praca"
        case "wtorek" => "Praca"
        case "środa" => "Praca"
        case "czwartek" => "Praca"
        case "piątek" => "Praca"
        case "sobota" => "Weekend"
        case "niedziela" => "Weekend"
        case _ => "Nie ma takiego dnia"
    }
  }

}
