package com.practice.threads;

import com.practice.threads.model.Counter;
import com.practice.threads.model.Thread9;

public class ThreadPractice7 {
  /**
   * Method to practice the synchronized block code examples
   *
   * @throws InterruptedException
   *
   */
  public static void main(String[] args) throws InterruptedException {

    Counter counter = new Counter();

    Thread thread1 = new Thread9(counter);
    Thread thread2 = new Thread9(counter);
    Thread thread3 = new Thread9(counter);

    thread1.start();
    thread2.start();
    thread3.start();

    thread1.join();
    thread2.join();
    thread3.join();

    System.out.println("Count 1:" + counter.getCount1());
    System.out.println("Count 5:" + Counter.getCount5());
    System.out.println("Count 6:" + counter.getCount6());

  }

}
