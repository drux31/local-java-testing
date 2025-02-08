package com.commons;

public class NumbersThread extends Thread {

    private int upperRange;
    private int lowerRange;

    public NumbersThread (int from, int to) {
        upperRange = to;
        lowerRange = from;
    }

    @Override
    public void run() {
        for (int i = lowerRange; i<=upperRange; i++) {
            System.out.println(i);
        }
    }
    
}
