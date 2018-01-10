package com.sugarya;

import com.sugarya.interfaces.IApplePredicate;
import com.sugarya.model.Apple;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class ClientDevelopment {

    private static List<Apple> RAW_APPLE_LIST = new ArrayList<>();

    static {
        RAW_APPLE_LIST.add(new Apple("Green", 133, "福建"));
        RAW_APPLE_LIST.add(new Apple("Green", 155, "福建"));
        RAW_APPLE_LIST.add(new Apple("Green", 160, "福建"));
        RAW_APPLE_LIST.add(new Apple("Green", 138, "广东"));
        RAW_APPLE_LIST.add(new Apple("Green", 143, "广东"));
        RAW_APPLE_LIST.add(new Apple("Red", 175, "福建"));
        RAW_APPLE_LIST.add(new Apple("Red", 210, "台湾"));
        RAW_APPLE_LIST.add(new Apple("Red", 205, "台湾"));
        RAW_APPLE_LIST.add(new Apple("Red", 198, "海南"));
        RAW_APPLE_LIST.add(new Apple("Red", 280, "海南"));
        RAW_APPLE_LIST.add(new Apple("Yellow", 170, "江苏"));
        RAW_APPLE_LIST.add(new Apple("Yellow", 180, "江苏"));
        RAW_APPLE_LIST.add(new Apple("Yellow", 190, "江苏"));
    }


    public static void main(String[] args) {


    }


    /**
     * 筛选绿苹果
     *
     * @param rawAppleList
     * @return
     */
    private static List<Apple> filterGreenApples(List<Apple> rawAppleList) {
        List<Apple> result = new ArrayList<>();
        if (rawAppleList == null || rawAppleList.isEmpty()) {
            return result;
        }
        for (Apple apple : rawAppleList) {
            if ("Green".equalsIgnoreCase(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 筛选任意一颜色的苹果
     *
     * @param rawAppleList
     * @param color
     * @return
     */
    private static List<Apple> filterApplesWithColor(List<Apple> rawAppleList, String color) {
        List<Apple> result = new ArrayList<>();
        if (rawAppleList == null || rawAppleList.isEmpty()) {
            return result;
        }

        for (Apple apple : rawAppleList) {
            if (color.equalsIgnoreCase(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 筛选出大苹果
     *
     * @param rawAppleList
     * @param weight
     * @return
     */
    private static List<Apple> filterApplesWithWeight(List<Apple> rawAppleList, int weight) {
        List<Apple> result = new ArrayList<>();
        if (rawAppleList == null || rawAppleList.isEmpty()) {
            return result;
        }

        for (Apple apple : rawAppleList) {
            if (weight < apple.getWeight()) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 通过颜色和重量筛选苹果
     *
     * @param rawAppleList
     * @param color
     * @param weight
     * @return
     */
    private static List<Apple> filterApplesByProperty(List<Apple> rawAppleList, String color, int weight) {
        List<Apple> result = new ArrayList<>();
        if (rawAppleList == null || rawAppleList.isEmpty()) {
            return result;
        }

        for (Apple apple : rawAppleList) {
            if (color != null && weight > 0) {
                if (weight < apple.getWeight() && color.equalsIgnoreCase(apple.getColor())) {
                    result.add(apple);
                }
            }
        }
        return result;
    }


    /**
     * 筛选苹果
     *
     * @param rawAppleList
     * @param predicate
     * @return
     */
    private static List<Apple> filterApples(List<Apple> rawAppleList, IApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        if (rawAppleList == null || rawAppleList.isEmpty()) {
            return result;
        }
        for (Apple apple : rawAppleList) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 匿名内部类
     */
    private static void testFilterAnonymous() {
        filterApples(RAW_APPLE_LIST, new IApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "Green".equalsIgnoreCase(apple.getColor()) && 150 > apple.getWeight();
            }
        });
    }

    /**
     * lambda表达式
     */
    private static void testFilterApplesLambda() {
        filterApples(RAW_APPLE_LIST, (Apple apple) -> "Green".equalsIgnoreCase(apple.getColor()) && 150 > apple.getWeight());
    }

    /**
     * 智能推断
     */
    private static void testFilterApplesLambda2() {
        filterApples(RAW_APPLE_LIST, apple -> "Green".equalsIgnoreCase(apple.getColor()) && 150 > apple.getWeight());
    }

    /**
     * 相同lambda，不同的返回类型
     */
    private static void testLambdaReturnType() {
        Predicate<Apple> appleFilter = (Apple apple) -> "Green".equalsIgnoreCase(apple.getColor()) && 150 > apple.getWeight();
        Function<Apple, Boolean> appleFilter1 = (Apple apple) -> "Green".equalsIgnoreCase(apple.getColor()) && 150 > apple.getWeight();
    }

}
