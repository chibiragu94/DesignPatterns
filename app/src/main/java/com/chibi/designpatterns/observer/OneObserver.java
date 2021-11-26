package com.chibi.designpatterns.observer;

import android.util.Log;

public class OneObserver implements Observer{
    @Override
    public void update(String message) {
        Log.d("OneObserver",message);
    }
}
