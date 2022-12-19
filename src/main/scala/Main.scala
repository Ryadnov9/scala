
object Main {
  def main(args: Array[String]): Unit = {
    var addr1 = new Address("Ukraine", "Kherson", 20)
    var addr2 = new Address("Ukraine", "Kiev", 4)
    var addr3 = new Address("Ukraine", "Kharkov", 22)
    var smartcontrakt_1 = new Smartcontrakt(500, 6, 10)
    var smartcontrakt_2 = new Smartcontrakt(500, 10, 5)
    var h1 = new Teacher("Denis", "Vinnik", 34, "DenV@gmail.com", addr1, "Deniss", "123", 0, 1000, smartcontrakt_1, 10)
    var s1 = new Student("Vova", "Vovlin", 17, "VovaVV@gmail.com", addr2, "VoVva", "456", 0, 1000, smartcontrakt_1)
    var s2 = new Student("Roma", "Zarkov", 18, "Roam@gmail.com", addr3, "RROOMMAA", "678", 0, 1000, smartcontrakt_1)
    var s3 = new Student("liza", "Potapova", 18, "LisaP@gmail.com", addr3, "lissaa", "890", 0, 1000, smartcontrakt_1)
    var s4 = new Student("viktor", "Krasnui", 18, "VikotrL@gmail.com", addr3, "viktorr", "012", 0, 1000, smartcontrakt_1)
    var s5 = new Student("Sacha", "Alexandrov", 18, "SachaA@gmail.com", addr3, "sanyAA", "345", 0, 1000, smartcontrakt_1)
    var birrga = new Birrga()
    var platform = new Platform()
    h1.addinlist(s1)
    h1.addinlist(s2)
    h1.addinlist(s3)
    h1.addinlist(s4)
    h1.addinlist(s5)

    println(h1.Show())
    println(h1.showlist())
    h1.evaluation(birrga, platform)
    println(h1.Show())
    println(h1.showlist())

    println(birrga.Show())
    println(platform.Show());}
}