package com.practice.threads.model;

public class Thread3 extends Thread {

  public Thread3() {
    super();
    System.out.println("Inside Default Constructor");
  }

  public Thread3(String name) {
    super(name);
    System.out.println("Inside the parameterized constructor and name: " + name);
  }

  @Override
  public void run() {
    System.out.println("Inside the thread3 run method");
    for (int i = 11; i <= 20; i++) {
      System.out.println("Inside the "+Thread.currentThread().getName()+" run method and loop index:"+i);
    }
  }



}
