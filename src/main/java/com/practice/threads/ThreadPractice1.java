package com.practice.threads;

import com.practice.threads.model.Thread1;
import com.practice.threads.model.Thread3;

public class ThreadPractice1 {

  /**
   * Set name to threads
   *
   * @param args
   */
  public static void main(String[] args) {
    // setting the name to thread
    Thread thread1 = new Thread1();
    thread1.setName("First Thread");
    thread1.start();

    Thread thread3 = new Thread3("Third Thread");
    thread3.start();

    Thread thread4 = new Thread(() -> {
      System.out.println("Inside the run method");
      for (int i = 31; i <= 40; i++) {
        System.out.println("Inside the " + Thread.currentThread().getName() + " thread run method and loop index:" + i);
      }
    } , "Fourth Thread");
    thread4.start();

    for (int i = 21; i <= 30; i++) {
      System.out.println("Inside the " + Thread.currentThread().getName() + " thread run method and loop index:" + i);
    }

  }

}
