package com.company;

public class Dog {
    private String name;
    private int age;
    private String colour;
    private int weight;

    public String getName() {
        return "Name of dog: " + name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return  age;
    }
    public void setAge(int age) {
        if (age > 20) {
            System.out.println("Age too old for a dog: ");
        } else if (age < 0) {
            System.out.println("You enter a wrong age: ");
        } else {
            System.out.println("Age of " + name + ": ");
        }
        this.age = age;
    }
    public String getColour() {
        return "Colour of " + name + ": " + colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setWeight(int weight) {
        if (weight < 0) {
            System.out.println("You enter a wrong weight");
        } else if (weight > 30) {
            System.out.println("Weight of dog too much");
        } else {
            System.out.println("Weight of "+name+": ");
        }
        this.weight = weight;
    }
    public int getWeight() {
        return  weight;
    }
    public String getHunt() {
        return name + " can help to hunt during hunting of prey";
    }
    public String getPlay() {
        return name + " can play different games with owner";
    }
}
