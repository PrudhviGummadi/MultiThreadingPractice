package com.practice.threads.model;

public class Thread5 extends Thread {
  private final Counter counter;

  public Thread5(Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run() {

    System.out.println("Inside the run method");

    for (int i = 0; i < 10000; i++) {
      counter.increment1();
    }

    for (int i = 0; i < 10000; i++) {
      try {
        counter.increment2();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }


  }

}
