package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner =Scanner(System.`in`)
    do {
        println("Please enter number of tickets: ")
        val tickets = scanner.nextInt()
        if (tickets != -1) {
            println("How many round-trip tickets: ")
            val roundTrip = scanner.nextInt()
            val ticket = TesterKotlin(tickets, roundTrip)
            ticket.print()
        } else {
            println("Thanks")
        }
    } while (tickets!=-1)
}

class TesterKotlin(var tickets: Int,var roundTrip:Int){
    fun print() {
        val finalPrice = (tickets - roundTrip) * 1000 + roundTrip * 1800
        println("Total tickets: $tickets\nRound-trip: $roundTrip\nTotal: $finalPrice")
    }
}