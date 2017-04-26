package com.practice.threads;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalTime;

import com.practice.threads.model.SynchronizedMethodProblem;
import com.practice.threads.model.Thread10;
import com.practice.threads.model.Thread11;

public class ThreadPractice8 {

  /**
   *
   * 1. Two threads are operating on 2 separate variables in a common object in 2 different methods. 2. If we
   * declare both methods (not static methods ) synchronized then 2 threads will execute in a sequence instead
   * of parallel
   *
   * @throws InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {
    SynchronizedMethodProblem problem = new SynchronizedMethodProblem();

    Thread thread1 = new Thread10(problem);
    Thread thread2 = new Thread11(problem);

    LocalTime startTime = LocalTime.now(Clock.systemDefaultZone());

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    LocalTime endTime = LocalTime.now(Clock.systemDefaultZone());
    System.out.println("duration: " + Duration.between(startTime, endTime).getSeconds());
    System.out.println("list1.size(): " + problem.getList1().size() + ", list2.size(): " + problem.getList2().size());

  }




}
