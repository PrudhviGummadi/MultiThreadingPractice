package com.practice.threads.model;

public class Counter {

  private int count1 = 0;
  private int count2 = 0;
  private static int count3 = 0;
  private static int count4 = 0;
  private static int count5 = 0;

  public void increment1(){
    count1++;
  }

  public synchronized void increment2() throws InterruptedException {
    count2++;
  }

  public static void increment3() {
    for (int i = 1; i <= 10000; i++) {
      System.out.println("Thread name:" + Thread.currentThread().getName());
      count3++;
    }
  }

  public static synchronized void increment4() {
    for (int i = 1; i <= 10000; i++) {
      System.out.println("Thread name:" + Thread.currentThread().getName());
      count4++;
    }
  }

  public static synchronized void increment5() {
    for (int i = 1; i <= 10000; i++) {
      System.out.println("Thread name:" + Thread.currentThread().getName());
      count5++;
    }
  }

  public int getCount1() {
    return count1;
  }

  public void setCount1(int count1) {
    this.count1 = count1;
  }

  public int getCount2() {
    return count2;
  }

  public void setCount2(int count2) {
    this.count2 = count2;
  }

  public static int getCount3() {
    return count3;
  }

  public static void setCount3(int count3) {
    Counter.count3 = count3;
  }

  public static int getCount4() {
    return count4;
  }

  public static void setCount4(int count4) {
    Counter.count4 = count4;
  }

  public static int getCount5() {
    return count5;
  }

  public static void setCount5(int count5) {
    Counter.count5 = count5;
  }

}
