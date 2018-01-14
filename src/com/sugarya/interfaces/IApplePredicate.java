package com.sugarya.interfaces;

import com.sugarya.model.Apple;

@FunctionalInterface
public interface IApplePredicate {

    boolean test(Apple apple);


}
