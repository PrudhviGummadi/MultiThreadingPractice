package com.practice.threads.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Here the lock won't be acquired on the object. So both the methods can be executed parallel.
public class SynchronizedMethodSolution1 {

  private final Random random = new Random();

  private List<Integer> list1 = new ArrayList<>();

  private List<Integer> list2 = new ArrayList<>();

  private final Object lock1 = new Object();

  private final Object lock2 = new Object();


  public void method1() {

    synchronized (lock1) {
      try {
        Thread.sleep(1);
        for (int i = 1; i <= 1000; i++) {
          System.out.println("Method1");
          list1.add(random.nextInt());
          System.out.println("Exit");
        }

      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }

  public void method2() {
    synchronized (lock2) {
      try {
        Thread.sleep(1);
        for (int i = 1; i <= 1000; i++) {
          System.out.println("Method2");
          list2.add(random.nextInt());
          System.out.println("Exit");
        }
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }

  public List<Integer> getList1() {
    return list1;
  }

  public void setList1(List<Integer> list1) {
    this.list1 = list1;
  }

  public List<Integer> getList2() {
    return list2;
  }

  public void setList2(List<Integer> list2) {
    this.list2 = list2;
  }

}
