//Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
  // Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
  // Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string
package org.Tandemloop;

import java.util.Scanner;

public class Calculator {
	public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public String divide(double a, double b) {
        if (b == 0) {
            return "Cannot divide by zero";
        }
        return String.valueOf(a / b);
    }

    public String calculate(double a, double b, String operation) {
        switch (operation) {
            case "Add":
                return String.valueOf(add(a, b));
            case "Subtract":
                return String.valueOf(subtract(a, b));
            case "Multiply":
                return String.valueOf(multiply(a, b));
            case "Divide":
                return divide(a, b);
            default:
                return "Invalid operation";
        }
    }
