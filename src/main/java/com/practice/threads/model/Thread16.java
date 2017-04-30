package com.practice.threads.model;

public class Thread16 extends Thread {

  private final long sleep;

  public Thread16(String name, long sleep) {
    super(name);
    this.sleep = sleep;
  }

  @Override
  public void run() {
    System.out.println("Inside " + currentThread().getName() + " run method");
    try {
      System.out.println(currentThread().getName() + " is sleeping");
      currentThread().sleep(sleep);
      System.out.println(currentThread().getName() + "  wakeup from sleeep");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
