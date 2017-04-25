package com.practice.threads.model;

public class Thread6 extends Thread {

  private final Calculator calculator;

  public Thread6(Calculator calculator) {
    super();
    this.calculator=calculator;
  }

  @Override
  public void run() {
      System.out.println("Inside the Thread 6 run method");
      calculator.setValue(new Immutable(15));
      for (int i = 1; i <= 10; i++) {
        calculator.addValues(10);
      }
      System.out.println(calculator.getValue());
  }



}
