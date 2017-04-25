package com.practice.threads.model;

public class Thread1 extends Thread {

  @Override
  public void run() {
    System.out.println("Inside the Thread1 Run method");
    System.out.println("Thread name: " + Thread.currentThread().getName());
    for (int i = 1; i <= 10; i++) {
      System.out.println("Inside the thread1:" + i);
    }

    System.out.println("Exiting the thread 1 run method");
  }

}
