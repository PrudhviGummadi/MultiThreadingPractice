package com.practice.threads.model;

public class Thread11 extends Thread {
  private final SynchronizedMethodProblem problem;

  public Thread11(SynchronizedMethodProblem problem) {
    this.problem = problem;
  }

  @Override
  public void run() {

      problem.method2();

  }
}
