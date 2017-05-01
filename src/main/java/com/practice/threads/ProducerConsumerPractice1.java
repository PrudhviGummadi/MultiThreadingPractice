package com.practice.threads;

import com.practice.threads.model.ProducerConsumer1;
import com.practice.threads.model.Thread28;
import com.practice.threads.model.Thread29;

public class ProducerConsumerPractice1 {

  public static void main(String[] args) {
    ProducerConsumer1 service = new ProducerConsumer1();

    Thread thread1 = new Thread29("Thread-1", service);
    Thread thread2 = new Thread28("Thread-2", service);

    thread2.start();
    thread1.start();

    System.out.println(Thread.currentThread().getName() + " thread completes execution");
  }

}
