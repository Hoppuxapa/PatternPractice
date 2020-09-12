package com.java.singleton;

public class Singleton2 {
    private static volatile Singleton2 instance;
    //Double Checked Locking and volatile
    public static Singleton2 getInstance() {
        Singleton2 localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton2();
                }
            }
        }
        return localInstance;
    }
}
