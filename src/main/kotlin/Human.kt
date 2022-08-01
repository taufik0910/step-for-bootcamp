//syntax class dibawah merupakan pemanggilan class parent (Mammal) sesuai dengan materi inheritance
class Human(var name: String): Mammal() {
    var iq : Int =0
    override var eyes: Int = 2
    override var legs: Int =2

    override fun breathing() {
        super.breathing()
        println("Line 24 :- $name is breating2")
    }
    fun details (){
        println("Line 28 :- $name have $legs legs,$eyes eyes and IQ level is $iq ")
    }

}