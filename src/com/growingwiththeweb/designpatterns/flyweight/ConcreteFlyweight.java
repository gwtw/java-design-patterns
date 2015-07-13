package com.growingwiththeweb.designpatterns.flyweight;

public class ConcreteFlyweight implements Flyweight<Integer> {
    private Integer intrinsicState;

    public ConcreteFlyweight(Integer intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public int operation(Integer extrinsicState) {
        return intrinsicState * extrinsicState;
    }
}
