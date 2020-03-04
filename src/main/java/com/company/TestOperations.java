package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestOperations {
    @Test
    public void testAddition() {
        double x = 4;
        double y = 5;
        Operations addition = new Addition();
        addition.giveResult(x, y);
        assertEquals(9.0, x + y);
    }

    @Test
    public void testSubtraction() {
        double x = 3;
        double y = 5.5;
        Operations subtraction = new Subtraction();
        subtraction.giveResult(x, y);
        assertEquals(-2.5, subtraction.giveResult(x, y));
    }

    @Test
    public void testMultiplication() {
        double x = 2;
        double y = 7;
        Operations multiplication = new Multiplication();
        multiplication.giveResult(x, y);
        assertEquals(14.0, x * y);
    }

    @Test
    public void testDivision() {
        double x = 15;
        double y = 3;
        Operations division = new Division();
        division.giveResult(x, y);
        assertEquals(5.0, x / y);
    }

    @Test
    public void testDivideWithNull() {
        double x = 0;
        double y = 1;
        Operations deljenje = new Division();
        assertEquals(0, deljenje.giveResult(x, y));
    }

}
