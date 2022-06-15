fun main() {
    getUserInput()
}

private fun sum(x: Double, y: Double) {
    println("Sum of $x and $y will be ${x + y}")
    restartcalculation()
}

private fun getUserInput() {
    try {
        println("Type X number: ")
        var x: Double = readLine()!!.toDouble()
        println("Type Y number: ")
        var y: Double = readLine()!!.toDouble()
        sum(x, y)
    } catch (e: Exception) {
        println("Please try again")
        getUserInput()
    }
}

private fun restartcalculation() {
    println("Do you want to start again <Y\\N> ")
    try {
        val answer = readLine()
        if (answer.equals("y", ignoreCase = true)) getUserInput()
        else if (answer.equals("N", ignoreCase = true)) println("Finish")
        else {
            println("Please choose <Y\\N>")
            restartcalculation()
        }
    } catch (e: Exception) {
        println("Please choose <Y\\N>")
        restartcalculation()
    }

}