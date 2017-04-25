package com.practice.threads;

import com.practice.threads.model.Counter;
import com.practice.threads.model.Thread8;

public class ThreadPractice6 {

  /**
   * synchronized static method<br>
   * Synchronized static methods are synchronized on the class object of the class the synchronized static
   * method belongs to.<br>
   * Since only one class object exists in the Java VM per class, only one thread can execute inside a static
   * synchronized method in the same class.<br>
   * If the static synchronized methods are located in different classes, then one thread can execute inside
   * the static synchronized methods of each class. <br>
   * One thread per class regardless of which static synchronized method it calls<br>
   * <br>
   *
   * @throws InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {

    Thread thread1 = new Thread8();
    Thread thread2 = new Thread8();
    Thread thread3 = new Thread8();
    Thread thread4 = new Thread8();

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();

    thread1.join();
    thread2.join();
    thread3.join();
    thread4.join();

    System.out.println("Counter 3:" + Counter.getCount3());
    System.out.println("Counter 4:" + Counter.getCount4());
    System.out.println("Counter 5:" + Counter.getCount5());

  }

}
