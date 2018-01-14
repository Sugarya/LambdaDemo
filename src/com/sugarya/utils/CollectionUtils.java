package com.sugarya.utils;

import com.sugarya.interfaces.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class CollectionUtils {

    public static <T> T getMax(List<T> list, Comparator<T> comparator) {
        Objects.requireNonNull(list);

        Iterator<T> iterator = list.iterator();
        T result = iterator.next();
        while (iterator.hasNext()) {
            T next = iterator.next();
            int value = comparator.compare(result, next);
            if (value > 0) {
                result = next;
            }
        }
        return result;
    }

    public static <T> T getMax(List<T> list, Function<T, Integer> compare) {
        return getMax(list, comparing(compare));
    }

    private static <T> com.sugarya.interfaces.Comparator<T> comparing(Function<T, Integer> function) {
        return (T t1, T t2) -> function.apply(t1) - function.apply(t2);
    }
}
