package com.practice.threads;

import com.practice.threads.model.SynchronizedMethodSolution2;
import com.practice.threads.model.Thread14;
import com.practice.threads.model.Thread15;

public class ThreadPractice10 {

  public static void main(String[] args) throws InterruptedException {
    SynchronizedMethodSolution2 solution2 = new SynchronizedMethodSolution2();

    Thread thread1 = new Thread14(solution2);
    Thread thread2 = new Thread15(solution2);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println("list1 size: " + solution2.getList1().size());
    System.out.println("list2 size: " + solution2.getList2().size());

  }

}
