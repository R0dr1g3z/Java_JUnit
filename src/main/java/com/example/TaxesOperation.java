package com.example;

public class TaxesOperation {
    
    public static int calculateVat(int price, int vat){
        return vat * price / 100;
    }
}
