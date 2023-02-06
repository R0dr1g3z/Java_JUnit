package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstTest {
    First first = new First();

    @Test
    public void testMultiply() {
        int add = first.multiply(2, 6);
        assertEquals(12, add);
    }

    @Test
    public void testLinkStrings() {
        String linkedStrings = first.linkStrings("one", "two");
        assertEquals("onetwo", linkedStrings);
    }
}
