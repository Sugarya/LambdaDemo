package com.sugarya.chain;

public class SecondNode extends AbstractNode<String> {

    @Override
    public String handle(String s) {
        return s.replace("lamda","lambda");
    }
}
