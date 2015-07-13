package com.growingwiththeweb.designpatterns.flyweight;

public interface Flyweight<S> {
    public int operation(S extrinsicState);
}
