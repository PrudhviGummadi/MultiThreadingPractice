package com.practice.threads.model;

public class Thread4 extends Thread {

  public Thread4() {
    super();
    System.out.println("Inside the Default Constructor");
  }

  public Thread4(String name) {
    super(name);
    System.out.println("Inside the Parameterized Constructore with name:" + name);
  }

  @Override
  public void run() {
    Thread currentThread = currentThread();
    System.out.println("Inside the " + currentThread.getName() + " run method");
    System.out.println("Thread Id: " + currentThread.getId());
    System.out.println("Current thread is daemon :" + currentThread.isDaemon());
    System.out.println("Current thread is alive :" + currentThread.isAlive());
    System.out.println("Is interrupted: " + currentThread.isInterrupted());
    System.out.println("Priority of Thread: " + currentThread.getPriority());
    System.out.println("current Thread stack trace:" + currentThread.getStackTrace());

    State state = currentThread.getState();
    System.out.println("Current Thread state:" + state);

    ThreadGroup threadGroup = currentThread.getThreadGroup();
    System.out.println("Thread group parent: " + threadGroup.getParent().getName());
    System.out.println("No of threads in thread group" + threadGroup.activeCount());
    System.out.println("Thread group is deamon:  " + threadGroup.isDaemon());

  }

}
