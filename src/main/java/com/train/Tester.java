package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tickets;
        do {
            System.out.println("Please enter number of tickets: ");
            tickets=scanner.nextInt();
            if (tickets!=-1) {
                System.out.println("How many round-trip tickets: ");
                int roundTrip=scanner.nextInt();
                Tickets ticket = new Tickets(tickets,roundTrip);
                ticket.print();
            } else {
                System.out.println("Thanks");
            }
        } while (tickets!=-1);


    }
}
