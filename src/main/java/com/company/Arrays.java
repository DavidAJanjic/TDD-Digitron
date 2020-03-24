package com.company;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    private static List<Operations> operations = new ArrayList<>();
    private static List<Double> numbers = new ArrayList<>();

    public static List<Operations> getOperations() {
        return operations;
    }

    public static void setOperations(List<Operations> operations) {
        Arrays.operations = operations;
    }

    public static List<Double> getNumbers() {
        return numbers;
    }

    public static void setNumbers(List<Double> numbers) {
        Arrays.numbers = numbers;
    }
}
