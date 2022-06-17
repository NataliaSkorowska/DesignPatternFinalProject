package com.company;

public class Florist {
    public static void main(String[] args) {
        FloristsShop floristsshop = new FloristsShop();
        System.out.println("Kwiatki w kwiaciarni:");
        for (Iterator iterator = floristsshop.getIterator(); iterator.hasMore();){
            String flower = (String)iterator.next();
            System.out.println(flower);
        }
    }
}
