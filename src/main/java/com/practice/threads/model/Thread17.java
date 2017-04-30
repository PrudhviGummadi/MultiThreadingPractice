package com.practice.threads.model;

public class Thread17 extends Thread {

  private final Object lock;

  public Thread17(String name, Object lock) {
    super(name);
    this.lock = lock;
  }

  @Override
  public void run() {
    synchronized (lock) {
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

}
