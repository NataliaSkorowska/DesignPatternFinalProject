package com.company;

public interface GlovoSystem {
    public void takeOrder (Order order);
    public void availableDeliverer(Deliverer deliverer);
    public void setStatus (boolean status);
    public Boolean status();
}
