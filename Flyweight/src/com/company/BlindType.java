package com.company;

import java.math.BigDecimal;

public class BlindType {
    private String typeName, fabric;
    private BigDecimal price;

    public BlindType(String typeName, String fabric, BigDecimal price) {
        this.typeName = typeName;
        this.fabric = fabric;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Szczegóły typu rolety: {" +
                 typeName +
                ", materiał:" + fabric +
                ", cena za metr:" + price
                + " zł }" ;
    }
}

