package com.sugarya.interfaces;

import java.util.function.ToIntFunction;

@FunctionalInterface
public interface Comparator<T> {

    int compare(T t1, T t2);

    static <E> Comparator<E> comparing(ToIntFunction<E> function) {
        return (E b1, E b2) -> function.applyAsInt(b2) - function.applyAsInt(b1);
    }

    static <E> Comparator<E> comparing(ToIntFunction<E> function, ToIntFunction<E> function2) {
        return (E b1, E b2) -> function.applyAsInt(b2) - function.applyAsInt(b1) == 0 ? function2.applyAsInt(b2) - function2.applyAsInt(b1) : function.applyAsInt(b2) - function.applyAsInt(b1);
    }

    default Comparator<T> thenCompare(ToIntFunction<T> function){
        return (T t1, T t2) -> compare(t1, t2) == 0 ? Comparator.comparing(function).compare(t1, t2) : compare(t1, t2);
    }

}
