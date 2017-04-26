package com.practice.threads.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SynchronizedMethodSolution2 {

  private final Random random = new Random();

  private List<Integer> list1 = new ArrayList<>();

  private List<Integer> list2 = new ArrayList<>();

  private final Object lock1 = new Object();

  private final Object lock2 = new Object();

  public void method1() {
    synchronized (lock1) {

      for (int i = 1; i <= 1000; i++) {
        System.out.println("Method1");
        list1.add(random.nextInt());
        System.out.println("Exit");
      }

    }
  }

  public void method2() {
    synchronized (lock2) {

      for (int i = 1; i <= 1000; i++) {
        System.out.println("Method2");
        list2.add(random.nextInt());
        System.out.println("Exit");
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
