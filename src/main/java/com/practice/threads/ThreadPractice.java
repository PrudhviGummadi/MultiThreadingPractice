package com.practice.threads;

import com.practice.threads.model.Thread1;
import com.practice.threads.model.Thread2;

public class ThreadPractice {

  /**
   * Testing the different types of thread creation
   *
   * If we call start method more than Once we will IllegalThreadStateException
   *
   */
  public static void main(String[] args) {

    // create thread by creating an object of class which extends Thread class
    Thread thread1 = new Thread1();
    thread1.start();

    // create thread by passing an object of a class which implements the Runnable interface to the Thread
    // class constructor
    Thread thread2 = new Thread(new Thread2());
    thread2.start();

    // creating the thread by implementing the Runnable class as anonymous inner classs
    Thread thread3=new Thread(new Runnable() {

      @Override
      public void run() {
        System.out.println("Inside the Thread3 run method");
        System.out.println("Thread name:"+Thread.currentThread().getName());

        for (int i = 21; i <= 30; i++) {
          System.out.println("Inside the Thread 3:" + i);
        }
      }
    });
    thread3.start();

    // creating the thread similar to above but by using java 8 lambda expression
    Thread thread4 = new Thread(() -> {
      for (int i = 31; i <= 40; i++) {
        System.out.println("Inside the Thread 4:" + i);
      }
    });
    thread4.start();


  }
}
