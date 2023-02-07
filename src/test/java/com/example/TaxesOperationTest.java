package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaxesOperationTest {
    @Test
    public void testCalculateVat() {
        int actual = TaxesOperation.calculateVat(100, 10);
        int expected = 10;
        assertEquals(expected, actual);
    }
}
