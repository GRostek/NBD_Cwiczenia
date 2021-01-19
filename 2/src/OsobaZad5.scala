class OsobaZad5(val imie: String, val nazwisko: String,val podatek: Double = 0) {

  def wypiszOsobe(): Unit ={
    println(imie + " " +nazwisko+ ", podatek: "+podatek)
  }
}

trait Student extends OsobaZad5{
  override val podatek: Double = 0
}

trait Pracownik extends OsobaZad5{
  def pensja: Double

  override val podatek: Double = pensja * 0.2

  override def wypiszOsobe(): Unit = {
    super.wypiszOsobe()
    println("pensja: "+pensja)
  }
}

trait Nauczyciel extends Pracownik{
  override val podatek: Double = pensja * 0.1
}
