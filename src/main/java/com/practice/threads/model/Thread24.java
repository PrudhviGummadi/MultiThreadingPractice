package com.practice.threads.model;

public class Thread24 extends Thread {

  private final Counter counter;

  public Thread24(String name, Counter counter) {
    super(name);
    this.counter = counter;
  }

  @Override
  public void run() {
    counter.increment7();
  }

}
