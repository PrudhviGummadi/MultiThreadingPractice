package com.practice.threads.model;

public class Thread8 extends Thread {

  public Thread8() {
    super();
  }

  @Override
  public void run() {
    Counter.increment3();

    Counter.increment4();

    Counter.increment5();

  }

}
