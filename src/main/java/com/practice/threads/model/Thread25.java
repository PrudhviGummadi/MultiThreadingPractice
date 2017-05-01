package com.practice.threads.model;

public class Thread25 extends Thread {

  private final Counter counter;

  public Thread25(String name, Counter counter) {
    super(name);
    this.counter = counter;
  }

  @Override
  public void run() {
    counter.increment7();

    counter.increment8();
  }

}
