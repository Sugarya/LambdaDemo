package com.sugarya.model;

public class Strawberry extends Fruit {

    private int weight;
    private String color;
    private int sweetness;

    public Strawberry() {
    }

    public Strawberry(int weight) {
        this.weight = weight;
    }

    public Strawberry(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Strawberry(int weight, String color, int sweetness) {
        this.weight = weight;
        this.color = color;
        this.sweetness = sweetness;
    }

    public Integer getWeight() {
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

    public int getSweetness() {
        return sweetness;
    }

    public void setSweetness(int sweetness) {
        this.sweetness = sweetness;
    }

    public void displayWeight(){
        System.out.println("weight = " + weight);
    }

    @Override
    public String toString() {
        return "Strawberry{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", sweetness=" + sweetness +
                '}';
    }
}
