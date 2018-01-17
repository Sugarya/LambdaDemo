package com.sugarya.core;

import com.sugarya.interfaces.Comparator;
import com.sugarya.interfaces.Task;
import com.sugarya.model.Strawberry;
import com.sugarya.utils.CollectionUtils;
import com.sugarya.utils.Out;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * 练习题
 */
public class Practice2Client {

    private int temp;

    private static List<Strawberry> RAW_STRAWBERRY_LIST = new ArrayList<>();

    static {
        RAW_STRAWBERRY_LIST.add(new Strawberry(20, "Red", 101));
        RAW_STRAWBERRY_LIST.add(new Strawberry(31, "Red", 120));
        RAW_STRAWBERRY_LIST.add(new Strawberry(22, "Green", 68));
        RAW_STRAWBERRY_LIST.add(new Strawberry(26, "Red", 89));
        RAW_STRAWBERRY_LIST.add(new Strawberry(29, "Red", 102));
        RAW_STRAWBERRY_LIST.add(new Strawberry(35, "Red", 109));

        RAW_STRAWBERRY_LIST.add(new Strawberry(38, "Red", 133));

        RAW_STRAWBERRY_LIST.add(new Strawberry(45, "Green", 76));
        RAW_STRAWBERRY_LIST.add(new Strawberry(45, "Red", 118));
    }

    public static void main(String[] args) {
        CollectionUtils.getMax(RAW_STRAWBERRY_LIST, new Comparator<Strawberry>() {
            @Override
            public int compare(Strawberry t1, Strawberry t2) {
                return 0;
            }
        });
    }

    private static void filterVersion1() {
        Strawberry strawberry = CollectionUtils.getMax(RAW_STRAWBERRY_LIST,
                (Strawberry b1, Strawberry b2) -> b2.getWeight() - b1.getWeight());
        Out.println("我想吃最大的草莓是：");
        Out.println(strawberry.toString());
    }

    private static int getComparator(Strawberry b1, Strawberry b2) {
        return b2.getWeight() - b1.getWeight();
    }

    private static void filterVersion2() {
        Strawberry strawberry = CollectionUtils.getMax(RAW_STRAWBERRY_LIST,
                Practice2Client::getComparator);
        Out.println("我想吃最大的草莓是：");
        Out.println(strawberry.toString());
    }

    private static com.sugarya.interfaces.Comparator<Strawberry> comparing(Function<Strawberry, Integer> function) {
        return (Strawberry b1, Strawberry b2) -> function.apply(b2) - function.apply(b1);
    }

    private static void filterVersion3() {
        Strawberry strawberry = CollectionUtils.getMax(RAW_STRAWBERRY_LIST,
                comparing(Strawberry::getWeight));
        Out.println("我想吃最大的草莓是：");
        Out.println(strawberry.toString());
    }

    /**
     * 找到最甜的草莓
     */
    private static void filterVersion4() {
        Strawberry strawberry = CollectionUtils.getMax(RAW_STRAWBERRY_LIST,
                comparing(Strawberry::getSweetness));
        Out.println("我想吃最甜的草莓是：");
        Out.println(strawberry.toString());
    }

    private static com.sugarya.interfaces.Comparator<Strawberry> comparing(Function<Strawberry, Integer> function, Function<Strawberry, Integer> function2) {
        return (Strawberry b1, Strawberry b2) -> function.apply(b2) - function.apply(b1) == 0 ? function2.apply(b2) - function2.apply(b1) : function.apply(b2) - function.apply(b1);
    }

    /**
     * 找到最大的草莓，如果一样大，就要其中最甜的
     */
    private static void filterVersion5() {
        Strawberry strawberry = CollectionUtils.getMax(RAW_STRAWBERRY_LIST,
                comparing(Strawberry::getWeight, Strawberry::getSweetness));
        Out.println("我想吃最甜的草莓是：");
        Out.println(strawberry.toString());
    }

    /**
     * 找到最大的草莓，如果一样大，就要其中最甜的
     */
    private static void filterVersion6() {
        Strawberry strawberry = CollectionUtils.getMax(RAW_STRAWBERRY_LIST,
                Comparator.comparing(Strawberry::getWeight, Strawberry::getSweetness));
        Out.println("我想吃最大而且甜的草莓是：");
        Out.println(strawberry.toString());
    }

    /**
     * 最大的草莓，如果一样大，就要其中最甜的
     */
    private static void filterVersion7() {
        Strawberry strawberry = CollectionUtils.getMax(RAW_STRAWBERRY_LIST,
                Comparator.comparing(Strawberry::getWeight).thenCompare(Strawberry::getSweetness));
        Out.println("我想吃最甜的草莓是：");
        Out.println(strawberry.toString());
    }



}
