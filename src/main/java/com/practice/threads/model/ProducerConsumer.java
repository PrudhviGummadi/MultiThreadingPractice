package com.practice.threads.model;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer extends Thread {

  private final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);

  public void produce(){
    while (true) {
      System.out.println(Thread.currentThread().getName() + " inside produce() method");
      Random random=new Random();
      try {
        int value = random.nextInt();
        System.out.println("Value stored in  queue:" + value);
        queue.put(value);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void consume() {
    while(true){
      System.out.println(Thread.currentThread().getName() + " inside consume() method");
      try {
        Integer i = queue.take();
        System.out.println("Value taken from queue:" + i);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
