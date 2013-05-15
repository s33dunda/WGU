/**
 *
 * Write a program that reads a temperature value and the letter C for Celsius or F 
 * for Fahrenheit. Print whether water is liquid, solid, or gaseous at the given 
 * temperature at sea level. 
 *
 **/
package com.wgu;
import java.util.Scanner; 

/**
 * @author Chad Dunda
 * */

 public class p3_1{
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

     if(tempType.equals("f")){
       degrees = (degrees - 32.0) * 5.0 / 9.0;
       System.out.println(degrees);
     }
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
