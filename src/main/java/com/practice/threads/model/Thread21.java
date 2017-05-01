package com.practice.threads.model;

public class Thread21 extends Thread {

  private final WaitNotify waitNotify;

  public Thread21(String name, WaitNotify waitNotify) {
    super(name);
    this.waitNotify = waitNotify;
  }

  @Override
  public void run() {
    waitNotify.produce();
  }

}
