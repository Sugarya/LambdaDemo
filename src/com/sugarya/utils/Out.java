package com.sugarya.utils;

import java.util.List;

public class Out {

    public static void println(String msg) {
        System.out.println(msg);
    }

    public static <T> void println(List<T> list) {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(t.toString() + "\n");
        }
        println(sb.toString());
    }

    public static void print(String msg) {
        System.out.print(msg);
    }
}
