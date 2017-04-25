package com.practice.threads.model;

public class Calculator {

  private Immutable value;

  public Calculator(){

  }

  public synchronized void setValue(Immutable value) {
    this.value=value;
  }

  public synchronized void addValues(int value) {
    this.value = this.value.addValue(value);
  }

  public synchronized int getValue() {
    return value.getValue();
  }

}
