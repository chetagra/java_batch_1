package com.company.oops;

public class fruit {
    String color;
    int price;

    public fruit(String col,int pri){
      this.color= col;
      this.price= pri;
    }

    public static void taste(){
        System.out.println("tasty");
    }

    public static void main(String[] args) {
        fruit mango = new fruit("yellow",50);
        System.out.println(mango.color);
        System.out.println(mango.price);
        taste();

        fruit orange= new fruit("orange",100);
        System.out.println(orange.color);
        System.out.println(orange.price);
    }
}
