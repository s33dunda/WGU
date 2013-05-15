/**
 *
 * P2.2
 * Write a program that prompts the user for two intergers and then prints
 * •    The sum
 * •    The difference
 * •    The product
 * •    The average
 * •    The distance (absolute value of the difference)
 * •    The maximum (the larger of the two)
 * •    The minimum (the smaller of the two)
 * Hint: The max and min functions are declared in the Math class.
 * 
 **/
package com.wgu;
import java.util.Scanner; 

/**
 * @author Chad Dunda
 * */
 public class p2_2 {
   /**
    * @param args the command line arguments
    * */
   public static void main (String [] args)
   {
     Scanner in = new Scanner(System.in);
     System.out.println("You will be asked to enter 2 numbers.");
     System.out.print("After entering the sum, difference, product, average, dist");
     System.out.println("ance, maximum and minimum will be displayed.");
     System.out.printf("%nPlease enter the first number here: ");
     double number1 = in.nextInt();

     System.out.print("Please enter the second number here: ");
     double number2 = in.nextInt();
     
     System.out.printf("The Sum: %-+(,20.10g", number1 + number2,  "%n%n");
     System.out.println("");
     System.out.printf("The Difference: %-+(,20.10g", number1 - number2, "%n%n");
     System.out.println("");
     System.out.printf("The Product: %-+(,20.10g", number1 * number2, "%n%n");
     System.out.println("");
     System.out.printf("The average: %-+(,20.10g", number1 * number2 / 2.0, "%n%n");
     System.out.println("");
     System.out.printf("The Distance: %-+(,20.10g", Math.abs(number1 - number2), "%n%n");
     System.out.println("");
     System.out.printf("The Maximum: %-+(,20.10g", Math.max(number1,  number2), "%n%n");
     System.out.println("");
     System.out.printf("The Minimum: %-+(,20.10g", Math.min(number1,  number2), "%n%n");
     System.out.println("");

   }
 }
