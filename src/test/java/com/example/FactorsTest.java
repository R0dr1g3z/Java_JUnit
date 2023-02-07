package com.example;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FactorsTest {

    @Test
    public void testGeneratePrimeFactors() {
        List<Integer> actual = Factors.generatePrimeFactors(10);
        List<Integer> expected = Arrays.asList(1, 2, 5, 10);
        assertThat(actual, is(expected));
    }
}
