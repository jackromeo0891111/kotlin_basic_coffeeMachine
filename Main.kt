package machine
class CoffeeMachine(){
    var water = 400
    var milk = 540
    var cBeans = 120
    var cups = 9
    var money = 550

    fun dashBoard(){
        var isOn = true
        while (isOn) {
            println("Write action (buy, fill, take, remaining, exit):")
            val action = readln()
            when(action){
                "buy" -> buyCoffee()
                "fill" -> fillMachine()
                "take" -> {
                    println("I gave you $money")
                    money = 0
                }
                "remaining" -> remaining()
                "exit" -> isOn = false
            }
        }
    }

    fun buyCoffee() {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
    when (readLine()!!) {
        "1" -> checkIng(250, 0, 16, 4)
        "2" -> checkIng(350, 75, 20, 7)
        "3" -> checkIng(200, 100, 12, 6)
        "back" -> return
        }
    }

    fun fillMachine() {
    println("Write how many ml of water do you want to add:")
    water += readLine()!!.toInt()
    println("Write how many ml of milk do you want to add:")
    milk += readLine()!!.toInt()
    println("Write how many grams of coffee beans do you want to add:")
    cBeans += readLine()!!.toInt()
    println("Write how many disposable cups of coffee do you want to add:")
    cups += readLine()!!.toInt()
    }

    fun remaining() {
    println("The coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$cBeans of coffee beans")
    println("$cups of disposable cups")
    println("$$money of money")
    }

    fun checkIng(waterX: Int, milkX: Int, cBeansX: Int, moneyX: Int) {
    if (water >= waterX && milk >= milkX && cBeans >= cBeansX && cups >= 1) {
        water -= waterX
        milk -= milkX
        cBeans -= cBeansX
        cups--
        money += moneyX
        println("I have enough resources, making you a coffee!")
    } else println("Not enough ingredients")
}
}


fun main() {
    val coffeeMachine = CoffeeMachine()
    coffeeMachine.dashBoard()
}







