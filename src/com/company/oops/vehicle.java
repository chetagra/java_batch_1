package com.company.oops;

public class vehicle {
    String color="red";
    String model="x4";
    int price=3000;



    public void brake(){
        System.out.println("stop's vehicle from moving");
    }

    public static void accelarate(){
        System.out.println("car starts moving");
    }

    public static void main(String[] args) {
        vehicle v1= new vehicle();  //object of vehicle class
        System.out.println(v1.color);
        System.out.println(v1.model);
        System.out.println(v1.price);
        v1.color="blue";
        v1.price=4000;
        System.out.println(v1.color);
        System.out.println(v1.price);
        v1.brake();
        accelarate();


        vehicle v3= new vehicle();
        System.out.println(v3.color);
        System.out.println(v3.price);
    }
}
