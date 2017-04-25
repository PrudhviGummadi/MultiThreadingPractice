package com.practice.threads;

import com.practice.threads.model.Calculator;
import com.practice.threads.model.Immutable;
import com.practice.threads.model.Thread6;
import com.practice.threads.model.Thread7;

public class ThreadPractice5 {

  /***
   * Method to test whether the reference objects are thread safe or not
   *
   * @param args
   * @throws InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {
    Immutable immutable = new Immutable(5);

    Calculator calculator = new Calculator();
    calculator.setValue(immutable);

    Thread thread1 = new Thread6(calculator);
    Thread thread2 = new Thread7(calculator);
    Thread thread3 = new Thread6(calculator);
    Thread thread4 = new Thread7(calculator);

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();

    thread1.join();
    thread2.join();
    thread3.join();
    thread4.join();


  }

}
