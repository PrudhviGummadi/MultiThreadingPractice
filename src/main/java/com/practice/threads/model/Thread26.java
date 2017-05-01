package com.practice.threads.model;

public class Thread26 extends Thread {

  private final ProducerConsumer service;

  public Thread26(String name, ProducerConsumer service) {
    super(name);
    this.service = service;
  }

  @Override
  public void run() {
    service.produce();
  }

}
