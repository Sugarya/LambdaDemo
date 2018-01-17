package com.sugarya.model;

import java.util.Objects;

public class Apple extends Fruit {

    private String color;
    private int weight;
    private String producingArea;

    public Apple() {
    }

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Apple(String color, int weight, String producingArea) {
        this.color = color;
        this.weight = weight;
        this.producingArea = producingArea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getProducingArea() {
        return producingArea;
    }

    public void setProducingArea(String producingArea) {
        this.producingArea = producingArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return weight == apple.weight &&
                Objects.equals(color, apple.color) &&
                Objects.equals(producingArea, apple.producingArea);
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, weight, producingArea);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", producingArea='" + producingArea + '\'' +
                '}';
    }
}
