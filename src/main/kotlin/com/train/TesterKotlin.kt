package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets: ")
    val ticket = scanner.nextInt()
    println("How many round-trip tickets: ")
    val rtTicket = scanner.nextInt()
    val tic =Ticket(ticket,rtTicket)
    tic.print()
//檢查rtTicket<ticket
    

}

class Ticket(var ticket: Int,var rtTicket: Int){
    fun print(){
        println("Tickets: $ticket")
        println("Round-trip tickets: $rtTicket")
        println("Total: ${(ticket-rtTicket)*1000 + rtTicket*1800}")


    }
}