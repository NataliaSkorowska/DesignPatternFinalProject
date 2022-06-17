package com.company;

public class ConcertTickets implements Service{
    public String service;
    @Override
    public void ticketsPurchase(String ticketsType) {
        service = "Sprzedano bilet na " + ticketsType + " na koncert";
    }

    @Override
    public String customerService() {
        return service;
    }
}
