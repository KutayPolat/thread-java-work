package com.helloWorld;

public class FirstThread {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are in the thread : " + Thread.currentThread().getName());
                System.out.println("Current thread priority : " + Thread.currentThread().getPriority());
            }
        });

        thread.setName("New Thread Name");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("before started the thread : " + Thread.currentThread().getName());
        thread.start();
        System.out.println("after started the thread : " + Thread.currentThread().getName());

        Thread.sleep(1000);
    }
}
