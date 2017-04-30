package com.practice.threads;

import com.practice.threads.model.Thread19;

public class ThreadLocalPractice {

  public static void main(String[] args) {

    Thread19 thread = new Thread19();

    Thread thread1 = new Thread(thread, "First Thread");
    Thread thread2 = new Thread(thread, "Second Thread");

    thread1.start();
    thread2.start();
  }

}
