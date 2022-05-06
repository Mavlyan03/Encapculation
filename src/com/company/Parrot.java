package com.company;

public class Parrot {
    private String type;
    private String name;
    private String colour;
    private int age;

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return "Type of parrot: " + type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return "Name of parrot: " + name;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return "Colour of parrot: " + colour;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("You enter a wrong age: ");
        } else if (age > 70) {
            System.out.println("Age too old for a parrot: ");
        } else {
            System.out.println("Age of " + name + ": ");
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getFly() {
        return name + " can fly very high.";
    }
    public String getSpeak() {
        return name + " can speak like human.";
    }

}

