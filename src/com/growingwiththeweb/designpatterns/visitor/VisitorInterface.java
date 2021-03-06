package com.growingwiththeweb.designpatterns.visitor;

public interface VisitorInterface {
    public void visit(ConcreteElementA element);
    public void visit(ConcreteElementB element);
}
