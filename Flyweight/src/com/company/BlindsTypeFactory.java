package com.company;

import java.math.BigDecimal;
import java.util.Map;
import java.util.HashMap;

public class BlindsTypeFactory {
    private static Map<String, BlindType> blindTypes = new HashMap<>();

    public static BlindType getBlindType(String typeName, String fabric, BigDecimal price) {
        BlindType type = blindTypes.get(typeName);
        if (type == null) {
            type = new BlindType(typeName,fabric,price );
            blindTypes.put(typeName, type);
            System.out.println("Typ rolety " + typeName+ " został dodany do zbioru");
        }
        return type;
    }
}
