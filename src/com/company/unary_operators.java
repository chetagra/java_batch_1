package com.company;

public class unary_operators {
    public static void main(String[] args) {
        int a= 1; // + is a unary operator;
        int b= 2; // - is a unary operator;



       a=b++; // b+1 ++ increment operator
        System.out.println(a);
        System.out.println(b);
        a=++b; // a=a+1
        System.out.println(a);
        a--; // a=a-1 -- decrement operator
        --a;

        boolean c = true;
        System.out.println(!c);
        System.out.println(!(!c));
         // ! operator is unary operator

    }
}
