/**
 *
 * P2.1
 * Write a program that reads a number and displays the square, cube, and fourth
 * power. Use the Math.pow method only for the fourth power.
 *
 **/
package com.wgu;
import java.util.Scanner; 

/**
 * @author Chad Dunda
 * */
 public class p2_1 {
   /**
    * @param args the command line arguments
    * */
   public static void main (String [] args)
   {
     Scanner in = new Scanner(System.in);
     System.out.print("Please enter a number to be squared, cubed and quadrupled: ");
     int number = in.nextInt();
     
     System.out.print("Squared: ");
     System.out.println(number * number);

     System.out.print("Cubed: ");
     System.out.println(number * number * number);

     System.out.print("Quad: "); 
     System.out.println(Math.pow(number, 4));
   }
 }
