package com.growingwiththeweb.designpatterns.flyweight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FlyweightTest {
    @Test
    public void testCacheSingleObject() {
        FlyweightFactory factory = new FlyweightFactory();
        assertEquals(factory.get(1), factory.get(1));
    }

    @Test
    public void testCacheMultipleObjects() {
        FlyweightFactory factory = new FlyweightFactory();
        assertEquals(factory.get(1), factory.get(1));
        assertEquals(factory.get(2), factory.get(2));
        assertEquals(factory.get(3), factory.get(3));
    }

    @Test
    public void testFlyweightOperation() {
        FlyweightFactory factory = new FlyweightFactory();
        ConcreteFlyweight flyweight = factory.get(20);
        assertEquals(100, flyweight.operation(5));
    }
}
