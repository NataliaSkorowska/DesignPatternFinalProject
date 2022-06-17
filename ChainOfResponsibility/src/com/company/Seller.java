package com.company;

public abstract class Seller {
    protected Seller seller;

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public abstract void makeComplaint(Complaint complaint);
}
