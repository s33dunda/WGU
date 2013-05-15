package com.wgu;

/**
 * @author Chad Dunda
 * */
public class R2dot3{
/*
 * @param args the command line arguments
 */
  public static void main (String [] args)
  {
    double x = 2.5;
    double y = (-1.5);
    int m = 18;
    int n = 4;
    double ans1, ans2, ans3, ans4, ans5;

    ans1=(x + n * y - (x + n) * y);
    ans2=(m / n + m % n);
    ans3=(5 * x - n / 5);
    ans4=(1 - (1 - (1 - (1 - (1 - n)))));
    ans5=(Math.sqrt(Math.sqrt(n)));

    System.out.println(ans1);
    System.out.println(ans2);
    System.out.println(ans3);
    System.out.println(ans4);
    System.out.println(ans5);
  }
}
