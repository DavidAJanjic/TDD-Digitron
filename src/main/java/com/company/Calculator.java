package com.company;


import java.util.ArrayList;

public class Calculator {
    Input input;

    private Calculator() {
    }

    public Calculator(Input input) {
        this.input = input;
    }

    public void start() {
        double rezultat;
        rezultat = compute(input.input());
        System.out.println("Result is: " + rezultat);

    }

    public double compute(String equation) {
        Parser.parse(equation);
        return Calculator.calculate();

    }

    public static double calculate() {
        double result = 0;
        ArrayList<Operations> o = Arrays.getOperations();
        ArrayList<Double> b = Arrays.getNumbers();
        int i = 0;
        int n = 0;
        for (int f = 0; f < o.size(); f++) {
            if (o.get(n).toString().equals("multiplication") | o.get(n).toString().equals("division")) {
                double x = o.get(n).giveResult(b.get(i), b.get(i + 1));
                b.set(i, x);
                b.remove(i + 1);
                o.remove(n);
                f--;
                i--;
                n--;
            }
            i++;
            n++;
        }
        i = 0;
        n = 0;
        for (int f = 0; f < o.size(); f++) {
            if (o.get(n).toString().equals("addition") | o.get(n).toString().equals("subtraction")) {
                double x = o.get(n).giveResult(b.get(i), b.get(i + 1));
                b.set(i, x);
                b.remove(i + 1);
                o.remove(n);
                f--;
                i--;
                n--;
            }
            i++;
            n++;
        }
        result = b.get(0);
        return result;
    }
}
