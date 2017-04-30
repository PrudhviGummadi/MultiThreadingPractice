package com.practice.threads;

import com.practice.threads.model.Thread16;
import com.practice.threads.model.Thread17;

public class ThreadPractice11 {

  public static void main(String[] args) throws InterruptedException {

    Thread thread1 = new Thread16("16th thread");
    Thread thread2 = new Thread17("17th thread ");

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println(Thread.currentThread().getName() + " is exiting");

  }

}
