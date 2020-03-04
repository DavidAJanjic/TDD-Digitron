package com.company;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    @Mock
    Input input;

    @Test
    public void testCompute() {
        MockitoAnnotations.initMocks(this);
        Mockito.when(input.input()).thenReturn("100* 2* 3-40/ 20");
        Calculator calculator = new Calculator(input);
        calculator.compute("100* 2* 3-40/ 20");
        assertEquals(598.0, 100 * 2 * 3 - 40 / 20);
    }

    @Test
    public void testInput() {
        MockitoAnnotations.initMocks(this);
        Mockito.when(input.input()).thenReturn("100* 2* 3-40/ 20");
        Calculator calculator = new Calculator(input);
        calculator.start();
    }

    @Test
    public void testCalculate() {
        Parser.parse("50 - 2* 10 + 60/3 + 4 * 5 ");
        assertEquals(70, Calculator.calculate());
    }
}
