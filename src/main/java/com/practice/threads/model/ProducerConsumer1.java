package com.practice.threads.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ProducerConsumer1 {

  private final List<Integer> values = new ArrayList<>();

  private final Object lock = new Object();

  public void produce() {
    synchronized (lock) {
      System.out.println(Thread.currentThread().getName() + " inside produce method");
      Random random = new Random();
      int value = random.nextInt();
      System.out.println("Values stored in the list: " + value);
      values.add(value);
      lock.notify();
    }
  }

  public void consume() {
    synchronized (lock) {
      System.out.println(Thread.currentThread().getName() + " inside consume method");
      try {
        TimeUnit.SECONDS.sleep(2);

        while (values.isEmpty()) {
          lock.wait();
        }

        int value = values.remove(0);
        System.out.println("value: " + value + ", list size: " + values.size());

      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }
}
