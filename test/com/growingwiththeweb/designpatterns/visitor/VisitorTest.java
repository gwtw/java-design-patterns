package com.growingwiththeweb.designpatterns.visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class VisitorTest {
    @Test
    public void testLastVisitedByNotSet() {
        ConcreteElementA elementA = new ConcreteElementA();
        assertNull(elementA.getLastVisitedBy());
        ConcreteElementB elementB = new ConcreteElementB();
        assertNull(elementB.getLastVisitedBy());
    }

    @Test
    public void testVisitingA() {
        ConcreteElementA element = new ConcreteElementA();
        element.accept(new ConcreteVisitor1());
        assertEquals("ConcreteVisitor1", element.getLastVisitedBy());
        element.accept(new ConcreteVisitor2());
        assertEquals("ConcreteVisitor2", element.getLastVisitedBy());
    }

    @Test
    public void testVisitingB() {
        ConcreteElementB element = new ConcreteElementB();
        element.accept(new ConcreteVisitor1());
        assertEquals("ConcreteVisitor1", element.getLastVisitedBy());
        element.accept(new ConcreteVisitor2());
        assertEquals("ConcreteVisitor2", element.getLastVisitedBy());
    }
}
