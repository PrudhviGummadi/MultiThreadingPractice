package com.practice.threads;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class ThreadSleepPractice2 {

  /**
   * To sleep the current thread we can use java.util.concurrent.TimeUnit as below
   *
   * @throws InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {
    LocalTime startTime = LocalTime.now();

    System.out.println(Thread.currentThread().getName() + " going to sleep");
    TimeUnit.SECONDS.sleep(2);

    LocalTime endTime = LocalTime.now();
    System.out.println(Thread.currentThread().getName() + " woke up from sleep");

    System.out.println("Time difference: " + Duration.between(startTime, endTime).getSeconds());
  }

}
