package com.sugarya.model;

public class Strawberry {

    private int weight;
    private String color;

    public Strawberry() {
    }

    public Strawberry(int weight) {
        this.weight = weight;
    }

    public Strawberry(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayWeight(){
        System.out.println("weight = " + weight);
    }

    @Override
    public String toString() {
        return "Strawberry{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
