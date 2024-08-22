package com.lesson_8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int rs = calc.evaluate("1+2");
        int expect = 3;
        assertEquals(expect, rs);
    }

    @Test
    public void testAddThree() {
        Calculator calc = new Calculator();
        int rs = calc.evaluate("1+2+4");
        int expect = 7;
        assertEquals(expect, rs);
    }

    @Test
    public void testSub() {
        Calculator calc = new Calculator();
        int rs = calc.subtract("1-2-4-5");
        int expect = -10;
        assertEquals(expect, rs);
    }
}
