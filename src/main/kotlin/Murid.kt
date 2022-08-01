class Murid(val nama: String ="Murid", var umur : Int= 23)
//sintax di atas merupakan penerapan konsep primary constructor
{
    val murNama : String
    var murUmur : Int

    init {
//        sintax ini merupakan penerapan method init (standard library)
        if (nama == "Murid"){
            murNama = "Farid".toUpperCase()
            murUmur = 23
        }else{
            murNama =nama.toUpperCase()
            murUmur = umur
        }
        println("Nama Murid : $murNama")
        println("Umur Murid : $murUmur")
    }

    /*sintak ini merupakan konsep penerapan konsep init dan primary constructor
    * dalam contoh berikut, kita memiliki blok penginisiasi yang telah kita nyatakan dalam constructor
    * menggunakan INIT. dalam blok ini,
    * kita dapat memiliki logika inisialisasi tambahan sesuai dengan kita kehendaki */
}