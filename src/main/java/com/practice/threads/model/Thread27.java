package com.practice.threads.model;

public class Thread27 extends Thread {

  private final ProducerConsumer service;

  public Thread27(String name, ProducerConsumer service) {
    super(name);
    this.service = service;
  }

  @Override
  public void run() {
    service.consume();
  }

}
