package com.sugarya.core.simplefactory;

import com.sugarya.model.Apple;
import com.sugarya.model.Fruit;
import com.sugarya.model.Strawberry;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public class FruitFactory2 {

    private static Map<FruitType, Supplier<? extends Fruit>> FRUIT_MAP = new HashMap<>();

    static {
        FRUIT_MAP.put(FruitType.Apple, Apple::new);
        FRUIT_MAP.put(FruitType.Strawberry, Strawberry::new);
    }

    public static <T extends Fruit> T createFruit(FruitType fruitType) {
        Objects.requireNonNull(fruitType);
        return (T)FRUIT_MAP.get(fruitType).get();
    }

}
