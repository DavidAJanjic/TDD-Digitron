package com.company;

import java.util.ArrayList;

public class Arrays {
    private static ArrayList<Operations> operations = new ArrayList<>();
    private static ArrayList<Double> numbers = new ArrayList<>();

    public static ArrayList<Operations> getOperations() {
        return operations;
    }

    public static void setOperations(ArrayList<Operations> operations) {
        Arrays.operations = operations;
    }

    public static ArrayList<Double> getNumbers() {
        return numbers;
    }

    public static void setNumbers(ArrayList<Double> numbers) {
        Arrays.numbers = numbers;
    }
}
