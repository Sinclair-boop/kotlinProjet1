fun main(args : Array<String>){
    val str : String = "Hello Kotlin"
    val entier : Int = 42
    var str1 : String? = "  "
    println("Ceci est le texte $str ${str1?.length} ${entier}")
    println(str1.isNullOrBlank() as Boolean)
    if (str1.isNullOrBlank()){
        println("Ceci est le texte $str ${str1?.length} ${entier}")
    }
}