package com.practice.threads;

import com.practice.threads.model.ProducerConsumer;
import com.practice.threads.model.Thread26;
import com.practice.threads.model.Thread27;

public class ProducerConsumerPractice {

  public static void main(String[] args) {
    ProducerConsumer service = new ProducerConsumer();

    Thread thread1 = new Thread26("Thread-1", service);
    Thread thread2 = new Thread27("Thread-2", service);

    thread1.start();
    thread2.start();

    System.out.println(Thread.currentThread().getName() + " thread completes execution");
  }

}
