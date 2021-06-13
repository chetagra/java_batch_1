package com.company;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        loops(n);
        nos_1_to_10();
        while_loop();
    }
    public static void loops(int n){
        for (int a = 0; a < n; a++) {
            System.out.println("chetan"+a);
        }
    }

    public static void nos_1_to_10(){
        for (int i = 0; i <= 10; i++) {
            if (i==5){
                continue;
            }
            System.out.println(i);
        }
    }

    public  static  void while_loop(){
        int i=0;
         while (i<10){

             if (i==2){
                 break;
             }
             System.out.println("chetan");
             i++;
         }
    }
}
