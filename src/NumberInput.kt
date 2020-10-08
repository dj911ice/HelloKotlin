fun main(args: Array<String>){

    //Play with numbers using outside input!
    println("Please enter first number...")
    var input = readLine()
    val firstNum = input?.toInt()

    println("Please enter second number...")
    input = readLine()

    val secondNum = input?.toInt()

    val sum = secondNum?.let { firstNum?.plus(it) }
    val sub = secondNum?.let { firstNum?.minus(it) }
    val mul = secondNum?.let { firstNum?.times(it) }
    if (secondNum == 0) {
        println("fool! you divided by $secondNum")
    } else {
        val div = secondNum?.let { firstNum?.div(it) }
        if (firstNum != null) {
            when {
                firstNum > secondNum!! -> {
                    println("first number is greater than the second number")
                    println("The summation of these two numbers is $sum")
                    println("The difference of these two numbers is $sub")
                    println("The multiple of these two numbers is $mul")
                    println("The division of these two numbers is ${"%.3f".format(div?.toFloat())}")
                }
                firstNum < secondNum -> {
                    println("first number is less than the second number")
                    println("The summation of these two numbers is $sum")
                    println("The difference of these two numbers is $sub")
                    println("The multiple of these two numbers is $mul")
                    println("The division of these two numbers is ${"%.3f".format(div?.toFloat())}")
                }
                else -> {
                    println("both numbers are equal")
                    println("The summation of these two numbers is $sum")
                    println("The difference of these two numbers is $sub")
                    println("The multiple of these two numbers is $mul")
                    println("The division of these two numbers is ${"%.3f".format(div?.toFloat())}")
                }
            }
        }
    }
}