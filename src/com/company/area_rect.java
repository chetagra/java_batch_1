package com.company;

import java.util.Scanner;

public class area_rect {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length:");
        int l = s.nextInt();
        System.out.println("Enter Breadth:");
        int b= s.nextInt();
       int area=rect_area(l,b);
        System.out.println("Your Computed Area is:"+" "+area);
    }
    public  static  int rect_area(int l,int b){
        int area= l*b;
        return  area;
    }

}
