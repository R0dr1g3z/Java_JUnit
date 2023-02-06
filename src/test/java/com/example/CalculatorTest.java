package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(15, Calculator.add(10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(5, Calculator.divide(25, 5));
    }

    @Test
    public void testGreater() {
        assertTrue(Calculator.greater(5, 2));
        assertFalse(Calculator.greater(2, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, Calculator.multiply(5, 10));
    }

    @Test
    public void testSub() {
        assertEquals(5, Calculator.sub(10, 5));
    }

    @Test
    public void testFactorial() {
        assertEquals(24, Calculator.factorial(4));
    }

    @Test
    public void testDelta() {
        assertEquals(9, Calculator.delta(2, 5, 2), 0.1);
    }
}
