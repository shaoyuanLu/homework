package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter number of tickets: ");
        int tickets=scanner.nextInt();
        System.out.println("How many round-trip tickets: ");
        int roundTrip=scanner.nextInt();
        Tickets ticket = new Tickets(tickets,roundTrip);
        ticket.print();

    }
}
