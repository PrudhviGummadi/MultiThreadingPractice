package com.practice.threads.model;

public class Thread2 implements Runnable {

  @Override
  public void run() {
    System.out.println("Inside the Thread2 Run method");
    System.out.println("Thread name: " + Thread.currentThread().getName());
    for (int i = 11; i <= 20; i++) {
      System.out.println("Inside the thread2: " + i);
    }
  }

}
