package com.sugarya.chain;

public class FirstNode extends AbstractNode<String> {

    @Override
    public String handle(String s) {
        return "Hello, " + s;
    }
}
