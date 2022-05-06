package com.company;

public class Fish {
    private String type;
    private int weight;
    private int price;

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return "Type of fish: " + type;
    }
    public void setWeight(int weight) {
        if (weight < 0) {
            System.out.println("Weight too little: " );
        } else if (weight > 15) {
            System.out.println("Weight too big: " );
        } else {
            System.out.println("Weight normal: " );
        }
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void setPrice(int price) {
        if ( price< 10) {
            System.out.println("Price expensive: " );
        } else if (price > 1000) {
            System.out.println("Price cheap: ");
        } else {
            System.out.println("Price normal: ");
        }
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public String getSwim() {
        return "Fishes very healthy for health.";
    }
}
