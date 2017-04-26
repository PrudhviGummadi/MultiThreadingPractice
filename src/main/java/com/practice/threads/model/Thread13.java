package com.practice.threads.model;

public class Thread13 extends Thread {

  private final SynchronizedMethodSolution1 solution1;

  public Thread13(SynchronizedMethodSolution1 solution1) {
    this.solution1 = solution1;
  }

  @Override
  public void run() {
    solution1.method2();
  }

}
