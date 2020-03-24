package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Parser {

    public static void parse(String s) {
        Scanner x = new Scanner(s);
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<Operations> operations = new ArrayList<>();
        while (x.hasNext()) {
            String d = "";
            String c = x.next();
            for (int n = 0; n < c.length(); n++) {
                char b = c.charAt(n);
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

        }
        Arrays.setNumbers(numbers);
        Arrays.setOperations(operations);
        x.close();
    }

    private static boolean isNumeric(String s) {
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");
    }

}