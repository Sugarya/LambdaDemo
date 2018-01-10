package com.sugarya.core;

import com.sugarya.model.Strawberry;
import com.sugarya.utils.Out;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 练习题
 */
public class StrawberryTestClient {

    private static List<Strawberry> RAW_STRAWBERRY_LIST = new ArrayList<>();

    static {
        RAW_STRAWBERRY_LIST.add(new Strawberry(20));
        RAW_STRAWBERRY_LIST.add(new Strawberry(31));
        RAW_STRAWBERRY_LIST.add(new Strawberry(22));
        RAW_STRAWBERRY_LIST.add(new Strawberry(26));
        RAW_STRAWBERRY_LIST.add(new Strawberry(29));
        RAW_STRAWBERRY_LIST.add(new Strawberry(38));
        RAW_STRAWBERRY_LIST.add(new Strawberry(35));
        RAW_STRAWBERRY_LIST.add(new Strawberry(45));
    }

    public static void main(String[] args) {
        Collections.sort(RAW_STRAWBERRY_LIST, (strawberry1, strawberry2) -> strawberry2.getWeight() - strawberry1.getWeight());
        Out.println("我想吃最大的草莓是 = " + RAW_STRAWBERRY_LIST.get(0).toString());
    }


}
