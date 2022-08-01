fun main(args: Array<String>) {
////    sintax dibawah merupakan pemanggilan object pada Class murid
//    val murid1 = Murid("isna", 23)
//    val murid2 = Murid("supri")
//    val murid3 = Murid()

    /*systax dibawah merupakan pemanggilan object menthod yang ada di dalam class Mammal dan Humans dalam
     konsep Polymorphism (satu class bisa memiliki lebih dari satu method
    * dimana Class Mammal merupakan konsep hiretance yang sebagai parrent class dan class Human sebagai cild class
    * */
val human= Human("Taufik")
    human.iq =89
    human.details()
    human.breathing()
    human.eating()




}