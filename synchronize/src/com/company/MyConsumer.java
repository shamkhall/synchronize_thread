package com.company;

public class MyConsumer implements Runnable{ // extend etmek olur +dur

    @Override
    public void run(){
        System.out.println("I am started");
        try {

            Thread.sleep(2000);


        } catch (InterruptedException e) {

        }

        Base.intA();

    }
}
