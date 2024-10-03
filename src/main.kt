fun main(args : Array<String>){
    var text : String? = null
    text = ""
/**Les Operateurs safe and unSafe*/
    /**Affiche null*/
    println("Hello ${text?.length}")
    /**Leve une exception*/
    println("Hello ${text!!.length}")
/** val est une constante*/
    val text1 = " Kotlin"
}