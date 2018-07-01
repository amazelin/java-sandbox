package com.nilezam.java.sandbox.concurrency;

public class RunnableThread implements Runnable {

    public void run() {
        try {
            System.out.println(ThreadUtil.withThreadName("Starting thread!"));
            Thread.sleep(2000);
            System.out.println((ThreadUtil.withThreadName("End of thread!")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Runnable wrongRunnable = new RunnableThread();
        System.out.println(ThreadUtil.withThreadName("Hello World"));
        //Start in current main thread
        wrongRunnable.run();

        //Start a thread!
        final RunnableThread goodRunnable = new RunnableThread();
        Thread thread = new Thread(goodRunnable);
        thread.start();

        System.out.println(ThreadUtil.withThreadName("Hello World again"));
    }
}
