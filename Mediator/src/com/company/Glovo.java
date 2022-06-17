package com.company;

public class Glovo implements GlovoSystem {
    private Order order;
    private Deliverer deliverer;
    public Boolean status;
    @Override
    public void takeOrder(Order order) {
        this.order = order;
    }

    @Override
    public void availableDeliverer(Deliverer deliverer) {
        this.deliverer = deliverer;
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public Boolean status() {
        return status;
    }
}
