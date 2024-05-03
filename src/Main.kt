//import kotlin.math.*
//
//fun main() {
////
////    val details = listOf(
////        Person("name", 20, 160.0, 53.0),
////        Person("nancy", 21, 165.0, 58.0),
////        Person("mikisa", 22, 160.0, 60.0)
////    )
////
////    val sortObjects = details.sortedByDescending { index -> index.age }
////
////    println(sortObjects)
////
//////    person(Details)
////
////    val car = listOf(
////        Cars("RAB 009", 22.0),
////        Cars("RAF 301", 15.0),
////        Cars("RAB 405", 30.0)
////    )
////    println(vehicles(car))
////    addObjects(details)
////    reverse("margaret")
////
////    println(lastWord("I am a student "))
////    println(length("The quick fox jumped "))
//multiples()
//}
//
////Given a list of Person objects, each with the attributes, name,
//// age, height and weight. Sort the list in order of descending age.
//
//data class Person(var name: String, var age: Int, var height: Double, var weight: Double)
//
////fun addLists(){
////
////    var Details = mutableListOf(
////        Person ("name",20,160.0,53.0),
////        Person("nancy",21,165.0,58.0),
////        Person("mikisa",22,160.0,60.0)
////    )
////
////    Details.plus(Person("bebe",16,150.0,43.0),
////        Person("papa",42,192.0,87.0))
////
////}
//
////Write a function that takes in a list of Car objects each with a registration
//// and mileage attribute and returns the average mileage of all the vehicles in the list.
//
//data class Cars(var registration: String, var mileage: Double)
//
//fun vehicles(cars: List<Cars>): Double {
////    var averageMileage = 0
//
//    val sum = cars.sumOf { car -> car.mileage }
//    val averageMileage = sum / (cars.count())
//
//    return averageMileage
//
//}
//
//fun addObjects(person2: List<Person>) {
//
//    var people = listOf(
//        Person("shania", 12, 165.0, 67.0),
//        Person("yassin", 17, 178.0, 78.0)
//    )
//
//    val addLists = person2.plus(people)
//
//    println(addLists)
//}
//
//fun reverse(word: String) {
//
//    var newArray = word.toCharArray()
//
//    var forward = 0
//    var backward = word.length - 1
//
//    while (forward < backward) {
//
//        var temp = newArray[forward]
//        newArray[forward] = newArray[backward]
//        newArray[backward] = temp
//
//        forward += 1
//        backward -= 1
//
//    }
//
//    println(newArray.joinToString(""))
//
//}
//
//fun lastWord(sentence: String): Int {
//
//    val arr = (sentence.trim()).split(" ")
//
//    val lastWord = arr[arr.size - 1]
//
//    return lastWord.length
//
//}
//
//fun length(sentence: String): Int {
//
//    var i = (sentence.trim()).length - 1
//
//
//    while (i > 0) {
//
//        if (sentence[i] == ' ') {
//            break
//        }
//        i -= 1
//    }
//
//    return (sentence.trim()).length - (i + 1)
//
//}
//
//fun multiples(){
//
//    for (i in 1..1000) {
//
//        if (i % 6 == 0 && i % 8 == 0) {
//            println("Bingo")
//        } else if (i % 6 == 0) {
//            println(i)
//        } else if (i % 8 == 0) {
//            println(i)
//        } else {
//            continue
//        }
//    }
//}


fun Check_Password(password:String):Boolean {

//    check if password is valid, must be not be less than 8 and greater than 16,
    //    the password should not be "password" and it should contain a digit.
    var passwordLength = password.length

    if (passwordLength in 8..16) {
        if (password.lowercase() == "password") {
           return false
        } else {
                password.forEach { item ->

                if (item.isDigit()){
                    return true
                }
                }
            return false
            }
    }

    else{
        return false
    }

}

fun votes (list_names:List<String>):List<Map<String,Int>?>{
   var new: Map<String,Int>? = null
    var count = 0
    var votes_list = mutableListOf<Map<String,Int>?>()
    list_names.forEach { item ->

        for (name in list_names){

            if (name.lowercase() == item.lowercase()){

                count += 1

            }
           new = mapOf(name to count)
        }
        votes_list.add(new)
    }

return votes_list

}
//data class product(var name: String, var category: String)

class Store (){

//    Create the category lists for our store(Each category has it's own list)

    var shoes = mutableListOf("jordan1","zuri","massai","flats","nike","doll shoes")
    var clothes = mutableListOf("spaghetti top","trousers","t-shirts","vests","pants")
    var hygiene = mutableListOf("soap","wet wipes","shower gel","shaving cream")

//    Create an empty list for user's preferences

    var userPreferences = mutableListOf<String>()

//    Create function addPreferences for adding user's preferences in the list.

    fun addPreferences(item:String){
        userPreferences.add(item)
//        println(userPreferences)
    }

//    Create function recommendation to give recommendations based on the user's preferred item category.

    fun recommendations(item: String){

        if (item in shoes){
            println(shoes)
        }

        else if (item in clothes){

            println(clothes)

        }

        else{

        println(hygiene)

    }

}
}

fun main(){

  val latifa_001 = Store()

    println(latifa_001.userPreferences)
    latifa_001.addPreferences("Shaving Cream")
    latifa_001.recommendations("Shaving Cream")
    latifa_001.addPreferences("zuri")
    latifa_001.recommendations("zuri")
    println(latifa_001.userPreferences)

    val wanja_001 = Store()

    println("The next client:")

    println(wanja_001.userPreferences)
    wanja_001.addPreferences("trousers")
    wanja_001.recommendations("trousers")
    wanja_001.addPreferences("soap")
    wanja_001.recommendations("soap")
    println(wanja_001.userPreferences)

}

