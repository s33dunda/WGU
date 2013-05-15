/**
 * The following algorithm yields the season (Spring, Summer, Fall, or Winter)
 * for a given month and day.
 *
 * If month is 1, 2, or 3, season = "Winter"
 * Else if month is 4, 5, or 6, season = "Spring"
 * Else if month is 7, 8, or 9, season = "Summer"
 * Else if month is 10, 11, or 12, season = "Fall"
 * If month is divisible by 3 and day >= 21
 *    If season is "Winter", season = "Spring"
 *       Else if season is "Spring", season = "Summer"
 *          Else if season is "Summer", season = "Fall"
 *             Else season = "Winter"
 *
 *             Write a program that prompts the user for a month and day and
 *             then prints the season, as determined by this algorithm.
 **/
package com.wgu;
import java.util.Scanner; 

/**
 * @author Chad Dunda
 * */

 public class p3_12{
   /**
    * @param args the command line arguments
    * */
   public static void main (String [] args)
   {
     //initialize vars from user input
     Scanner in = new Scanner(System.in);
     System.out.println("Please enter a month (num. bet. 1-12): ");
     int month  = in.nextInt();
     int hybridMonth = month % 3;
     System.out.println("Please enter the day of the month (num. bet. 1-31); ");
     int day    = in.nextInt();
     String season = "tbd";
     
     //initialize the season value within the condition of the month 
     if (month <= 3){
       season = "winter";
     }else if (month <= 6){
       season = "spring";
     }else if (month <= 9){
       season = "summer";
     }else if (month <= 12){
       season = "fall";
     }
     //Create a more accurate account of the season using the inputted day

     if ( (hybridMonth ==0) && (day >= 21) ){
       if (season.equals("winter")){
         season = "spring";
       }else if (season.equals("spring")){
         season = "summer";
       }else if (season.equals("summer")){
         season = "fall";
       }else if (season.equals("fall")){
         season = "winter";
       }
     }
     System.out.printf("Oh its %s the %d, how is your %s so far?%n", month,day,season);
   }
 }
