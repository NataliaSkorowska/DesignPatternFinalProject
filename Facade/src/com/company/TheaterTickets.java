package com.company;

public class TheaterTickets implements Service{
    public String service;
    @Override
    public void ticketsPurchase(String ticketsType) {
        service = "Sprzedano bilet na " + ticketsType + " do teatru";
    }

    @Override
    public String customerService() {
        return service;
    }
}
