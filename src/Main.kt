

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

