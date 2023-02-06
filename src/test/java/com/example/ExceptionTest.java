package com.example;

import org.junit.Test;

public class ExceptionTest {
    @Test(expected = IllegalArgumentException.class)
    public void testPrintMessage() {
        Exception.printMessage(null);
    }
}
