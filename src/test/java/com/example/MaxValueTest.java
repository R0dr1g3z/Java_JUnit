package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxValueTest {
    @Test
    public void testLargest() {
        int[] list = {5, 8, 11, 12, 32, 22, 1};
        int max = MaxValue.largest(list);
        assertEquals(32, max);
    }
}
