package com.omagle.omagle;

import com.google.firebase.messaging.RemoteMessage;

import java.util.Date;

/**
 * Created by Michael on 10/30/16.
 */

public class Message {
    private String text;
    private Date date;
    private String uID;
    private boolean sentMessage;

    public Message(String text, Date date, String uID, boolean sentMessage){
        this.text = text;
        this.date = date;
        this.uID = uID;
        this.sentMessage = sentMessage;
    }

    public Message (String text, boolean sentMessage){
        this.sentMessage = sentMessage;
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

}
