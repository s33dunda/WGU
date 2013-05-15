/**
 *  
 *  The original U.S. income tax of 1913 was quite simple. The tax was
 *  •   1 percent on the first $50,000.
 *  •   2 percent on the amount over $50,000 up to $75,000.
 *  •   3 percent on the amount over $75,000 up to $100,000.
 *  •   4 percent on the amount over $100,000 up to $250,000.
 *  •   5 percent on the amount over $250,000 up to $500,000.
 *  •   6 percent on the amount over $500,000.
 *  There was no separate schedule for single or married taxpayers. Write
 *  a program that computes the income tax according to this schedule.
 */
package com.wgu;
import java.util.Scanner; 

/**
 * @author Chad Dunda
 * */

 public class p3_17{//change class name to assignment number aka .java filename
   /**
    * @param args the command line arguments
    * */
   public static void main (String [] args)
   {
     //declare all variables needed
     Scanner in = new Scanner(System.in);
     System.out.println("To calculate the amount of taxes you'd owe in 1913 enter your income: ");
     double income  = in.nextDouble();
     double taxes   = 0;
     System.out.println(taxes);
     double maxTax0 = 50000.00 * .01;
     double maxTax1 = 25000.00 * .02 + maxTax0;
     double maxTax2 = 25000.00 * .03 + maxTax1;
     double maxTax3 = 150000.0 * .04 + maxTax2;
     double maxTax4 = 250000.0 * .05 + maxTax3;
     //calculate taxes owed for incomes over 50k
     if (income <= 50000){
       taxes = income * .01;
     }else if (income <= 75000){
       taxes = ((income - 50000.0) * .02 + maxTax0);
     }else if (income <= 100000){
       taxes = ((income - 75000.0) * .03 + maxTax1);
     }else if (income <= 250000){
       taxes = ((income - 100000.0) * .04 + maxTax2);
     }else if (income <= 500000){
       taxes = ((income - 250000.0) * .05 + maxTax3);
     }else if ( income > 500000){
       taxes = ((income - 500000.0) * .06 + maxTax4);
     }
     //print out the users taxes owed
     System.out.printf("Whoa, you owe some %f in taxes buddy.%n", taxes);
   }

 }
