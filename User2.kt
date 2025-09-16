class User2(name: String){
    constructor(name: String, count: Int): this(name){
        println("constructor with name: $name")
    }
    constructor(name: String, count: Int){
        println("constructor with name: $name and count: $count")
    }
}
fun main(){
    val user = User2("Alice", 5)
    val user2 = User2("Bob")
}
