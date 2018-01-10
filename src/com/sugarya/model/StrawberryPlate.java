package com.sugarya.model;

public class StrawberryPlate extends Plate{

    private Strawberry strawberry;

    public StrawberryPlate(Strawberry strawberry) {
        this.strawberry = strawberry;
    }

    public Strawberry getStrawberry() {
        return strawberry;
    }

    public void setStrawberry(Strawberry strawberry) {
        this.strawberry = strawberry;
    }

    @Override
    public String toString() {
        return "StrawberryPlate{" +
                "strawberry=" + strawberry +
                '}';
    }
}
