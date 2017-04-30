package com.practice.threads.model;

public class Thread16 extends Thread {

  public Thread16(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println("Inside " + currentThread().getName() + " run method");
    try {
      System.out.println(currentThread().getName() + " is sleeping");
      currentThread().sleep(2000);
      System.out.println(currentThread().getName() + "  wakeup from sleeep");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
