package com.practice.threads.model;

public class Thread7 extends Thread {

  private final Calculator calculator;

  public Thread7(Calculator calculator) {
    super();
    this.calculator = calculator;
  }

  @Override
  public void run() {
      System.out.println("Inside the thread 7 run method");
      calculator.setValue(new Immutable(10));
      for (int i = 1; i <= 10; i++) {
        calculator.addValues(10);
      }
      System.out.println(calculator.getValue());

  }

}
