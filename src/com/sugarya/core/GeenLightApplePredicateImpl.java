package com.sugarya.core;

import com.sugarya.interfaces.IApplePredicate;
import com.sugarya.model.Apple;

/**
 * 判断 绿色并且轻的苹果
 */
public class GeenLightApplePredicateImpl implements IApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "Green".equalsIgnoreCase(apple.getColor()) && 150 > apple.getWeight();
    }
}
