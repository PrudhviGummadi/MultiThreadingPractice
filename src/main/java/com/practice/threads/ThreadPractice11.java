package com.practice.threads;

import com.practice.threads.model.Thread16;

public class ThreadPractice11 {

  public static void main(String[] args) throws InterruptedException {

    final long sleep = 2000;//

    Thread thread1 = new Thread16("16th 1st thread", sleep);
    Thread thread2 = new Thread16("16th 2nd thread ", sleep);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println(Thread.currentThread().getName() + " is exiting");

  }

}
