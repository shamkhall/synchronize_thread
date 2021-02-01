

package com.company;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread[] threads = new Thread[100];

        for (int i = 0 ; i < 100; i++){
            threads[i] = new Thread(new MyConsumer());
        }
        for (int i = 0 ; i < 100; i++){
            threads[i].start();
        }

        Thread.sleep(5000);
        System.out.println("Main base.a: " + Base.getA());

    }
}
