/**
 * Write a program that asks the user to enter a month (1 for January, 2 for
 * February, and so on) and then prints the number of days in the month. For
 * February, print “28 or 29 days”.
 *
 * Enter a month: 5
 * 30 days
 *
 * Do not use a separate if/else branch for each month. Use Boolean operators
 */
package com.wgu;
import java.util.Scanner; 

/**
 * @author Chad Dunda
 * */

 public class p3_23{
   /**
    * @param args the command line arguments
    * */
   public static void main (String [] args)
   {
     //declare all variables here
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a month: ");
     int month = in.nextInt();
     int day = 0;

     if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
       day = 31;
     }else if ( month == 4 || month == 6 || month == 9 || month == 11){
       day = 30;
     }else{
       day = 29;
     }
     System.out.println(day);
   }

 }
