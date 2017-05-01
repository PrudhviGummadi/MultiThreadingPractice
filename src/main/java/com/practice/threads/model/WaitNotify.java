package com.practice.threads.model;

public class WaitNotify {

  public void produce() {
    synchronized (this) {
      try {
        System.out.println(Thread.currentThread().getName() + " produce method running");
        wait();
        System.out.println(Thread.currentThread().getName() + " produce method completed");
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }

  public void consume() {
    try {
      Thread.sleep(1000 * 2);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    synchronized (this) {
      System.out.println(Thread.currentThread().getName() + " consume() method running");
      System.out.println(Thread.currentThread().getName() + " consume() method completed");
      notify();
    }
  }

}
