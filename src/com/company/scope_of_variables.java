package com.company;

public class scope_of_variables {
    int e= 1; // global scope
    public static void main(String[] args) {
        scope_of_variables sc=new scope_of_variables();
        int a=1; // function scope
        if (true){
            int b=20; // block scope
            System.out.println(a);
            System.out.println(b);
        }
        System.out.println(a);
//        System.out.println(b);
        random();
//        System.out.println(c);
        System.out.println(sc.e);
    }

    public static void random(){
        scope_of_variables sc=new scope_of_variables();
        int c=8; // function scope
//        System.out.println(a);
        System.out.println(sc.e);

    }
}
