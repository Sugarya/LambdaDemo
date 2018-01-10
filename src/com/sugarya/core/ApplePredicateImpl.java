package com.sugarya.core;

import com.sugarya.interfaces.IApplePredicate;
import com.sugarya.model.Apple;

public class ApplePredicateImpl implements IApplePredicate {

    @Override
    public boolean test(Apple apple) {
        if(apple == null){
            return false;
        }

        if("Red".equalsIgnoreCase(apple.getColor())
                && 150 < apple.getWeight()
                && "福建".equals(apple.getProducingArea())){
            return true;
        }
        return false;
    }
}
