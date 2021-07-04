package com.company.oops;

public class logical_operatos {
    public static void main(String[] args) {
        // and , or , not
        // truth table -> t=1  f=0
         // a =t   b= f    c = a and b => a.b =0=>f

        // except 0 every no. is treated as true
        // int a=1   int b=2  a and b => a.b
        // and -> a=1 , b=2,  a and b => a.b


        // and
        boolean a= false;
        boolean b= false;

        boolean c= a && b; // a.b
        System.out.println(c);

        //or
        boolean f= true;
        boolean d= true;

        boolean e= f || d; // a+b
        System.out.println(e);

        // not
        boolean g =true;
        boolean h= !g;
        System.out.println(h);

    }
}
