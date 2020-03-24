package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Parser {

    public static void parse(String s) {
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<Operations> operations = new ArrayList<>();

        String d = "";

        for (int n = 0; n < s.length(); n++) {
            char b = s.charAt(n);
            String a = Character.toString(b);
            if (isNumeric(a)) {
                d += a;
                continue;
            }
            if (d != "") {
                numbers.add(Double.parseDouble(d));
                d = "";
            }
            if (a.equals("+")) {
                operations.add(new Addition());
                continue;
            }
            if (a.equals("-")) {
                operations.add(new Subtraction());
                continue;
            }
            if (a.equals("*")) {
                operations.add(new Multiplication());
                continue;
            }
            if (a.equals("/")) {
                operations.add(new Division());
            }
        }
        if (d != "") {
            numbers.add(Double.parseDouble(d));
            d = "";
        }

        Arrays.setNumbers(numbers);
        Arrays.setOperations(operations);

    }

    private static boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }

}