package com.practice.threads.model;

public class Thread14 extends Thread {

  private final SynchronizedMethodSolution2 solution2;

  public Thread14(SynchronizedMethodSolution2 solution2) {
    this.solution2 = solution2;
  }

  @Override
  public void run() {
    solution2.method1();
  }

}
