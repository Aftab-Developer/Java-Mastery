package com.practiseJava;

public class Pracrise01 {
    public static String greet(String name)
    {
        return "Hellow "+ name ;
    }

    public static void main(String[] args) {
       String ans = greet("Aftab");
      boolean res =  ans.equals("Afta") ;
        System.out.println(res);
    }
}

