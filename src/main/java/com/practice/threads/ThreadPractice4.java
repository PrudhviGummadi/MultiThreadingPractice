package com.practice.threads;

import com.practice.threads.model.Counter;
import com.practice.threads.model.Thread5;

public class ThreadPractice4 {

  /**
   * What is Race Conditions and Critical Sections?<br>
   * A race condition is a special condition that may occur inside a critical section.<br>
   * A critical section is a section of code that is executed by multiple threads and where the sequence of
   * execution for the threads makes a difference in the result of the concurrent execution of the critical
   * section.<br>
   * When the result of multiple threads executing a critical section may differ depending on the sequence in
   * which the threads execute, the critical section is said to contain a race condition. <br>
   * The term race condition stems from the metaphor that the threads are racing through the critical section,
   * and that the result of that race impacts the result of executing the critical section.<br>
   *
   * Synchronized testing<br>
   * 1. Counter class has 2 variables - count1, count2<br>
   * 2. count1 will be incremented using non-synchronized method<br>
   * 3 count2 will be incremented using synchronized method<br>
   * <br>
   *
   * <a href="http://tutorials.jenkov.com/java-concurrency/race-conditions-and-critical-sections.html" target=
   * "_blank">Reference</a>
   *
   * @throws InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {

    Counter counter = new Counter();

    Thread thread1 = new Thread5(counter);
    Thread thread2 = new Thread5(counter);
    Thread thread3 = new Thread5(counter);

    thread1.start();
    thread2.start();
    thread3.start();

    thread1.join();
    thread2.join();
    thread3.join();

    System.out.println(counter.getCount1());
    System.out.println(counter.getCount2());

  }

}
