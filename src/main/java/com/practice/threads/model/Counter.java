package com.practice.threads.model;

public class Counter {

  private int count1 = 0;
  private int count2 = 0;
  private static int count3 = 0;
  private static int count4 = 0;
  private static int count5 = 0;
  private int count6 = 0;

  public void increment1(){
    System.out.println("First");
    for (int i = 1; i <= 10000; i++) {
      count1++;
    }
    System.out.println("Exit");
  }

  public synchronized void increment2() throws InterruptedException {
    count2++;
  }

  public static void increment3() {
    System.out.println("Third");
    for (int i = 1; i <= 10000; i++) {
      count3++;
    }
    System.out.println("Exit");
  }

  public static synchronized void increment4() {
    System.out.println("Fourth");
    for (int i = 1; i <= 10000; i++) {
      count4++;
    }
    System.out.println("Exit");
  }

  // there is no guarantee that all the instructions in the below method will be executed at the same order
  // with order thread disturbing this flow.
  // For example lets say thread1 executed the sysout line immediately after that system allocated resource to
  // thread2 but thread 2 can't access below method but it can access any other method in this class
  public static synchronized void increment5() {
    System.out.println("Fifth");
    for (int i = 1; i <= 10000; i++) {
      count5++;
    }
    System.out.println("Exit");
  }

  public void increment6() {

    synchronized (this) {
      System.out.println("Sixth");
      for (int i = 1; i <= 10000; i++) {
        count6++;
      }
      System.out.println("Exit");
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

  public int getCount6() {
    return count6;
  }

  public void setCount6(int count6) {
    this.count6 = count6;
  }

}
