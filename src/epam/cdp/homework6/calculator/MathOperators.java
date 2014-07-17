package epam.cdp.homework6.calculator;

import java.util.Scanner;

/**
 * Created by Таня on 13.07.2014.
 */
public class MathOperators {
    public static double Addition(double a, double b){
        return a + b;
    }

    public static double Multiplication(double a, double b){
        return a*b;
    }

    public static double Subtraction(double a, double b){
        return a-b;
    }

    public static double Division(double a, double b){
        if (b == 0){
            System.out.println("Division to 0 is invalid operation");
            System.out.print("Enter value: ");
            b = new Scanner(System.in).nextDouble();
        }
        return a/b;
    }

}
