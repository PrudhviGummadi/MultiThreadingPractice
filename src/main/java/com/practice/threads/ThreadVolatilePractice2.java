package com.practice.threads;

import com.practice.threads.model.Counter;
import com.practice.threads.model.Thread25;

public class ThreadVolatilePractice2 {

  /**
   *
   * using volatile keyword with synchronized block will guarantee the thread safety as shown below. Compare
   * the counter 7 and counter 8 variables value.
   *
   * @param args
   * @throws InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();

    Thread thread1 = new Thread25("Thread1", counter);
    Thread thread2 = new Thread25("Thread1", counter);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    // Here the output expected is 20000 but it may not be the case because of not thread safe
    System.out.println("Counter 7 final value: " + counter.getCount7());

    // Here counter 8 value will always be 20000
    System.out.println("Counter 8 final value: " + counter.getCount8());

  }

}
