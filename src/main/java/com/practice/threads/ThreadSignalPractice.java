package com.practice.threads;

import com.practice.threads.model.Thread21;
import com.practice.threads.model.Thread22;
import com.practice.threads.model.WaitNotify;

public class ThreadSignalPractice {

  /*
   * wait notify practice. In this example there is a chance of missing signals
   */
  public static void main(String[] args) throws InterruptedException {
    WaitNotify waitNotify = new WaitNotify();

    Thread thread1 = new Thread21("Thread1", waitNotify);
    Thread thread2 = new Thread22("Thread2", waitNotify);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

  }

}
