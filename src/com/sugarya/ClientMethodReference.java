package com.sugarya;

import com.sugarya.interfaces.Task;
import com.sugarya.model.Strawberry;
import com.sugarya.utils.Out;
import com.sugarya.utils.TransferUtils;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ClientMethodReference {


    public static void main(String[] args) {
//        testMRForNew0();
//        testMRForNew2();
//        testMRForNew3();
//        testMRStatic();
//        testMRObject();
        testMRObject2();
    }

    /**
     * 静态方法引用
     */
    private static void testMRStatic() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> collect = list.stream()
                .map(TransferUtils::doubleValue)
                .collect(Collectors.toList());
        println(collect);
    }

    /**
     * 实例引用无参方法
     */
    private static void testMRObject() {
        Arrays.asList(new Strawberry(21), new Strawberry(23))
                .forEach(Strawberry::displayWeight);

    }

    /**
     * 实例引用有参方法
     */
    private static void testMRObject2() {
        TransferUtils transferUtils = new TransferUtils();
        Arrays.asList(1, 2, 3, 4).forEach(transferUtils::tripleOver);
    }


    /**
     * 构造方法引用
     */
    private static void testMRForNew2() {
        BiFunction<Integer, String, Strawberry> biFunction = Strawberry::new;
        Strawberry strawberry = biFunction.apply(20, "RED");
        Out.println(strawberry.toString());
    }

    private static void testMRForNew1() {
        IntFunction<Strawberry> f = Strawberry::new;
        Strawberry strawberry = f.apply(10);
        Out.println("weight = " + strawberry.getWeight());
    }

    private static void testMRForNew0() {
        Supplier<Strawberry> strawberrySupplier = Strawberry::new;
        Strawberry strawberry = strawberrySupplier.get();
    }


    private static Double integrate(DoubleFunction<Double> f, double a, double b) {
        return f.apply(a) + f.apply(b) * Math.abs(b - a) / 2;
    }


    private static void testLambda() {
        testLambdaSign((Task) () -> {
            Out.println("");
        });
    }

    private static void testLambdaSign(Runnable runnable) {
        Out.println("testLambdaSign Runnable");
    }

    private static void testLambdaSign(Task task) {
        Out.println("testLambdaSign task");
    }


    private static <T> void println(List<T> list) {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(t.toString() + "\n");
        }
        Out.println(sb.toString());
    }


}
