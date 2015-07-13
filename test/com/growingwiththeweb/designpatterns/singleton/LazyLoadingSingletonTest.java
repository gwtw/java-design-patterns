package com.growingwiththeweb.designpatterns.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LazyLoadingSingletonTest {
    @Test
    public void testLazyLoadingSingleton() {
        LazyLoadingSingleton a = LazyLoadingSingleton.getInstance();
        LazyLoadingSingleton b = LazyLoadingSingleton.getInstance();
        assertTrue(a != null);
        assertTrue(b != null);
        assertEquals(a, b);
    }
}
