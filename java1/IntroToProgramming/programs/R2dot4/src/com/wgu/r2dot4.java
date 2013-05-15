package com.wgu;

public class r2dot4{
  public static void main (String [] args)
  {
    String s = "Hello";
    String t = "World";
    String b, c, d, e;
    int a;

    a = s.length() + t.length();
    b = s.substring(1, 2);
    c = s.substring(s.length() / 2, s.length());
    d = s + t; 
    e = t + s;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
  }
}
