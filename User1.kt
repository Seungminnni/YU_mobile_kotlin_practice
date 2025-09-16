class User1{
    constructor(name: String){
        println("constructor with name: $name")
    }
    constructor(name: String, count: Int){
        println("constructor with name: $name and count: $count")
    }
}
fun main(){
    val user = User1("Alice", 5)
    val user2 = User1("Bob")
}