package com.sugarya.core.chain;

public class SecondNode extends AbstractNode<String> {

    @Override
    public String handle(String s) {
        return s.replace("lamda","lambda");
    }
}
