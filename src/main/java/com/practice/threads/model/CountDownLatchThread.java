package com.practice.threads.model;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchThread extends Thread {

  private final CountDownLatch latch;

  public CountDownLatchThread(String name, CountDownLatch latch){
    super(name);
    this.latch=latch;
  }

  @Override
  public void run() {
    try {
      System.out.println(Thread.currentThread().getName() + " is running");
      System.out.println(Thread.currentThread().getName() + " is going to sleep");
      TimeUnit.SECONDS.sleep(2);
      System.out.println(Thread.currentThread().getName() + " is wakeup from sleep");
    } catch (InterruptedException ex) {

    } finally {
      latch.countDown();
    }
  }

}
