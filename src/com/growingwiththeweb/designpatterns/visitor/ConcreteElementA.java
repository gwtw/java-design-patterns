package com.growingwiththeweb.designpatterns.visitor;

public class ConcreteElementA implements ElementInterface {
    private String lastVisitedBy;

    @Override
    public void accept(VisitorInterface visitor) {
        visitor.visit(this);
    }

    public String getLastVisitedBy() { return lastVisitedBy; }
    public void setLastVisitedBy(String value) { lastVisitedBy = value; }
}
