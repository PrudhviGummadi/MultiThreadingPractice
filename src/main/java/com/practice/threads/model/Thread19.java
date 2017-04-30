package com.practice.threads.model;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Thread19 implements Runnable {

  private final ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

  private final Random random = new Random();

  @Override
  public void run() {
    int value = random.nextInt();
    System.out.println(Thread.currentThread().getName() + " stored value is:" + value);
    threadLocal.set(value);
    try {
      System.out.println(Thread.currentThread().getName() + " is sleeping");
      TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    System.out.println(Thread.currentThread().getName() + " woke up from sleep");
    System.out.println(Thread.currentThread().getName() + " value is " + threadLocal.get());
  }

}
