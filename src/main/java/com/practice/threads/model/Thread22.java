package com.practice.threads.model;

public class Thread22 extends Thread {

  private final WaitNotify waitNotify;

  public Thread22(String name, WaitNotify waitNotify) {
    super(name);
    this.waitNotify = waitNotify;
  }

  @Override
  public void run() {
    waitNotify.consume();
  }

}
