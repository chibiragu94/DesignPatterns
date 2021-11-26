package com.chibi.designpatterns.observer;

import android.util.Log;

public class TwoObserver implements Observer{
    @Override
    public void update(String message) {
        Log.d("TwoObserver",message);
    }
}
