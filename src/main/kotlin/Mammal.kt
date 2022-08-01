
open class Mammal {
    open  var legs : Int = 0
    open  var eyes : Int = 0
    private var name: String= "Mammal"
//
//
    /* terdapat 2 method, hal ini dinamakan dengan
    *  konsep Polymorphism(satu class bisa memiliki lebih dari satu method
    *  perhatikan function breathing dan variable legs, eyes, itu merupakan konsep overridding
    * yang dimana function nya yang akan diopanggil saat proses build*/
    open  fun breathing() {
        println("Line 9 :- $name is breatingx ")
    }
    open  fun eating () {
        println("Line 13 :- $name is eatingx ")

    }
/*systax di atas merupakan class dengan konsep dari oop overidding dan hiretance
* ket overriding = dimana kita penyesampingkan method dalam class parent dan bisa memanggil
* method yang ada di child class dengan menambahkan function OPEN di awal fun nama*/
}