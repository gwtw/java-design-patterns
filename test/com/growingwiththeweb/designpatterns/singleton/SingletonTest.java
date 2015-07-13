package com.growingwiththeweb.designpatterns.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SingletonTest {
    @Test
    public void testSingleton() {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        assertTrue(a != null);
        assertTrue(b != null);
        assertEquals(a, b);
    }
}
