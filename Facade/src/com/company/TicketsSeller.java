package com.company;

public class TicketsSeller {
    public static String sellTickets(EventType eventType){
        Ticket ticket = new Ticket();
        switch(eventType){
            case KONCERT:
                Service koncert = new ConcertTickets();
                koncert.ticketsPurchase(ticket.getConcertTickets());
                return(koncert.customerService());
            case TEATR:
                Service teatr = new TheaterTickets();
                teatr.ticketsPurchase(ticket.getTheaterTickets());
                return(teatr.customerService());
        }
        return null;
    }
}
