package com.chibi.designpatterns.decorator;

import android.util.Log;

public class WhatsAppMessage implements Messaging{
    @Override
    public String sendMessage() {
        Log.v("WhatsAppMessage","sendMessage");
        return "";
    }

    @Override
    public String replyMessage() {
        Log.v("WhatsAppMessage","replyMessage");
        return "";
    }
}
