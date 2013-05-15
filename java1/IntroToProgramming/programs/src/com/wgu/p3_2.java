/**
 *
 * Write a program that reads a temperature value and the letter C for Celsius or F 
 * for Fahrenheit. Print whether water is liquid, solid, or gaseous at the given 
 * temperature at sea level. 
 * p3.2
 *
 * The boiling point of water drops by about one degree centigrade for every
 * 300 meters (or 1,000 feet) of altitude. Improve the program of Exercise P3.1
 * to allow the user to supply the altitude in meters or feet.
 *
 * Add error handling to Exercise P3.2. If the user does not enter a number
 * when expected, or provides an invalid unit for the altitude, print an error
 * message and end the program.
 */
package com.wgu;
import java.util.Scanner; 

/**
 * @author Chad Dunda
 * */

 public class p3_2{
   /**
    * @param args the command line arguments
    * */
   public static void main (String [] args)
   {
     Scanner in = new Scanner(System.in);
     String water = "";
     System.out.print("Enter a temperature: ");
     Double degrees = in.nextDouble();
     System.out.println("");
     System.out.print("Enter a 'C' for Celsius or 'F' for Fahrenheit: ");
     String tempType = in.next();
     System.out.println("");
     System.out.print("Enter the altitude in meters.");
     Double altitude = in.nextDouble();
     Double boilingPoint = altitude % 300;

     if(tempType.equals("f")){
       degrees = (degrees - 32.0) * 5.0 / 9.0;
     }
     degrees = degrees + boilingPoint;
     if(degrees >= 100){
       water = "gaseous";
     }else if(degrees > 0){
       water = "liquid";
     }else if(degrees <= 0){
       water = "solid";
     }
     System.out.printf("Wow, really? The water must be %s%n",water);
   }

 }
