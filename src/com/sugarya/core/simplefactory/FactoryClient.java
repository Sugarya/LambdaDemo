package com.sugarya.core.simplefactory;

import com.sugarya.model.Apple;
import com.sugarya.model.Strawberry;
import com.sugarya.utils.Out;

public class FactoryClient {

    public static void main(String[] args) {
        testSimpleFactory();
    }

    private static void testSimpleFactory() {
        Apple apple = FruitFactory.createFruit(FruitType.Apple);
        Out.println(apple.toString());
    }

    private static void testSimpleFactoryByLambda(){
        Strawberry strawberry = FruitFactory2.createFruit(FruitType.Strawberry);
        Out.println(strawberry.toString());
    }
}
