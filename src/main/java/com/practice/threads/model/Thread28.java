package com.practice.threads.model;

public class Thread28 extends Thread {

  private final ProducerConsumer1 service;

  public Thread28(String name, ProducerConsumer1 service) {
    super(name);
    this.service = service;
  }

  @Override
  public void run() {
    service.consume();
  }

}
