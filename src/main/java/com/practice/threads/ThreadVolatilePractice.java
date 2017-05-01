package com.practice.threads;

import com.practice.threads.model.Counter;
import com.practice.threads.model.Thread24;

public class ThreadVolatilePractice {

  /**
   * volatile keyword is used to read/write directly from memory but doesn't guarantee thread safe.We need to
   * use synchronized along with volatile accordingly
   *
   * @param args
   * @throws InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();

    Thread thread1 = new Thread24("Thread1", counter);
    Thread thread2 = new Thread24("Thread2", counter);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    // Here the output expected is 20000 but it may not be the case because of not thread safe
    System.out.println("Counter 7 final value: " + counter.getCount7());
  }

}
