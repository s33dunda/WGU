/**
 * P4.3   
 * Currency conversion. Write a program that first asks the user to type
 * today's price for one dollar in Japanese yen, then reads U.S. dollar values
 * and converts each to yen. Use 0 as a sentinel.
 */
package com.wgu;
import java.util.Scanner; 

/**
 * @author Chad Dunda
 * */

 public class p4_3{
   /**
    * @param args the command line arguments
    * */
   public static void main (String [] args)
   {
     double aDollar = 0;
     Scanner in = new Scanner(System.in);
     System.out.printf("What is today's price for one dollar in Japanese Yen? ");
     double aDollarInYen = in.nextDouble();
     System.out.printf("%nThank you. Please enter 0 dollars to quit calcualting.");
     do
     {
     System.out.printf("%nHow many dollars do you have? ");
     aDollar = in.nextDouble();
     double aYen = aDollarInYen * aDollar;
     System.out.printf("%n%f dollars gives you %f in yen.%n", aDollar, aYen);
     }
     while (aDollar != 0);

   }

 }
