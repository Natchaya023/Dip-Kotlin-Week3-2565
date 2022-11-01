fun WhenExpress(){
    val extname = ".kt"
    when(extname){
        ".kt"-> println("Kotlin File")
        ".java"-> println("Java File")
        else-> println("Unknown")
    }
}

fun WhenExpress2(){
    val country = "Thailand"
    when(country){
        "UK","USA","AUS","CANADA"-> println("English")
        "Vieatnam","Lao","Thailand"-> println("Suwannaphom")
        "China","Taiwan","Hong Kong"-> println("Chinese")
    }
}

fun WhenExpress3(){
    val device = "Oppo"
    val os = when(device){
        "Oppo","Vivo","Sumsung"->"Android"
        "Iphone"->"IOS"
        "iPad"->"iPadOS"
        else->"Unknown"
    }
    println(os)
}