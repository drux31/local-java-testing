package com.test;

import com.core.MessageSender;
import com.startegypattern.EmailSendingMethod;
import com.startegypattern.SmsSendingMethod;


public class Main {

    public static void main(String[] args) {

        MessageSender sender = new MessageSender(); // create a message sender

        sender.setMethod(new EmailSendingMethod()); // set a concrete sending method

        sender.send("alice@gmail.com", "bob@gmail.com", "Hello!");

        sender.setMethod(new SmsSendingMethod()); // set another sending method

        sender.send("1-541-444-3333", "1-541-555-2222", "Hello!");
            
    }
}