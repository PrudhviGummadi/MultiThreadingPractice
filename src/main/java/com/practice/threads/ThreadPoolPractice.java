package com.practice.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.practice.threads.model.Thread20;

public class ThreadPoolPractice {

  public static void main(String[] args) throws InterruptedException {
    ExecutorService service = Executors.newFixedThreadPool(5);

    // given 10 tasks to 5 threads. So only existing 5 threads will be used to execute these tasks
    for(int i=1;i<=10;i++){
      service.submit(new Thread20(String.valueOf(i)));
    }

    System.out.println("---- All tasks submitted ---");

    // tell executor service to submit all tasks and do not accept any thread into pool after this point
    service.shutdown();

    // wait until all tasks are completed. This should be called only after executorService.shutdown()
    service.awaitTermination(3, TimeUnit.HOURS);

    System.out.println("---- All tasks completed ---");

  }

}
