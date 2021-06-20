package com.company.oops;

public class pig extends Animal  {

    public pig(String Color, String Breed) {
        super(Color, Breed);
    }

    public void AnimalSound(){
        System.out.println("pig says wee");
    }

    public static void main(String[] args) {
        pig p1 = new pig("pink","don't know");
        p1.AnimalSound();

        Animal a = new Animal("pink","don't know");
        a.AnimalSound();

        Animal p = new pig("pink","don't know");
        p.AnimalSound();
    }
}
