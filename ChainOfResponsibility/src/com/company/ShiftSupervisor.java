package com.company;

public class ShiftSupervisor extends Seller {
    @Override
    public void makeComplaint(Complaint complaint) {
        if (complaint.price < 500){
            complaint.waitingTime = 7;
            System.out.println("Reklamacja o numerze " + complaint.id + " zostanie rozpatrzona w przeciągu " + complaint.waitingTime + " dni");
        } else if (seller != null){
            seller.makeComplaint(complaint);
        }
    }
}