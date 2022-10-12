package kot

private var String1:String? = "sd6s"
private var String2:String? = "33"
private var String3:String? = null

fun main() {

    val result = (String1?.length?:0) + (String2?.length?:0) + (String3?.length?:0)

    println(result)

}
