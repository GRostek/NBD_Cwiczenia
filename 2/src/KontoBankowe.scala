class KontoBankowe(private var _stanKonta: Double) {

  def this(){
    this(0)
  }


  def stanKonta = _stanKonta
  def wplata(iloscWplacana: Double): Unit ={
    if(iloscWplacana > 0)
    _stanKonta += iloscWplacana;
  }

  def wyplata(iloscWyplacana: Double): Unit ={
    if(_stanKonta >= iloscWyplacana && iloscWyplacana > 0){
      _stanKonta -= iloscWyplacana
    } else{
      println("Stan konta wynosi: "+_stanKonta+", wypłacana kwota jest za duża")
    }
  }




}
