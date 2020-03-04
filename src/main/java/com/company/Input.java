package com.company;

import java.util.Scanner;

public class Input {
    public String input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Equation must not use columns '(' ')'!");
        System.out.println("Please enter your equation:");
        String equation = scanner.nextLine();
        return equation;
    }
}
