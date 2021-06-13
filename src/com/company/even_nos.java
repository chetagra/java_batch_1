package com.company;

public class even_nos {
    public static void main(String[] args) {
//        nos();
        nos_for();
    }
    public static void nos(){
       int i=1;
        while (i<=10){
            if (i%2==0){
                System.out.println(i);
            }
           i++;
       }
    }
    public static void nos_for(){
        for (int i = 1; i <= 10; i++) {
            if (i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }
}
