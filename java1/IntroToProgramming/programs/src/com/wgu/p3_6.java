/**
 * Write a program that prompts the user for a wavelength value and prints a 
 * description of the corresponding part of the electromagnetic spectrum, as given 
 * in Table 7
 **/
package com.wgu;
import java.util.Scanner; 

/**
 * @author Chad Dunda
 * */

 public class p3_6{//change class name to assignment number aka .java filename
   /**
    * @param args the command line arguments
    * */
   public static void main (String [] args)
   {
     Scanner in = new Scanner(System.in);
     double radioWave = 0.1;
     double radioFreq = Math.pow(3, 9) ;
     double microWave = .001;
     double microFreq = Math.pow(3, 11);
     double ifraredWave = .0000001;
     double ifraredFreq = Math.pow(4, 14);
     double visibleWave = Math.pow(4, -7);
     double visibleFreq = Math.pow(7.5, 14);
     double ultraWave = Math.pow(10, -8);
     double ultraFreq = Math.pow(3, 16);
     double xWave = Math.pow(10, -11);
     double xFreq = Math.pow(3, 19);
     double gammaWave = Math.pow(10, -11);
     double gammaFreq = Math.pow(3, 19);
     System.out.println("Enter the wavelength: ");

     double userWave = in.nextDouble();
     double userFreq = 0;
     String userType = "";
     
     if ( userWave >= radioWave){
       userFreq = radioFreq;
       userType = "Radio";
     }else if ( userWave >= microWave ){
       userFreq = microFreq;
       userType = "Micro";
     }else if ( userWave >= ifraredWave){
       userFreq = ifraredFreq;
       userType = "Ifrared"; 
     }else if ( userWave >= visibleWave){
       userFreq = visibleFreq;
       userType = "Visible";
     }else if ( userWave >= ultraWave){
       userFreq = ultraFreq;
       userType = "Ultra";
     }else if ( userWave >= xWave){
       userFreq = xFreq;
       userType = "X-Ray";
     }else if ( userWave < gammaWave){
       userFreq = gammaFreq;
       userType = "Gamma";
     }
     
     System.out.printf("Ok your wavelenght is %s, then it is a %s wave with %s frequency.%n",userWave, userType, userFreq);
   }


 }
