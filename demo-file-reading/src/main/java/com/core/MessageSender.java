package com.core;
import java.util.Arrays;

import com.startegypattern.SendingMethod;

public class MessageSender {
    private SendingMethod method;

    public void setMethod(SendingMethod _method) {
        this.method = _method;
    }

    public void send (String from, String to, String msg) {
        method.send(from, to, msg);
    }

    public int getResult(int[] numbers) {
        if (numbers.length == 0) {
            return Integer.MAX_VALUE;
        }
        Arrays.sort(numbers);
        return numbers[0];
    } 
}
