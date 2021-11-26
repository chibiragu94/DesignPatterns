package com.chibi.designpatterns.strategyPattern;

//This pattern can be used for changing the algorithm / functions during the run time
//This can be achieved by creating the pattern with the classes that having the same similarities
public class StrategyContext {

    private Booking booking;

    public StrategyContext(Booking booking) {
        this.booking = booking;
    }

    public void executeOperation(String message)
    {
        booking.showPaymentConfirmation(message);
    }


}
