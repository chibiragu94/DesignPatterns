package com.chibi.designpatterns.statePattern.stateItems;

import android.util.Log;

import com.chibi.designpatterns.statePattern.SateContext;
import com.chibi.designpatterns.statePattern.State;

public class FirstState implements State {

    @Override
    public void updateState(SateContext context) {
        Log.v("FirstState"," Completed...");
        context.setCurrentState(new SecondState());
    }
}
