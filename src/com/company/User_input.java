package com.company;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int a= s.nextInt();
        System.out.println(a);

        char ch= s.next().charAt(0);
        System.out.println(ch);

        String str= s.next();
        System.out.println(str);

        boolean b= s.nextBoolean();
        System.out.println(b);

        double d= s.nextDouble();
        System.out.println(d);
    }
}
