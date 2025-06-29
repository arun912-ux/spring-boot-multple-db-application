package com.example.multipledatabaseapp.example;

import org.springframework.stereotype.Component;

@Component
public class Example extends Thread{

    @Override
    public void run() {
        super.run();
    }

    public void doSomething() {
        Example example = new Example();
        example.start();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // do something
            }
        });

        thread.start();
        thread.run();
        try {
            thread.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.notify();

    }

}
