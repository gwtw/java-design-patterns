package com.growingwiththeweb.designpatterns.facade;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FacadeTest {
    @Test
    public void testFacade() {
        Facade facade = new Facade();
        assertEquals("Class1 Class2", facade.doSomething());
    }
}
