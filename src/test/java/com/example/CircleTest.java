package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCircleArea() {
        double actual = Circle.circleArea(5);
        double expected = Math.PI * 25;
        assertEquals(expected, actual, 0.01);
        Circle.circleArea(-5);
    }
}
