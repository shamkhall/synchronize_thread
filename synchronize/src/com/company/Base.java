package com.company;


public class Base {
    private static volatile int a = 0;

    public static int getA(){
        return a;
    }

    public synchronized static void intA(){
        a++;
    }
}


