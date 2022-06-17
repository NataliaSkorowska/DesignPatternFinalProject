package com.company;

public class FloristsShop implements Container{
    @Override
    public Iterator getIterator() {
        return new FlowerIterator();
    }
}
