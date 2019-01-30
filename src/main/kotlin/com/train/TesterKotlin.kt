package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner =Scanner(System.`in`)
    println("Please enter number of tickets: ")
    val tickets = scanner.nextInt()
    println("How many round-trip tickets: ")
    val roundTrip = scanner.nextInt()
    val ticket=TesterKotlin(tickets,roundTrip)
    ticket.print()
}

class TesterKotlin(var tickets: Int,var roundTrip:Int){
    fun print() {
        val finalPrice = (tickets - roundTrip) * 1000 + roundTrip * 1800
        println("Total tickets: $tickets\nRound-trip: $roundTrip\nTotal: $finalPrice")
    }
}