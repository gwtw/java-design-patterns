package com.growingwiththeweb.designpatterns.delegation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DelegationTest {
    @Test
    public void testDelegateNotSet() {
        Delegator delegator = new Delegator();
        assertNull(delegator.f());
    }

    @Test
    public void testDelegateA() {
        Delegator delegator = new Delegator();
        delegator.toA();
        assertEquals("Delegate A", delegator.f());
    }

    @Test
    public void testDelegateB() {
        Delegator delegator = new Delegator();
        delegator.toB();
        assertEquals("Delegate B", delegator.f());
    }
}
