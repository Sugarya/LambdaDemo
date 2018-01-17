package com.sugarya.core.chain;

import com.sugarya.utils.Out;

import java.util.function.Function;

public class ChainClient {

    public static void main(String[] args) {
//        testChain();
        testChainByLambda();
    }

    private static void testChain() {
        FirstNode firstNode = new FirstNode();
        SecondNode secondNode = new SecondNode();
        firstNode.setNextNode(secondNode);

        String handleResult = firstNode.startChain("This is lamda");
        Out.print("chain result = " + handleResult);
    }

    private static void testChainByLambda() {
        Function<String, String> firstNode = s -> "Hello, " + s;
        Function<String, String> secondNode = s -> s.replace("lamda", "lambda");

        Function<String, String> chain = firstNode.andThen(secondNode);
        String result = chain.apply("This is lamda");
        Out.println("chain result = " + result);
    }

}
