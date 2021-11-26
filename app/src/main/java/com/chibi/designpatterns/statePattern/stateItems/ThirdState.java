package com.chibi.designpatterns.statePattern.stateItems;

import android.util.Log;

import com.chibi.designpatterns.statePattern.SateContext;
import com.chibi.designpatterns.statePattern.State;

public class ThirdState implements State {
    @Override
    public void updateState(SateContext context) {
        Log.v("ThirdState"," Completed...");
        context.setCurrentState(new FourthState());
    }
}
