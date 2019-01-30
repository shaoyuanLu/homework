package com.train;

public class Tickets {
    int tickets;
    int roundTrip;


    public Tickets(int tickets,int roundTrip) {
        this.tickets=tickets;
        this.roundTrip=roundTrip;
    }

    public void print() {
        int finalPrice = (tickets - roundTrip) * 1000 + roundTrip * 1800;
        System.out.println("Total tickets: " + tickets + "\n" + "Round-trip: " + roundTrip + "\n" + "Total: " + finalPrice);
    }
}
