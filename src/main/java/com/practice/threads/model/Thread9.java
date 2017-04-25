package com.practice.threads.model;

public class Thread9 extends Thread {

  private final Counter counter;

  public Thread9(Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run() {
    // synchronized block
    counter.increment6();

    // static synchronized method
    Counter.increment5();

    // without synchronized block
    counter.increment1();
  }
}
