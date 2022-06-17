package com.company;

public class Client {
    public static void main(String[] args) {
        Seller adam = new ShiftSupervisor();
        Seller ewa = new Boss();
        adam.setSeller(ewa);

        Complaint c1 = new Complaint(123, 250);
        Complaint c2 = new Complaint(134, 501);
        Complaint c3 = new Complaint(145, 2500);

        adam.makeComplaint(c1);
        adam.makeComplaint(c2);
        adam.makeComplaint(c3);
    }
}
