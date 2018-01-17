package com.sugarya.core.simplefactory;

import com.sugarya.model.Apple;
import com.sugarya.model.Fruit;
import com.sugarya.model.Strawberry;
import java.util.Objects;

public class FruitFactory {

    public static <T extends Fruit> T createFruit(FruitType fruitType) {
        Objects.requireNonNull(fruitType);

        T t;
        switch (fruitType) {
            case Apple:
                t = (T) new Apple();
                break;
            case Strawberry:
                t = (T) new Strawberry();
                break;
            default:
                t = (T) new Fruit();
        }
        return t;
    }

}
