package com.startegypattern;

public class  SmsSendingMethod implements SendingMethod {

    @Override
    public void send(String from, String to, String msg) {
        System.out.println(String.format("send SMS from '%s' to '%s' -- Message content: '%s'", from, to, msg));
    }
}
