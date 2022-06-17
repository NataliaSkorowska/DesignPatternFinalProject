package com.company;

public class Boss extends Seller {
    @Override
    public void makeComplaint(Complaint complaint) {
        if (complaint.price < 1500){
            complaint.waitingTime = 14;
            System.out.println("Reklamacja o numerze " + complaint.id + " zostanie rozpatrzona w przeciągu " + complaint.waitingTime + " dni");
        } else {
            complaint.waitingTime = 28;
            System.out.println("Reklamacja zostanie przekazana do oddziału głównego. Czas oczekiwania to " + complaint.waitingTime + " dni");
        }
    }
}