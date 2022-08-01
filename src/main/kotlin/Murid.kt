class Murid : Sekolah{
  constructor(nama : String, umur : Int):super(nama, umur)
  {
      println("child class constructor")
      println("Nama Murid nya : $nama")
      println("Umur murid nya  : $umur")
  }
}

/*merupakan contoh class child cunstructor
* dengan ada nya penambahkan method  SUPER*/