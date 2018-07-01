package com.nilezam.java.sandbox.concurrency;

public class ThreadUtil {

    public static String withThreadName(String text) {
        return Thread.currentThread().getName() +  " - " +text;
    }



}
