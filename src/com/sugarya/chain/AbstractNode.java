package com.sugarya.chain;

public abstract class AbstractNode<T> {

    private AbstractNode<T> nextNode;


    public T startChain(T t){
        T element = handle(t);
        if(nextNode != null){
            return nextNode.handle(element);
        }
        return t;
    }



    public AbstractNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(AbstractNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public abstract T handle(T t);

}
