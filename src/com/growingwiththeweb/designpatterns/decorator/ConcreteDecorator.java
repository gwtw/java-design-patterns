package com.growingwiththeweb.designpatterns.decorator;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(ComponentInterface component) {
        super(component);
    }

    @Override
    public String operation() {
        return "Decorator operation";
    }
}
