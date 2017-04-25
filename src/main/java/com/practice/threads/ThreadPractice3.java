package com.practice.threads;

import com.practice.threads.model.Thread4;

public class ThreadPractice3 {

  /***
   * Get the currently executing thread info
   */
  public static void main(String[] args) {
    Thread thread3 = new Thread4("Fourth thread");
    thread3.setDaemon(false);
    thread3.start();
  }

}
