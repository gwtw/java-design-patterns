package com.growingwiththeweb.designpatterns.delegation;

public class Delegator implements DelegationInterface {
    private DelegationInterface delegate;

    public String f() {
        if (delegate == null) {
            return null;
        }
        return delegate.f();
    }

    public void toA() { delegate = new DelegateA(); }
    public void toB() { delegate = new DelegateB(); }
}
