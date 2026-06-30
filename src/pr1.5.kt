fun main(){

    println("Enter Month Number: ")
    val month_nnum = readln().toInt()
    println(
        when (month_nnum){
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else -> "Enter Number btw (0-12)"
        }

    )
}