package com.growingwiththeweb.designpatterns.factorymethod;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactoryMethodTest {
    @Test
    public void testProductFactory1() {
        ProductFactory factory = new Product1Factory();
        Product product = factory.makeProduct();
        assertEquals("com.growingwiththeweb.designpatterns.factorymethod.ConcreteProduct1", product.getClass().getName());
    }

    @Test
    public void testProductFactory2() {
        ProductFactory factory = new Product2Factory();
        Product product = factory.makeProduct();
        assertEquals("com.growingwiththeweb.designpatterns.factorymethod.ConcreteProduct2", product.getClass().getName());
    }
}
