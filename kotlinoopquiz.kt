package kotlinoopquiz

//1.
open class Hospital(var name:String="", var age:Int = 0, var head:String="",var id:Int=0){
    var departmentName:String= name.toUpperCase()
    var departmentAge:Int = age
    var departmentId:Int=id
    var departmentHead = head
}
class Dental(name:String,age:Int,head: String,id:Int): Hospital(name,age,head,id){

    fun details(){
        println("The $departmentName is headed by dr. $departmentHead and has the id $departmentId")
    }
}

class Surgery(name:String,age:Int,head: String,id:Int): Hospital(name,age,head,id){

    fun details(){
        println("The $departmentName is headed by dr. $departmentHead and has the id $departmentId")
    }
}

class General(name:String,age:Int,head: String,id:Int): Hospital(name,age,head,id){

    fun details(){
        println("The $departmentName is headed by dr. $departmentHead and has the id $departmentId")
    }
}

//2.
class Animal( var name: String = "animal", var age:Int=0) {
    var animalName = name.toUpperCase()
    var animalAge = age

    fun info(){
        println("$animalName is $animalAge years old")
    }

}


fun main(){
    //1.
    var dental1 = Dental("Healthstar dentals", 1, "Patel", 1)
    dental1.details()
    var general1 = General("Genaral kotlinoopquiz.Hospital", 1, "ALi", 2)
    general1.details()
    var surgery1 = Surgery("kotlinoopquiz.Surgery point", 1, "Jonathan", 3)
    surgery1.details()

    //2.
    var animal1 = Animal("cat", 2)
    animal1.info()
    var animal2 = Animal("My puppy", 3)
    animal2.info()
    var animal3 = Animal()
    animal3.info()

}