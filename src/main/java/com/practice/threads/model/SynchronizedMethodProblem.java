package com.practice.threads.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SynchronizedMethodProblem {

  public Random random = new Random();

  private final List<Integer> list1 = new ArrayList<>();
  private final List<Integer> list2 = new ArrayList<>();

  public synchronized void method1(){
    try {
      Thread.sleep(1);
      for (int i = 0; i <= 200; i++) {
        System.out.println("Method1");
        list1.add(random.nextInt());
        System.out.println("Exit");
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }

  public synchronized void method2() {
    try {
      Thread.sleep(1);
      for (int i = 0; i <= 200; i++) {
        System.out.println("Method2");
        list2.add(random.nextInt());
        System.out.println("Exit");
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }

  public List<Integer> getList1() {
    return list1;
  }

  public List<Integer> getList2() {
    return list2;
  }

}
