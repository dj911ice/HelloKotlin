fun main(args: Array<String>){

    fizzBuzz()
    fizzBuzzUserInput()
    fizzBuzzStepsUserInput()
    reverseFizzBuzzUserInput()
}

fun fizzBuzz() {
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("Fizz Buzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else{}
        println(i)
    }
}

fun fizzBuzzUserInput() {

    println("Enter a number...")
    var num = readLine()?.toInt()

    for (i in 1..num!!) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("Fizz Buzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else{}
        println(i)
    }
}

fun fizzBuzzStepsUserInput() {
    println("Enter a number...")
    var num = readLine()?.toInt()

    for (i in 1..num!! step 2) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("Fizz Buzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else{}
        println(i)
    }
}

fun reverseFizzBuzzUserInput() {
    println("Enter a number that is more than 5..")
    var num = readLine()?.toInt()
    if (num != null) {
        while (num!! <= 5) {
            println("Sorry number entered is too low!")
            println("Enter a number that is more than 5..")
            num = readLine()?.toInt()
        }
    }
    for (i in num!! downTo 0) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("Fizz Buzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else{}
        println(i)
    }
}
