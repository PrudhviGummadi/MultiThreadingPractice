package com.practice.threads.model;

public class Thread29 extends Thread {

  private final ProducerConsumer1 service;

  public Thread29(String name, ProducerConsumer1 service) {
    super(name);
    this.service = service;
  }

  @Override
  public void run() {
    service.produce();
  }

}
