package com.practice.threads;

import com.practice.threads.model.Thread18;

public class ThreadSleepPractice1 {

  public static void main(String[] args) throws InterruptedException {

    Thread thread1 = new Thread18("thread1");
    Thread thread2 = new Thread18("thread2");

    thread1.start();
    thread2.start();
    thread1.sleep(2000);
    thread2.sleep(2000);

    System.out.println("Added this line to check whether the sleep in invoked on main or thread1 or thread2?");
    System.out.println("Ans: Sleep is invoked on the main thread but not on thread1 or thread 2");

    thread1.join();
    thread2.join();

    System.out.println(Thread.currentThread().getName() + " is exiting");

  }

}
