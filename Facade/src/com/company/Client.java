package com.company;

public class Client {
    public static void main(String[] args) {
        System.out.println(TicketsSeller.sellTickets(EventType.KONCERT));
        System.out.println(TicketsSeller.sellTickets(EventType.TEATR));
    }
}
