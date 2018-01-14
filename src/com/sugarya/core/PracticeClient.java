package com.sugarya.core;

import com.sugarya.model.Strawberry;
import com.sugarya.utils.Out;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * 练习题
 */
public class PracticeClient {

    private static List<Strawberry> RAW_STRAWBERRY_LIST = new ArrayList<>();

    static {
        RAW_STRAWBERRY_LIST.add(new Strawberry(20, "Red"));
        RAW_STRAWBERRY_LIST.add(new Strawberry(31, "Red"));
        RAW_STRAWBERRY_LIST.add(new Strawberry(22, "Green"));
        RAW_STRAWBERRY_LIST.add(new Strawberry(26, "Red"));
        RAW_STRAWBERRY_LIST.add(new Strawberry(29, "Red"));
        RAW_STRAWBERRY_LIST.add(new Strawberry(38, "Red"));
        RAW_STRAWBERRY_LIST.add(new Strawberry(35, "Red"));

        RAW_STRAWBERRY_LIST.add(new Strawberry(45, "Green"));
        RAW_STRAWBERRY_LIST.add(new Strawberry(45, "Red"));
    }

    public static void main(String[] args) {
        filter();
    }

    private static void filter() {
        Collections.sort(RAW_STRAWBERRY_LIST, (strawberry1, strawberry2)
                -> strawberry2.getWeight() - strawberry1.getWeight());
        Out.println("1 我想吃最大的草莓是:");
        Out.println(RAW_STRAWBERRY_LIST.get(0).toString());
    }


}
