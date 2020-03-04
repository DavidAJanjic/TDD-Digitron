package com.company;

public class Multiplication implements Operations {
    @Override
    public double giveResult(double x, double y) {
        return x * y;
    }

    @Override
    public String toString() {
        return "multiplication";
    }
}
