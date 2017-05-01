package com.practice.threads.model;

import java.util.concurrent.TimeUnit;

public class Thread20 implements Runnable {

  private final String command;

  public Thread20(String command){
    this.command=command;
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " command is " + command + " before sleep");
    try {
      TimeUnit.SECONDS.sleep(1);
      System.out.println(Thread.currentThread().getName() + " command is " + command + " after sleep");
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }

  }

}
