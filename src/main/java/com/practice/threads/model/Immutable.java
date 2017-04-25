package com.practice.threads.model;

public class Immutable {

  private final int value;

  public Immutable(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public Immutable addValue(int value) {
    return new Immutable(value + this.value);
  }

}
