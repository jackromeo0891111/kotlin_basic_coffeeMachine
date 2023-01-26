package machine
var hasWater: Int = 400
var hasMilk: Int = 540
var hasBeans: Int = 120
var hasMoney: Int = 550
var hasCups: Int = 9

fun buy() {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
    when (readln()) {
        "1" -> {
            if (hasWater > 250 && hasBeans > 16 && hasCups > 0) {
                hasWater -= 250
                hasBeans -= 16
                hasCups -= 1
                hasMoney += 4
            } else println("Insufficient resource")
        }

        "2" -> {
            if (hasWater > 350 && hasMilk > 75 && hasBeans > 20 && hasCups > 0) {
                hasWater -= 350
                hasMilk -= 75
                hasBeans -= 20
                hasCups -= 1
                hasMoney += 7
            } else println("Insufficient resource")
        }
        "3" -> {
            if (hasWater > 200 && hasMilk > 100 && hasBeans > 12 && hasCups > 0) {
                hasWater -= 200
                hasMilk -= 100
                hasBeans -= 12
                hasCups -= 1
                hasMoney += 6
            } else println("Insufficient resource")
        }
        else -> println("Invalid input")
    }
}

fun fill(){
    println("Write how many ml of water you want to add:")
    val addWater = readln().toInt()
    println("Write how many ml of milk you want to add:")
    val addMilk = readln().toInt()
    println("Write how many grams of coffee beans you want to add:")
    val addBeans = readln().toInt()
    println("Write how many disposable cups you want to add:")
    val addCups = readln().toInt()
    hasWater += addWater
    hasMilk += addMilk
    hasBeans += addBeans
    hasCups += addCups
}

fun take(){
    println("I gave you \$$hasMoney")
    hasMoney = 0
}

fun main() {
    var isOn = true
    while(isOn){
        println("The coffee machine has:")
        println("$hasWater ml of water")
        println("$hasMilk ml of milk")
        println("$hasBeans g of coffee beans")
        println("$hasCups disposable cups")
        println("\$$hasMoney of money")
        println("Write action (buy, fill, take): ")
        when(readln()){
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
            "exit" -> isOn = false
            else -> println("invalid input")
        }
    }
}