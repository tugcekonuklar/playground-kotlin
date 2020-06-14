import java.awt.Color

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}

fun isValidIdentifier(s: String): Boolean {

    if(s.isBlank()) return false

    for(char in s.substring(0,1)){
        when(char){
            in '0'..'9' -> return false
            in 'a'..'z' -> true
            else -> true
        }
    }

    for(char in s.substring(1,s.length)){
        when(char){
            in '0'..'9' -> true
            in 'a'..'z' -> true
            else -> return false
        }
    }

    return true;
}


fun updateWeather(degrees: Int): Pair<String, Color> {
    return when {
        degrees < 10 -> "Cold" to Color.BLUE
        degrees < 20 -> "Mild" to Color.GREEN
        else -> "Hot" to Color.RED
    }
}
