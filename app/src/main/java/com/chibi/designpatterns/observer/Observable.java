package com.chibi.designpatterns.observer;

import java.util.ArrayList;

//Observer pattern is behavioral pattern
//Here many objects can subscribe to the single subject, so one - many relationship like publish - subscriber pattern
//so one changes in the subject will reflect to the all the observers
//advantage is loosely coupled

public class Observable implements Subject{

    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String value) {
        for (Observer o : observers) {
            o.update(value);
        }
    }
}
