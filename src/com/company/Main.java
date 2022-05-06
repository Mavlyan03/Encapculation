package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	Fish fish = new Fish();
    fish.setType("Trout");
    System.out.println(fish.getType());

    fish.setWeight(10);
    System.out.println(fish.getWeight());

    fish.setPrice(600);
    System.out.println(fish.getPrice());

    System.out.println(fish.getSwim());


    System.out.println();
    Parrot parrot = new Parrot();

    parrot.setType("Cockatoo");
    System.out.println(parrot.getType());

    parrot.setName("Jack Sparrow");
    System.out.println(parrot.getName());

    parrot.setColour("White");
    System.out.println(parrot.getColour());

    parrot.setAge(15);
    System.out.println(parrot.getAge());

    System.out.println(parrot.getFly());
    System.out.println(parrot.getSpeak());


    System.out.println();
    Cat cat = new Cat();
    cat.setName("Tom");
    System.out.println(cat.getName());

    cat.setGender("Male");
    System.out.println(cat.getGender());

    cat.setColour("Grey");
    System.out.println(cat.getColour());

    cat.setAge(-1);
    System.out.println(cat.getAge());

    System.out.println(cat.getHunt());
    System.out.println(cat.getPlay());

    System.out.println();
    Dog dog = new Dog();

    dog.setName("Spike");
    System.out.println(dog.getName());

    dog.setAge(10);
    System.out.println(dog.getAge());

    dog.setColour("brown");
    System.out.println(dog.getColour());

    dog.setWeight(20);
    System.out.println(dog.getWeight());

    System.out.println(dog.getHunt());
    System.out.println(dog.getPlay());

    }
}
