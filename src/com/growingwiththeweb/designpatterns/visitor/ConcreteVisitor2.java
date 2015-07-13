package com.growingwiththeweb.designpatterns.visitor;

import java.util.logging.Logger;

public class ConcreteVisitor2 implements VisitorInterface {
    @Override
    public void visit(ConcreteElementA element) {
        element.setLastVisitedBy("ConcreteVisitor2");
    }

    @Override
    public void visit(ConcreteElementB element) {
        element.setLastVisitedBy("ConcreteVisitor2");
    }
}
