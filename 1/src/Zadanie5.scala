object Zadanie5 {

  def zad5(): Unit={
    val productsMap: Map[String, Double] = Map("Makaron" -> 3.99, "Papier Toaletowy" -> 9.99, "Pasztet Podlaski" -> 1.99)
    println("Produkty: ")
    println(productsMap)

    val newProductsMap = productsMap map {case (key, value) => (key, (math rint value*0.9*100) / 100)}
    println("Produkty po mapowaniu: ")
    println(newProductsMap)
  }
}
