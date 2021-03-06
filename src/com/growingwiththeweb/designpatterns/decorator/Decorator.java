package com.growingwiththeweb.designpatterns.decorator;

public abstract class Decorator implements ComponentInterface {
    private ComponentInterface component;

    public Decorator(ComponentInterface component) {
        this.component = component;
    }

    protected ComponentInterface getComponent() {
        return component;
    }
}
