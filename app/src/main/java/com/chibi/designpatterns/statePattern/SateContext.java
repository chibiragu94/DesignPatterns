package com.chibi.designpatterns.statePattern;

import com.chibi.designpatterns.statePattern.stateItems.FirstState;

public class SateContext {
    private State currentState;
    private String anyIdentityValue;

    public SateContext(State currentState, String anyIdentityValue) {
        if (null == currentState)
        {
            //initial state
            this.currentState = new FirstState();
        }else {
            this.currentState = currentState;
        }
        this.anyIdentityValue = anyIdentityValue;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public String getAnyIdentityValue() {
        return anyIdentityValue;
    }

    public void setAnyIdentityValue(String anyIdentityValue) {
        this.anyIdentityValue = anyIdentityValue;
    }

    public void updateState()
    {
        currentState.updateState(this);
    }
}
