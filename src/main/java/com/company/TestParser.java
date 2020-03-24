package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestParser {

    @Test
    public void test1() {
        Parser.parse("1 +2* 3-4/ 2");
        assertEquals(5, Calculator.calculate());
    }

    @Test
    public void test2() {
        Parser.parse("50 - 2* 10 + 60/3 + 4 * 5");
        assertEquals(70, Calculator.calculate());
    }
}
