package com.lemavos.mcf.util;

public class valueValidator {

    public static void isPositive(double... values){
        for (Double v : values){
            if (v <= 0){
                throw new IllegalArgumentException("Value Cannot be negative!");
            }
        }
    } 

    public static void isNull(Object... values){
        for (Object v : values){
            if (v == null){
                throw new IllegalArgumentException("Value cannot be null!");
            }
        }
    }

}