package com.nilezam.java.sandbox.concurrency;

public class SimpleThread extends Thread {


    @Override
    public void run() {

        try {
            System.out.println(ThreadUtil.withThreadName(" Running Thread!"));

            Thread.sleep(2000);

            System.out.println(ThreadUtil.withThreadName("End of thread!"));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        SimpleThread thread = new SimpleThread();

        System.out.println(ThreadUtil.withThreadName("Hello I'm main"));
        //calls in current thread
        thread.run();
        //calls in new thread
        thread.start();
        System.out.println(ThreadUtil.withThreadName("Hello I'm main"));

    }
}
