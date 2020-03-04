package com.company;

public class Subtraction implements Operations {
    @Override
    public double giveResult(double x, double y) {
        return  x-y;
    }

    @Override
    public String toString() {
        return "subtraction";
    }
}
