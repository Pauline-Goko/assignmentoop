fun main() {
val human = Human("Carol", 21, 60,)

human.eat(1)
    println(human.weight)


human.speak("I am a foodie")

    human.birthday()
    println(human.age)

    var userEva = User("Eva", "Wanjiru", "evawanjiru@gmail.com", "0790733892", "eva1234")
    println(userEva.lastName)
    println(userEva.phoneNumber)

}
class Human(var name: String, var age: Int, var weight:Int){
    fun eat(foodWeight: Int){
        println("I am eating $foodWeight kgs of food")
        weight = weight + foodWeight

    }

fun speak(speech: String){
    println(speech)
}
 fun birthday(){
     age ++
 }

}
data class User( var firstName: String, var lastName: String, var email: String, var phoneNumber: String, var password: String)