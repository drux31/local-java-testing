package com.commons;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from " + getName());
    }
}
