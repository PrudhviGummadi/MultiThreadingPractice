package com.practice.threads.model;

public class Thread10 extends Thread {
  private final SynchronizedMethodProblem problem;

  public Thread10(SynchronizedMethodProblem problem) {
    this.problem=problem;
  }

  @Override
  public void run() {


    problem.method1();

  }
}
