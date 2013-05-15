/**
 * p4.8
 * Write a program that reads a word and prints each character of the word on
 * a separate line. For example, if the user provides the input "Harry", the
 * program prints
 *
 * H
 * a
 * r
 * r
 * y
 *
 */
package com.wgu;
import java.util.Scanner; 

/**
 * @author Chad Dunda
 * */

 public class outLettersLine{
   /**
    * @param args the command line arguments
    * */
   public static void main (String [] args)
   {
     Scanner in = new Scanner(System.in);
     String word= in.next();
     for (int i = 0; i < word.length(); i++){
       char letter = word.charAt(i);
       System.out.println(letter);
     }
   }

 }
