package epam.cdp.homework6.calculator;

import java.util.Scanner;

/**
 * Created by Таня on 13.07.2014.
 */
public class Calculator {

   public static void main(String[] args) {
       String answer = "y";
       do {
           System.out.println("---------------------------------------------------");
           System.out.println("| Select item menu:  1 - Addition ('+')           |");
           System.out.println("|                    2 - Substraction ('-')       |");
           System.out.println("|                    3 - Multiplication ('*')     |");
           System.out.println("|                    4 - Division ('/')           |");
           System.out.println("|                    0 - Exit                     |");
           System.out.println("---------------------------------------------------");

           int m_item = new Scanner(System.in).nextInt();
           switch (m_item) {
               case 0:
               default:
                   answer = "n";
                   break;
               case 1:
               case 2:
               case 3:
               case 4:
                   System.out.print("Enter value: ");
                   double f_value = new Scanner(System.in).nextDouble();
                   System.out.print("Enter value: ");
                   double s_value = new Scanner(System.in).nextDouble();

                   switch (m_item) {
                       case 1:
                           System.out.println("Result: " + MathOperators.Addition(f_value, s_value));
                           break;
                       case 2:
                           System.out.println("Result: " + MathOperators.Subtraction(f_value, s_value));
                           break;
                       case 3:
                           System.out.println("Result: " + MathOperators.Multiplication(f_value, s_value));
                           break;
                       case 4:
                           System.out.println("Result: " + MathOperators.Division(f_value, s_value));
                           break;
                   }
                   break;
           }

           if (answer != "n") {
               System.out.println("Do you want to continue(yes/no)?");
               answer = new Scanner(System.in).next();
           }
       }while(answer.equals("yes") || answer.equals("y") || answer.equals("Y"));
   }

}
