package com.chibi.designpatterns.decorator;

import android.util.Log;

//Decorator design pattern is used to add the additional functionality to the exciting
// classes or object
//with out changing the actual implementation
//Here we have added the from sender name to the send / reply message without the changing
// the actual implementation
public class MessageDecorator implements Messaging{

    private Messaging messaging;

    public MessageDecorator(Messaging messaging) {
        this.messaging = messaging;
    }

    @Override
    public String sendMessage() {
        String d = messaging.sendMessage();
        return "From : Sender Name - "+d;
    }

    @Override
    public String replyMessage() {
        String d = messaging.replyMessage();
        return "From : Sender Name - "+d;
    }
}
