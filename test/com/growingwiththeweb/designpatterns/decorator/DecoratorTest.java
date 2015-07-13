package com.growingwiththeweb.designpatterns.decorator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DecoratorTest {
    @Test
    public void testComponentOperation() {
        ComponentInterface component = new ConcreteComponent();
        assertEquals("Component operation", component.operation());
    }

    @Test
    public void testDecoratorOperation() {
        ComponentInterface component = new ConcreteComponent();
        ComponentInterface decorator = new ConcreteDecorator(component);
        assertEquals("Decorator operation", decorator.operation());
    }
}
