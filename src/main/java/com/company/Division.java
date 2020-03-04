package com.company;

public class Division implements Operations {
    @Override
    public double giveResult(double x, double y) {
        return x/y;
    }

    @Override
    public String toString() {
        return "division";
    }
}
