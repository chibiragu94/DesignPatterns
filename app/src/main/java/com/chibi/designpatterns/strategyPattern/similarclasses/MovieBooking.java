package com.chibi.designpatterns.strategyPattern.similarclasses;

import android.util.Log;

import com.chibi.designpatterns.strategyPattern.Booking;

public class MovieBooking implements Booking {
    @Override
    public void showPaymentConfirmation(String message) {
        Log.v("MovieBooking",message);
    }
}
