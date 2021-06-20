package com.company.oops;

public class dog extends Animal{
    public dog(String Color, String Breed) {
        super(Color, Breed);
    }

    public void dogSound(){
        System.out.println("Barks");
    }

    public void AnimalSound(){
        System.out.println("dog sound : barking");
    }

    public static void main(String[] args) {
        dog d1=new dog("brown","pug");
//        d1.AnimalSound();
//        System.out.println(d1.breed);
//        d1.dogSound();
        d1.AnimalSound();

        Animal a1 = new Animal("red","labrador");
        a1.AnimalSound();

        Animal a2 = new dog("white","pug");
        a2.AnimalSound();


    }
}
