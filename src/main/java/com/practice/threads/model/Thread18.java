package com.practice.threads.model;

public class Thread18 extends Thread {

  public Thread18(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println("Inside " + currentThread().getName() + " run method");
    System.out.println(currentThread().getName() + " is sleeping");
    System.out.println(currentThread().getName() + "  wakeup from sleeep");

  }

}
