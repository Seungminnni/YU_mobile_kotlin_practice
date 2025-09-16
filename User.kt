class User(name: String, count:Int){
    var name: String
    var count: Int

    init {
        this.name = name
        this.count = count
    
    }
    fun someFun(){
        println("name: $name , count: $count")
    }
}
fun main(){
    val user = User("Alice", 5)
    user.someFun()
}