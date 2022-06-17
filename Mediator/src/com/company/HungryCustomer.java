package com.company;

public class HungryCustomer {
    public static void main(String[] args) {
        GlovoSystem glovoSystem = new Glovo();
        Deliverer adam = new Deliverer(glovoSystem);
        Order pizza = new Order(glovoSystem);

        glovoSystem.takeOrder(pizza);
        glovoSystem.availableDeliverer(adam);
        adam.order();
        pizza.order();
        pizza.pickingOrder();
        pizza.deliverOrder();
    }
}
