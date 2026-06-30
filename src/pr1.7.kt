fun main(){
    println("Enter number")
    val num = readln().toInt()

    println(fec(num))
}

fun fec(num: Int): Int{
    if (num < 2){
        return 1
    }
    else{
        return fec(num - 1) * num
    }
}