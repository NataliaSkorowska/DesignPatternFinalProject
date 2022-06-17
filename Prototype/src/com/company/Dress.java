package com.company;

import java.text.MessageFormat;

public class Dress implements Prototype{
    private String dressName;
    private String dressMaterial;
    private int dressLength;

    public Dress  (String dressName, String dressMaterial, int dressLength){
        this.dressName = dressName;
        this.dressMaterial = dressMaterial;
        this.dressLength = dressLength;
    }

    public String getDressName() {
        return dressName;
    }

    public void setDressName(String dressName) {
        this.dressName = dressName;
    }

    public String getDressMaterial() {
        return dressMaterial;
    }

    public void setDressMaterial(String dressMaterial) {
        this.dressMaterial = dressMaterial;
    }

    public int getDressLength() {
        return dressLength;
    }

    public void setDressLength(int dressLength) {
        this.dressLength = dressLength;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Sukienka {0} jest z materiału {1} i ma długość {2} cm.", dressName, dressMaterial, dressLength);
    }

    @Override
    public Prototype Clone() {
        return new Dress(dressName, dressMaterial, dressLength);
    }
}
