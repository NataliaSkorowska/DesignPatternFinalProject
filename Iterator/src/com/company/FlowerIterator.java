package com.company;

public class FlowerIterator implements Iterator{
    int index;
    public String flowers[] = {"róża", "tulipan", "kaktus", "piwonia"};

    @Override
    public Object next() {
        if(this.hasMore()) {
            return flowers[index++];
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        if (index<flowers.length) {
            return true;
        }
        return false;
    }
}
