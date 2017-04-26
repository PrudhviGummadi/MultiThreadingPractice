package com.practice.threads;

import com.practice.threads.model.SynchronizedMethodSolution1;
import com.practice.threads.model.Thread12;
import com.practice.threads.model.Thread13;

public class ThreadPractice9 {

  /****
   *
   * One type of solution to thread synchronization method problem shown in the ThreadPractice8 example
   *
   * @throws InterruptedException
   *
   */
  public static void main(String[] args) throws InterruptedException {

    SynchronizedMethodSolution1 solution1 = new SynchronizedMethodSolution1();

    Thread thread1 = new Thread12(solution1);
    Thread thread2 = new Thread13(solution1);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println("List 1 size" + solution1.getList1().size());
    System.out.println("List 2 size" + solution1.getList2().size());

  }

}
