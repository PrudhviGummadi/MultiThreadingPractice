package com.practice.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.practice.threads.model.CountDownLatchThread;

public class ThreadCountDownLatchPractice {

  public static void main(String[] args) throws InterruptedException {
    // create the count down latch with init value as 3
    final CountDownLatch latch = new CountDownLatch(3);

    // Created the thread pool of size 3 which is equal to init value in this example
    ExecutorService service = Executors.newFixedThreadPool(3);

    // creating the jobs and submitting to the executor service
    for (int i = 1; i <= 3; i++) {
      service.submit(new CountDownLatchThread("Thread-" + i, latch));
    }

    // shutdown the executor service which means it no longer accepts any new jobs.
    service.shutdown();

    System.out.println(Thread.currentThread().getName() + " is going to wait until the other 3 thread completes");

    // wait until countdowm latches 0
    latch.await();

    System.out.println(Thread.currentThread().getName() + " thread completes");

  }

}
