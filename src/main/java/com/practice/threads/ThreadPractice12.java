package com.practice.threads;

import com.practice.threads.model.Thread17;

public class ThreadPractice12 {

  public static void main(String[] args) throws InterruptedException {

    Object lock = new Object();

    Thread thread1 = new Thread17("17th 1st thread", lock);
    Thread thread2 = new Thread17("17th 2nd thread", lock);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println(Thread.currentThread().getName() + " is exiting");

  }

}
