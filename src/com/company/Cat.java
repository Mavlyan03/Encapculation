package com.company;

public class Cat {
    private String name;
    private String gender;
    private String colour;
    private int age;

    public String getName() {
        return "Name of cat: " + name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return  gender;
    }
    public void setGender(String gender) {
       if (gender == "male" || gender == "Male") {
           System.out.println("Gender of cat: ");
       } else if (gender == "female" || gender == "Female") {
           System.out.println("Gender of cat: ");
        } else {
            System.out.println("Wrong gender: ");
        }
        this.gender = gender;
    }
    public String getColour() {
        return "Colour of cat: " + colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setAge (int age) {
        if (age > 50) {
            System.out.println("You enter a wrong age: ");
        } else if (age < 0) {
            System.out.println("You enter a wrong age: ");
        } else {
            System.out.println("Age of cat: ");
        }
        this.age = age;
    }
    public int getAge() {
        return  age;
    }
    public String getHunt() {
        return name + " can hunt to the mouses.";
    }
    public String getPlay() {
        return name + " can play with owner.";
    }

    }

