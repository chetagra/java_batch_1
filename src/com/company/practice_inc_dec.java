package com.company;

public class practice_inc_dec {
    public static void main(String[] args) {
        int a=1;
        int b=3;

        int c = ++a; // c= a+1  a=a+1; here increment occurs before assignment
        int d= b++; // b=b+1  d=b; here increment occurs after assignment

//        System.out.println(a+" "+b+" "+c+" "+d);
        //a=1,b=4,c=3,d=5
        // a=1, b=3 , c=2 , d=4


        int e = 0;
        int f = 5;

        int w = --e; //  e=e-1 e=-1 w=e w=-1;
        int x = ++f; //  f=f+1 f=6 x=f x=6;
        int z = e++; // z=e z=-1  e=e+1 e=0

        System.out.println(e+" "+f+" "+" "+w+" "+x+" "+z);
        // e=1 f=6 w=0 x=6 z=0
         // e=1 , f= 6 , x=6 , w= 0 , z=0;
        // e=1, w=0 , z=0 , f=6 , x=6
    }
}
